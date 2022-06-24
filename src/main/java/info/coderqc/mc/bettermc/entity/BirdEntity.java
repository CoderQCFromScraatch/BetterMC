
package info.coderqc.mc.bettermc.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BirdEntity extends PathfinderMob {

	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"),
			new ResourceLocation("dark_forest"), new ResourceLocation("plains"), new ResourceLocation("beach"), new ResourceLocation("birch_forest"),
			new ResourceLocation("swamp"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.AMBIENT).add(new MobSpawnSettings.SpawnerData(BettermcModEntities.BIRD.get(), 20, 1, 2));
	}

	public BirdEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(BettermcModEntities.BIRD.get(), world);
	}

	public BirdEntity(EntityType<BirdEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, TropicalFish.class, true, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Spider.class, true, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ThrownEgg.class, true, false));
		this.goalSelector.addGoal(5, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (BirdEntity.this.getTarget() != null && !BirdEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return BirdEntity.this.getMoveControl().hasWanted() && BirdEntity.this.getTarget() != null && BirdEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = BirdEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				BirdEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = BirdEntity.this.getTarget();
				if (BirdEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					BirdEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = BirdEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						BirdEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
					}
				}
			}
		});
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 0.75, 20) {

			@Override
			protected Vec3 getPosition() {
				Random random = BirdEntity.this.getRandom();
				double dir_x = BirdEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = BirdEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = BirdEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
		this.goalSelector.addGoal(10, new LeapAtTargetGoal(this, (float) 0.5));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getPassengersRidingOffset() {
		return super.getPassengersRidingOffset() + 0.7999999999999999;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.parrot.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.parrot.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.parrot.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {

		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());

		super.mobInteract(sourceentity, hand);

		sourceentity.startRiding(this);

		return retval;
	}

	@Override
	public void travel(Vec3 dir) {
		Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
		if (this.isVehicle()) {
			this.setYRot(entity.getYRot());
			this.yRotO = this.getYRot();
			this.setXRot(entity.getXRot() * 0.5F);
			this.setRot(this.getYRot(), this.getXRot());
			this.flyingSpeed = this.getSpeed() * 0.15F;
			this.yBodyRot = entity.getYRot();
			this.yHeadRot = entity.getYRot();
			this.maxUpStep = 1.0F;

			if (entity instanceof LivingEntity passenger) {
				this.setSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));

				float forward = passenger.zza;

				float strafe = passenger.xxa;

				super.travel(new Vec3(strafe, 0, forward));
			}

			this.animationSpeedOld = this.animationSpeed;
			double d1 = this.getX() - this.xo;
			double d0 = this.getZ() - this.zo;
			float f1 = (float) Math.sqrt(d1 * d1 + d0 * d0) * 4;
			if (f1 > 1.0F)
				f1 = 1.0F;
			this.animationSpeed += (f1 - this.animationSpeed) * 0.4F;
			this.animationPosition += this.animationSpeed;
			return;
		}
		this.maxUpStep = 0.5F;
		this.flyingSpeed = 0.02F;

		super.travel(dir);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();

		this.setNoGravity(true);

	}

	public static void init() {
		SpawnPlacements.register(BettermcModEntities.BIRD.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				Mob::checkMobSpawnRules);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.7000000000000001);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);

		builder = builder.add(Attributes.FLYING_SPEED, 0.7000000000000001);

		return builder;
	}

}

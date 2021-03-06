
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import info.coderqc.mc.bettermc.world.features.plants.GeraniumFeature;
import info.coderqc.mc.bettermc.world.features.ores.RockFeature;
import info.coderqc.mc.bettermc.world.features.ores.PlatinumOreFeature;
import info.coderqc.mc.bettermc.world.features.ores.AmberOreFeature;
import info.coderqc.mc.bettermc.world.features.lakes.AcidFeature;
import info.coderqc.mc.bettermc.world.features.DouglasFirTreeFeature;
import info.coderqc.mc.bettermc.world.features.BaobabTreeFeature;
import info.coderqc.mc.bettermc.BettermcMod;

@Mod.EventBusSubscriber
public class BettermcModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BettermcMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> DOUGLAS_FIR_TREE = register("douglas_fir_tree", DouglasFirTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, DouglasFirTreeFeature.GENERATE_BIOMES,
					DouglasFirTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BAOBAB_TREE = register("baobab_tree", BaobabTreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BaobabTreeFeature.GENERATE_BIOMES, BaobabTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AMBER_ORE = register("amber_ore", AmberOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AmberOreFeature.GENERATE_BIOMES, AmberOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROCK = register("rock", RockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RockFeature.GENERATE_BIOMES, RockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ACID = register("acid", AcidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, AcidFeature.GENERATE_BIOMES, AcidFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GERANIUM = register("geranium", GeraniumFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GeraniumFeature.GENERATE_BIOMES, GeraniumFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLATINUM_ORE = register("platinum_ore", PlatinumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, PlatinumOreFeature.GENERATE_BIOMES, PlatinumOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import info.coderqc.mc.bettermc.block.WillowWoodBlock;
import info.coderqc.mc.bettermc.block.WillowStairsBlock;
import info.coderqc.mc.bettermc.block.WillowSlabBlock;
import info.coderqc.mc.bettermc.block.WillowPressurePlateBlock;
import info.coderqc.mc.bettermc.block.WillowPlanksBlock;
import info.coderqc.mc.bettermc.block.WillowLogBlock;
import info.coderqc.mc.bettermc.block.WillowLeavesBlock;
import info.coderqc.mc.bettermc.block.WillowFenceGateBlock;
import info.coderqc.mc.bettermc.block.WillowFenceBlock;
import info.coderqc.mc.bettermc.block.WillowButtonBlock;
import info.coderqc.mc.bettermc.block.VerticalWillowSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalWarpedSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalTintedSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalSpruceSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalRustedSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalOakSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalJungleSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalEucalyptusSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalDouglasFirSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalDarkoakSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalCrimsonSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalBirchSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalBaobabSlabBlock;
import info.coderqc.mc.bettermc.block.VerticalAcaciaSlabBlock;
import info.coderqc.mc.bettermc.block.TintedWoodBlock;
import info.coderqc.mc.bettermc.block.TintedStairsBlock;
import info.coderqc.mc.bettermc.block.TintedSlabBlock;
import info.coderqc.mc.bettermc.block.TintedPressurePlateBlock;
import info.coderqc.mc.bettermc.block.TintedPlanksBlock;
import info.coderqc.mc.bettermc.block.TintedLogBlock;
import info.coderqc.mc.bettermc.block.TintedLeavesBlock;
import info.coderqc.mc.bettermc.block.TintedFenceGateBlock;
import info.coderqc.mc.bettermc.block.TintedFenceBlock;
import info.coderqc.mc.bettermc.block.TintedButtonBlock;
import info.coderqc.mc.bettermc.block.RustedWoodBlock;
import info.coderqc.mc.bettermc.block.RustedStairsBlock;
import info.coderqc.mc.bettermc.block.RustedSlabBlock;
import info.coderqc.mc.bettermc.block.RustedPressurePlateBlock;
import info.coderqc.mc.bettermc.block.RustedPlanksBlock;
import info.coderqc.mc.bettermc.block.RustedLogBlock;
import info.coderqc.mc.bettermc.block.RustedLeavesBlock;
import info.coderqc.mc.bettermc.block.RustedFenceGateBlock;
import info.coderqc.mc.bettermc.block.RustedFenceBlock;
import info.coderqc.mc.bettermc.block.RustedButtonBlock;
import info.coderqc.mc.bettermc.block.RockBlock;
import info.coderqc.mc.bettermc.block.PlatinumOreBlock;
import info.coderqc.mc.bettermc.block.PlatinumBlockBlock;
import info.coderqc.mc.bettermc.block.MilkBlock;
import info.coderqc.mc.bettermc.block.GeraniumBlock;
import info.coderqc.mc.bettermc.block.EucalyptusWoodBlock;
import info.coderqc.mc.bettermc.block.EucalyptusStairsBlock;
import info.coderqc.mc.bettermc.block.EucalyptusSlabBlock;
import info.coderqc.mc.bettermc.block.EucalyptusPressurePlateBlock;
import info.coderqc.mc.bettermc.block.EucalyptusPlanksBlock;
import info.coderqc.mc.bettermc.block.EucalyptusLogBlock;
import info.coderqc.mc.bettermc.block.EucalyptusLeavesBlock;
import info.coderqc.mc.bettermc.block.EucalyptusFenceGateBlock;
import info.coderqc.mc.bettermc.block.EucalyptusFenceBlock;
import info.coderqc.mc.bettermc.block.EucalyptusButtonBlock;
import info.coderqc.mc.bettermc.block.DouglasFirWoodBlock;
import info.coderqc.mc.bettermc.block.DouglasFirStairsBlock;
import info.coderqc.mc.bettermc.block.DouglasFirSlabBlock;
import info.coderqc.mc.bettermc.block.DouglasFirPressurePlateBlock;
import info.coderqc.mc.bettermc.block.DouglasFirPlanksBlock;
import info.coderqc.mc.bettermc.block.DouglasFirLogBlock;
import info.coderqc.mc.bettermc.block.DouglasFirLeavesBlock;
import info.coderqc.mc.bettermc.block.DouglasFirFenceGateBlock;
import info.coderqc.mc.bettermc.block.DouglasFirFenceBlock;
import info.coderqc.mc.bettermc.block.DouglasFirButtonBlock;
import info.coderqc.mc.bettermc.block.BaobabWoodBlock;
import info.coderqc.mc.bettermc.block.BaobabStairsBlock;
import info.coderqc.mc.bettermc.block.BaobabSlabBlock;
import info.coderqc.mc.bettermc.block.BaobabPressurePlateBlock;
import info.coderqc.mc.bettermc.block.BaobabPlanksBlock;
import info.coderqc.mc.bettermc.block.BaobabLogBlock;
import info.coderqc.mc.bettermc.block.BaobabLeavesBlock;
import info.coderqc.mc.bettermc.block.BaobabFenceGateBlock;
import info.coderqc.mc.bettermc.block.BaobabFenceBlock;
import info.coderqc.mc.bettermc.block.BaobabButtonBlock;
import info.coderqc.mc.bettermc.block.AmberOreBlock;
import info.coderqc.mc.bettermc.block.AmberBlockBlock;
import info.coderqc.mc.bettermc.block.AcidBlock;
import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BettermcMod.MODID);
	public static final RegistryObject<Block> EUCALYPTUS_WOOD = REGISTRY.register("eucalyptus_wood", () -> new EucalyptusWoodBlock());
	public static final RegistryObject<Block> EUCALYPTUS_LOG = REGISTRY.register("eucalyptus_log", () -> new EucalyptusLogBlock());
	public static final RegistryObject<Block> EUCALYPTUS_PLANKS = REGISTRY.register("eucalyptus_planks", () -> new EucalyptusPlanksBlock());
	public static final RegistryObject<Block> EUCALYPTUS_LEAVES = REGISTRY.register("eucalyptus_leaves", () -> new EucalyptusLeavesBlock());
	public static final RegistryObject<Block> EUCALYPTUS_STAIRS = REGISTRY.register("eucalyptus_stairs", () -> new EucalyptusStairsBlock());
	public static final RegistryObject<Block> EUCALYPTUS_SLAB = REGISTRY.register("eucalyptus_slab", () -> new EucalyptusSlabBlock());
	public static final RegistryObject<Block> EUCALYPTUS_FENCE = REGISTRY.register("eucalyptus_fence", () -> new EucalyptusFenceBlock());
	public static final RegistryObject<Block> EUCALYPTUS_FENCE_GATE = REGISTRY.register("eucalyptus_fence_gate",
			() -> new EucalyptusFenceGateBlock());
	public static final RegistryObject<Block> EUCALYPTUS_PRESSURE_PLATE = REGISTRY.register("eucalyptus_pressure_plate",
			() -> new EucalyptusPressurePlateBlock());
	public static final RegistryObject<Block> EUCALYPTUS_BUTTON = REGISTRY.register("eucalyptus_button", () -> new EucalyptusButtonBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_WOOD = REGISTRY.register("douglas_fir_wood", () -> new DouglasFirWoodBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_LOG = REGISTRY.register("douglas_fir_log", () -> new DouglasFirLogBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_PLANKS = REGISTRY.register("douglas_fir_planks", () -> new DouglasFirPlanksBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_LEAVES = REGISTRY.register("douglas_fir_leaves", () -> new DouglasFirLeavesBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_STAIRS = REGISTRY.register("douglas_fir_stairs", () -> new DouglasFirStairsBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_SLAB = REGISTRY.register("douglas_fir_slab", () -> new DouglasFirSlabBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_FENCE = REGISTRY.register("douglas_fir_fence", () -> new DouglasFirFenceBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_FENCE_GATE = REGISTRY.register("douglas_fir_fence_gate",
			() -> new DouglasFirFenceGateBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_PRESSURE_PLATE = REGISTRY.register("douglas_fir_pressure_plate",
			() -> new DouglasFirPressurePlateBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_BUTTON = REGISTRY.register("douglas_fir_button", () -> new DouglasFirButtonBlock());
	public static final RegistryObject<Block> BAOBAB_WOOD = REGISTRY.register("baobab_wood", () -> new BaobabWoodBlock());
	public static final RegistryObject<Block> BAOBAB_LOG = REGISTRY.register("baobab_log", () -> new BaobabLogBlock());
	public static final RegistryObject<Block> BAOBAB_PLANKS = REGISTRY.register("baobab_planks", () -> new BaobabPlanksBlock());
	public static final RegistryObject<Block> BAOBAB_LEAVES = REGISTRY.register("baobab_leaves", () -> new BaobabLeavesBlock());
	public static final RegistryObject<Block> BAOBAB_STAIRS = REGISTRY.register("baobab_stairs", () -> new BaobabStairsBlock());
	public static final RegistryObject<Block> BAOBAB_SLAB = REGISTRY.register("baobab_slab", () -> new BaobabSlabBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE = REGISTRY.register("baobab_fence", () -> new BaobabFenceBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE_GATE = REGISTRY.register("baobab_fence_gate", () -> new BaobabFenceGateBlock());
	public static final RegistryObject<Block> BAOBAB_PRESSURE_PLATE = REGISTRY.register("baobab_pressure_plate",
			() -> new BaobabPressurePlateBlock());
	public static final RegistryObject<Block> BAOBAB_BUTTON = REGISTRY.register("baobab_button", () -> new BaobabButtonBlock());
	public static final RegistryObject<Block> WILLOW_WOOD = REGISTRY.register("willow_wood", () -> new WillowWoodBlock());
	public static final RegistryObject<Block> WILLOW_LOG = REGISTRY.register("willow_log", () -> new WillowLogBlock());
	public static final RegistryObject<Block> WILLOW_PLANKS = REGISTRY.register("willow_planks", () -> new WillowPlanksBlock());
	public static final RegistryObject<Block> WILLOW_LEAVES = REGISTRY.register("willow_leaves", () -> new WillowLeavesBlock());
	public static final RegistryObject<Block> WILLOW_STAIRS = REGISTRY.register("willow_stairs", () -> new WillowStairsBlock());
	public static final RegistryObject<Block> WILLOW_SLAB = REGISTRY.register("willow_slab", () -> new WillowSlabBlock());
	public static final RegistryObject<Block> WILLOW_FENCE = REGISTRY.register("willow_fence", () -> new WillowFenceBlock());
	public static final RegistryObject<Block> WILLOW_FENCE_GATE = REGISTRY.register("willow_fence_gate", () -> new WillowFenceGateBlock());
	public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = REGISTRY.register("willow_pressure_plate",
			() -> new WillowPressurePlateBlock());
	public static final RegistryObject<Block> WILLOW_BUTTON = REGISTRY.register("willow_button", () -> new WillowButtonBlock());
	public static final RegistryObject<Block> AMBER_ORE = REGISTRY.register("amber_ore", () -> new AmberOreBlock());
	public static final RegistryObject<Block> AMBER_BLOCK = REGISTRY.register("amber_block", () -> new AmberBlockBlock());
	public static final RegistryObject<Block> MILK = REGISTRY.register("milk", () -> new MilkBlock());
	public static final RegistryObject<Block> ROCK = REGISTRY.register("rock", () -> new RockBlock());
	public static final RegistryObject<Block> RUSTED_WOOD = REGISTRY.register("rusted_wood", () -> new RustedWoodBlock());
	public static final RegistryObject<Block> RUSTED_LOG = REGISTRY.register("rusted_log", () -> new RustedLogBlock());
	public static final RegistryObject<Block> RUSTED_PLANKS = REGISTRY.register("rusted_planks", () -> new RustedPlanksBlock());
	public static final RegistryObject<Block> RUSTED_LEAVES = REGISTRY.register("rusted_leaves", () -> new RustedLeavesBlock());
	public static final RegistryObject<Block> RUSTED_STAIRS = REGISTRY.register("rusted_stairs", () -> new RustedStairsBlock());
	public static final RegistryObject<Block> RUSTED_SLAB = REGISTRY.register("rusted_slab", () -> new RustedSlabBlock());
	public static final RegistryObject<Block> RUSTED_FENCE = REGISTRY.register("rusted_fence", () -> new RustedFenceBlock());
	public static final RegistryObject<Block> RUSTED_FENCE_GATE = REGISTRY.register("rusted_fence_gate", () -> new RustedFenceGateBlock());
	public static final RegistryObject<Block> RUSTED_PRESSURE_PLATE = REGISTRY.register("rusted_pressure_plate",
			() -> new RustedPressurePlateBlock());
	public static final RegistryObject<Block> RUSTED_BUTTON = REGISTRY.register("rusted_button", () -> new RustedButtonBlock());
	public static final RegistryObject<Block> TINTED_WOOD = REGISTRY.register("tinted_wood", () -> new TintedWoodBlock());
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> TINTED_LOG = REGISTRY.register("tinted_log", () -> new TintedLogBlock());
	public static final RegistryObject<Block> TINTED_PLANKS = REGISTRY.register("tinted_planks", () -> new TintedPlanksBlock());
	public static final RegistryObject<Block> TINTED_LEAVES = REGISTRY.register("tinted_leaves", () -> new TintedLeavesBlock());
	public static final RegistryObject<Block> TINTED_STAIRS = REGISTRY.register("tinted_stairs", () -> new TintedStairsBlock());
	public static final RegistryObject<Block> TINTED_SLAB = REGISTRY.register("tinted_slab", () -> new TintedSlabBlock());
	public static final RegistryObject<Block> TINTED_FENCE = REGISTRY.register("tinted_fence", () -> new TintedFenceBlock());
	public static final RegistryObject<Block> TINTED_FENCE_GATE = REGISTRY.register("tinted_fence_gate", () -> new TintedFenceGateBlock());
	public static final RegistryObject<Block> TINTED_PRESSURE_PLATE = REGISTRY.register("tinted_pressure_plate",
			() -> new TintedPressurePlateBlock());
	public static final RegistryObject<Block> TINTED_BUTTON = REGISTRY.register("tinted_button", () -> new TintedButtonBlock());
	public static final RegistryObject<Block> VERTICAL_OAK_SLAB = REGISTRY.register("vertical_oak_slab", () -> new VerticalOakSlabBlock());
	public static final RegistryObject<Block> VERTICAL_SPRUCE_SLAB = REGISTRY.register("vertical_spruce_slab", () -> new VerticalSpruceSlabBlock());
	public static final RegistryObject<Block> VERTICAL_BIRCH_SLAB = REGISTRY.register("vertical_birch_slab", () -> new VerticalBirchSlabBlock());
	public static final RegistryObject<Block> VERTICAL_JUNGLE_SLAB = REGISTRY.register("vertical_jungle_slab", () -> new VerticalJungleSlabBlock());
	public static final RegistryObject<Block> VERTICAL_ACACIA_SLAB = REGISTRY.register("vertical_acacia_slab", () -> new VerticalAcaciaSlabBlock());
	public static final RegistryObject<Block> VERTICAL_DARKOAK_SLAB = REGISTRY.register("vertical_darkoak_slab",
			() -> new VerticalDarkoakSlabBlock());
	public static final RegistryObject<Block> VERTICAL_CRIMSON_SLAB = REGISTRY.register("vertical_crimson_slab",
			() -> new VerticalCrimsonSlabBlock());
	public static final RegistryObject<Block> VERTICAL_WARPED_SLAB = REGISTRY.register("vertical_warped_slab", () -> new VerticalWarpedSlabBlock());
	public static final RegistryObject<Block> VERTICAL_BAOBAB_SLAB = REGISTRY.register("vertical_baobab_slab", () -> new VerticalBaobabSlabBlock());
	public static final RegistryObject<Block> VERTICAL_DOUGLAS_FIR_SLAB = REGISTRY.register("vertical_douglas_fir_slab",
			() -> new VerticalDouglasFirSlabBlock());
	public static final RegistryObject<Block> VERTICAL_EUCALYPTUS_SLAB = REGISTRY.register("vertical_eucalyptus_slab",
			() -> new VerticalEucalyptusSlabBlock());
	public static final RegistryObject<Block> VERTICAL_WILLOW_SLAB = REGISTRY.register("vertical_willow_slab", () -> new VerticalWillowSlabBlock());
	public static final RegistryObject<Block> VERTICAL_TINTED_SLAB = REGISTRY.register("vertical_tinted_slab", () -> new VerticalTintedSlabBlock());
	public static final RegistryObject<Block> VERTICAL_RUSTED_SLAB = REGISTRY.register("vertical_rusted_slab", () -> new VerticalRustedSlabBlock());
	public static final RegistryObject<Block> GERANIUM = REGISTRY.register("geranium", () -> new GeraniumBlock());
	public static final RegistryObject<Block> PLATINUM_ORE = REGISTRY.register("platinum_ore", () -> new PlatinumOreBlock());
	public static final RegistryObject<Block> PLATINUM_BLOCK = REGISTRY.register("platinum_block", () -> new PlatinumBlockBlock());
}

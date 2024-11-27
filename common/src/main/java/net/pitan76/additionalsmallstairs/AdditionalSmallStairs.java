package net.pitan76.additionalsmallstairs;

import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.item.v2.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;
import net.pitan76.mcpitanlib.api.util.block.BlockUtil;
import net.pitan76.mcpitanlib.api.util.item.ItemUtil;
import net.minecraft.block.Block;
import net.pitan76.mcpitanlib.midohra.item.ItemGroups;

public class AdditionalSmallStairs extends CommonModInitializer {

	public static final String MOD_ID = "additionalsmallstairs";
	public static final String MOD_NAME = "Additional Small Stairs";

	public void init() {
		if (isExist("cut_copper")) {
			RegistryResult<Block> SMALL_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_cut_copper"), () -> Blocks.SMALL_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_cut_copper"), () -> ItemUtil.create(SMALL_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("exposed_cut_copper")) {
			RegistryResult<Block> SMALL_EXPOSED_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_exposed_cut_copper"), () -> Blocks.SMALL_EXPOSED_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_exposed_cut_copper"), () -> ItemUtil.create(SMALL_EXPOSED_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_exposed_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("weathered_cut_copper")) {
			RegistryResult<Block> SMALL_WEATHERED_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_weathered_cut_copper"), () -> Blocks.SMALL_WEATHERED_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_weathered_cut_copper"), () -> ItemUtil.create(SMALL_WEATHERED_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_weathered_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("oxidized_cut_copper")) {
			RegistryResult<Block> SMALL_OXIDIZED_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_oxidized_cut_copper"), () -> Blocks.SMALL_OXIDIZED_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_oxidized_cut_copper"), () -> ItemUtil.create(SMALL_OXIDIZED_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_oxidized_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("waxed_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_waxed_cut_copper"), () -> Blocks.SMALL_WAXED_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_waxed_cut_copper"), () -> ItemUtil.create(SMALL_WAXED_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_waxed_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("waxed_exposed_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_waxed_exposed_cut_copper"), () -> Blocks.SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_waxed_exposed_cut_copper"), () -> ItemUtil.create(SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_waxed_exposed_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("waxed_weathered_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_waxed_weathered_cut_copper"), () -> Blocks.SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_waxed_weathered_cut_copper"), () -> ItemUtil.create(SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_waxed_weathered_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("waxed_oxidized_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = registry.registerBlock(_id("small_stairs_waxed_oxidized_cut_copper"), () -> Blocks.SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS);
			registry.registerItem(_id("small_stairs_waxed_oxidized_cut_copper"), () -> ItemUtil.create(SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_waxed_oxidized_cut_copper")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}

		if (isExist("mud_bricks")) {
			RegistryResult<Block> SMALL_MUD_BRICK_STAIRS = registry.registerBlock(_id("small_stairs_mud_bricks"), () -> Blocks.SMALL_MUD_BRICK_STAIRS);
			registry.registerItem(_id("small_stairs_mud_bricks"), () -> ItemUtil.create(SMALL_MUD_BRICK_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_mud_bricks")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("cherry_planks")) {
			RegistryResult<Block> SMALL_CHERRY_PLANKS_STAIRS = registry.registerBlock(_id("small_stairs_cherry_planks"), () -> Blocks.SMALL_CHERRY_PLANKS_STAIRS);
			registry.registerItem(_id("small_stairs_cherry_planks"), () -> ItemUtil.create(SMALL_CHERRY_PLANKS_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_cherry_planks")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("bamboo_planks")) {
			RegistryResult<Block> SMALL_BAMBOO_STAIRS = registry.registerBlock(_id("small_stairs_bamboo"), () -> Blocks.SMALL_BAMBOO_STAIRS);
			registry.registerItem(_id("small_stairs_bamboo"), () -> ItemUtil.create(SMALL_BAMBOO_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_bamboo")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("bamboo_mosaic")) {
			RegistryResult<Block> SMALL_BAMBOO_MOSAIC_STAIRS = registry.registerBlock(_id("small_stairs_bamboo_mosaic"), () -> Blocks.SMALL_BAMBOO_MOSAIC_STAIRS);
			registry.registerItem(_id("small_stairs_bamboo_mosaic"), () -> ItemUtil.create(SMALL_BAMBOO_MOSAIC_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_bamboo_mosaic")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("prismarine")) {
			RegistryResult<Block> SMALL_PRISMARINE_STAIRS = registry.registerBlock(_id("small_stairs_prismarine"), () -> Blocks.SMALL_PRISMARINE_STAIRS);
			registry.registerItem(_id("small_stairs_prismarine"), () -> ItemUtil.create(SMALL_PRISMARINE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_prismarine")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("prismarine_bricks")) {
			RegistryResult<Block> SMALL_PRISMARINE_BRICK_STAIRS = registry.registerBlock(_id("small_stairs_prismarine_bricks"), () -> Blocks.SMALL_PRISMARINE_BRICK_STAIRS);
			registry.registerItem(_id("small_stairs_prismarine_bricks"), () -> ItemUtil.create(SMALL_PRISMARINE_BRICK_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_prismarine_bricks")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("dark_prismarine")) {
			RegistryResult<Block> SMALL_DARK_PRISMARINE_STAIRS = registry.registerBlock(_id("small_stairs_dark_prismarine"), () -> Blocks.SMALL_DARK_PRISMARINE_STAIRS);
			registry.registerItem(_id("small_stairs_dark_prismarine"), () -> ItemUtil.create(SMALL_DARK_PRISMARINE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_dark_prismarine")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("smooth_sandstone")) {
			RegistryResult<Block> SMALL_SMOOTH_SANDSTONE_STAIRS = registry.registerBlock(_id("small_stairs_smooth_sandstone"), () -> Blocks.SMALL_SMOOTH_SANDSTONE_STAIRS);
			registry.registerItem(_id("small_stairs_smooth_sandstone"), () -> ItemUtil.create(SMALL_SMOOTH_SANDSTONE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_smooth_sandstone")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("smooth_red_sandstone")) {
			RegistryResult<Block> SMALL_SMOOTH_RED_SANDSTONE_STAIRS = registry.registerBlock(_id("small_stairs_smooth_red_sandstone"), () -> Blocks.SMALL_SMOOTH_RED_SANDSTONE_STAIRS);
			registry.registerItem(_id("small_stairs_smooth_red_sandstone"), () -> ItemUtil.create(SMALL_SMOOTH_RED_SANDSTONE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_smooth_red_sandstone")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("smooth_quartz")) {
			RegistryResult<Block> SMALL_SMOOTH_QUARTZ_STAIRS = registry.registerBlock(_id("small_stairs_smooth_quartz"), () -> Blocks.SMALL_SMOOTH_QUARTZ_STAIRS);
			registry.registerItem(_id("small_stairs_smooth_quartz"), () -> ItemUtil.create(SMALL_SMOOTH_QUARTZ_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_smooth_quartz")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("smooth_stone")) {
			RegistryResult<Block> SMALL_SMOOTH_STONE_STAIRS = registry.registerBlock(_id("small_stairs_smooth_stone"), () -> Blocks.SMALL_SMOOTH_STONE_STAIRS);
			registry.registerItem(_id("small_stairs_smooth_stone"), () -> ItemUtil.create(SMALL_SMOOTH_STONE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_smooth_stone")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("mossy_cobblestone")) {
			RegistryResult<Block> SMALL_MOSSY_COBBLESTONE_STAIRS = registry.registerBlock(_id("small_stairs_mossy_cobblestone"), () -> Blocks.SMALL_MOSSY_COBBLESTONE_STAIRS);
			registry.registerItem(_id("small_stairs_mossy_cobblestone"), () -> ItemUtil.create(SMALL_MOSSY_COBBLESTONE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_mossy_cobblestone")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("mossy_stone_bricks")) {
			RegistryResult<Block> SMALL_MOSSY_STONE_BRICK_STAIRS = registry.registerBlock(_id("small_stairs_mossy_stone_bricks"), () -> Blocks.SMALL_MOSSY_STONE_BRICK_STAIRS);
			registry.registerItem(_id("small_stairs_mossy_stone_bricks"), () -> ItemUtil.create(SMALL_MOSSY_STONE_BRICK_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_mossy_stone_bricks")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("end_stone_bricks")) {
			RegistryResult<Block> SMALL_END_STONE_BRICK_STAIRS = registry.registerBlock(_id("small_stairs_end_stone_bricks"), () -> Blocks.SMALL_END_STONE_BRICK_STAIRS);
			registry.registerItem(_id("small_stairs_end_stone_bricks"), () -> ItemUtil.create(SMALL_END_STONE_BRICK_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_end_stone_bricks")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}

		if (isExist("deepslate")) {
			RegistryResult<Block> SMALL_DEEPSLATE_STAIRS = registry.registerBlock(_id("small_stairs_deepslate"), () -> Blocks.SMALL_DEEPSLATE_STAIRS);
			registry.registerItem(_id("small_stairs_deepslate"), () -> ItemUtil.create(SMALL_DEEPSLATE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_deepslate")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("deepslate_bricks")) {
			RegistryResult<Block> SMALL_DEEPSLATE_BRICK_STAIRS = registry.registerBlock(_id("small_stairs_deepslate_bricks"), () -> Blocks.SMALL_DEEPSLATE_BRICK_STAIRS);
			registry.registerItem(_id("small_stairs_deepslate_bricks"), () -> ItemUtil.create(SMALL_DEEPSLATE_BRICK_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_deepslate_bricks")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("deepslate_tiles")) {
			RegistryResult<Block> SMALL_DEEPSLATE_TILE_STAIRS = registry.registerBlock(_id("small_stairs_deepslate_tiles"), () -> Blocks.SMALL_DEEPSLATE_TILE_STAIRS);
			registry.registerItem(_id("small_stairs_deepslate_tiles"), () -> ItemUtil.create(SMALL_DEEPSLATE_TILE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_deepslate_tiles")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("polished_deepslate")) {
			RegistryResult<Block> SMALL_POLISHED_DEEPSLATE_STAIRS = registry.registerBlock(_id("small_stairs_polished_deepslate"), () -> Blocks.SMALL_POLISHED_DEEPSLATE_STAIRS);
			registry.registerItem(_id("small_stairs_polished_deepslate"), () -> ItemUtil.create(SMALL_POLISHED_DEEPSLATE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_polished_deepslate")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("cobbled_deepslate")) {
			RegistryResult<Block> SMALL_COBBLED_DEEPSLATE_STAIRS = registry.registerBlock(_id("small_stairs_cobbled_deepslate"), () -> Blocks.SMALL_COBBLED_DEEPSLATE_STAIRS);
			registry.registerItem(_id("small_stairs_cobbled_deepslate"), () -> ItemUtil.create(SMALL_COBBLED_DEEPSLATE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_cobbled_deepslate")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}

		if (isExist("blackstone")) {
			RegistryResult<Block> SMALL_BLACKSTONE_STAIRS = registry.registerBlock(_id("small_stairs_blackstone"), () -> Blocks.SMALL_BLACKSTONE_STAIRS);
			registry.registerItem(_id("small_stairs_blackstone"), () -> ItemUtil.create(SMALL_BLACKSTONE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_blackstone")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("polished_blackstone")) {
			RegistryResult<Block> SMALL_POLISHED_BLACKSTONE_STAIRS = registry.registerBlock(_id("small_stairs_polished_blackstone"), () -> Blocks.SMALL_POLISHED_BLACKSTONE_STAIRS);
			registry.registerItem(_id("small_stairs_polished_blackstone"), () -> ItemUtil.create(SMALL_POLISHED_BLACKSTONE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_polished_blackstone")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("polished_blackstone_bricks")) {
			RegistryResult<Block> SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registry.registerBlock(_id("small_stairs_polished_blackstone_bricks"), () -> Blocks.SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS);
			registry.registerItem(_id("small_stairs_polished_blackstone_bricks"), () -> ItemUtil.create(SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_polished_blackstone_bricks")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}

		if (isExist("andesite")) {
			RegistryResult<Block> SMALL_ANDESITE_STAIRS = registry.registerBlock(_id("small_stairs_andesite"), () -> Blocks.SMALL_ANDESITE_STAIRS);
			registry.registerItem(_id("small_stairs_andesite"), () -> ItemUtil.create(SMALL_ANDESITE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_andesite")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("diorite")) {
			RegistryResult<Block> SMALL_DIORITE_STAIRS = registry.registerBlock(_id("small_stairs_diorite"), () -> Blocks.SMALL_DIORITE_STAIRS);
			registry.registerItem(_id("small_stairs_diorite"), () -> ItemUtil.create(SMALL_DIORITE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_diorite")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("granite")) {
			RegistryResult<Block> SMALL_GRANITE_STAIRS = registry.registerBlock(_id("small_stairs_granite"), () -> Blocks.SMALL_GRANITE_STAIRS);
			registry.registerItem(_id("small_stairs_granite"), () -> ItemUtil.create(SMALL_GRANITE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_granite")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("polished_andesite")) {
			RegistryResult<Block> SMALL_POLISHED_ANDESITE_STAIRS = registry.registerBlock(_id("small_stairs_polished_andesite"), () -> Blocks.SMALL_POLISHED_ANDESITE_STAIRS);
			registry.registerItem(_id("small_stairs_polished_andesite"), () -> ItemUtil.create(SMALL_POLISHED_ANDESITE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_polished_andesite")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("polished_diorite")) {
			RegistryResult<Block> SMALL_POLISHED_DIORITE_STAIRS = registry.registerBlock(_id("small_stairs_polished_diorite"), () -> Blocks.SMALL_POLISHED_DIORITE_STAIRS);
			registry.registerItem(_id("small_stairs_polished_diorite"), () -> ItemUtil.create(SMALL_POLISHED_DIORITE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_polished_diorite")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
		if (isExist("polished_granite")) {
			RegistryResult<Block> SMALL_POLISHED_GRANITE_STAIRS = registry.registerBlock(_id("small_stairs_polished_granite"), () -> Blocks.SMALL_POLISHED_GRANITE_STAIRS);
			registry.registerItem(_id("small_stairs_polished_granite"), () -> ItemUtil.create(SMALL_POLISHED_GRANITE_STAIRS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_polished_granite")).addGroup(ItemGroups.BUILDING_BLOCKS)));
		}
	}
	
	public static CompatIdentifier _id(String path) {
		return new CompatIdentifier(MOD_ID, path);
	}

	@Override
	public String getId() {
		return MOD_ID;
	}

	@Override
	public String getName() {
		return MOD_NAME;
	}

	public static boolean isExist(String id) {
		return BlockUtil.isExist(CompatIdentifier.of(id));
	}
}

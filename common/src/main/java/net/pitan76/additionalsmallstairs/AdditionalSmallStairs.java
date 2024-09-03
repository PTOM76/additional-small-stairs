package net.pitan76.additionalsmallstairs;

import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.DefaultItemGroups;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.BlockUtil;
import net.pitan76.mcpitanlib.api.util.IdentifierUtil;
import net.pitan76.mcpitanlib.api.util.ItemUtil;
import net.minecraft.block.Block;

public class AdditionalSmallStairs extends CommonModInitializer {

	public static final String MOD_ID = "additionalsmallstairs";
	public static final String MOD_NAME = "Additional Small Stairs";

	public void init() {
		if (isExist("cut_copper")) {
			RegistryResult<Block> SMALL_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_cut_copper"), () -> Blocks.SMALL_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_cut_copper"), () -> ItemUtil.ofBlock(SMALL_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cut_copper"))));
		}
		if (isExist("exposed_cut_copper")) {
			RegistryResult<Block> SMALL_EXPOSED_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_exposed_cut_copper"), () -> Blocks.SMALL_EXPOSED_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_exposed_cut_copper"), () -> ItemUtil.ofBlock(SMALL_EXPOSED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_exposed_cut_copper"))));
		}
		if (isExist("weathered_cut_copper")) {
			RegistryResult<Block> SMALL_WEATHERED_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_weathered_cut_copper"), () -> Blocks.SMALL_WEATHERED_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_weathered_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WEATHERED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_weathered_cut_copper"))));
		}
		if (isExist("oxidized_cut_copper")) {
			RegistryResult<Block> SMALL_OXIDIZED_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_oxidized_cut_copper"), () -> Blocks.SMALL_OXIDIZED_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_oxidized_cut_copper"), () -> ItemUtil.ofBlock(SMALL_OXIDIZED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_oxidized_cut_copper"))));
		}
		if (isExist("waxed_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_waxed_cut_copper"), () -> Blocks.SMALL_WAXED_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_waxed_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_cut_copper"))));
		}
		if (isExist("waxed_exposed_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_waxed_exposed_cut_copper"), () -> Blocks.SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_waxed_exposed_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_exposed_cut_copper"))));
		}
		if (isExist("waxed_weathered_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_waxed_weathered_cut_copper"), () -> Blocks.SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_waxed_weathered_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_weathered_cut_copper"))));
		}
		if (isExist("waxed_oxidized_cut_copper")) {
			RegistryResult<Block> SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = registry.registerBlock(compatId("small_stairs_waxed_oxidized_cut_copper"), () -> Blocks.SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS);
			registry.registerItem(compatId("small_stairs_waxed_oxidized_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_oxidized_cut_copper"))));
		}

		if (isExist("mud_bricks")) {
			RegistryResult<Block> SMALL_MUD_BRICK_STAIRS = registry.registerBlock(compatId("small_stairs_mud_bricks"), () -> Blocks.SMALL_MUD_BRICK_STAIRS);
			registry.registerItem(compatId("small_stairs_mud_bricks"), () -> ItemUtil.ofBlock(SMALL_MUD_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_mud_bricks"))));
		}
		if (isExist("cherry_planks")) {
			RegistryResult<Block> SMALL_CHERRY_PLANKS_STAIRS = registry.registerBlock(compatId("small_stairs_cherry_planks"), () -> Blocks.SMALL_CHERRY_PLANKS_STAIRS);
			registry.registerItem(compatId("small_stairs_cherry_planks"), () -> ItemUtil.ofBlock(SMALL_CHERRY_PLANKS_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cherry_planks"))));
		}
		if (isExist("bamboo_planks")) {
			RegistryResult<Block> SMALL_BAMBOO_STAIRS = registry.registerBlock(compatId("small_stairs_bamboo"), () -> Blocks.SMALL_BAMBOO_STAIRS);
			registry.registerItem(compatId("small_stairs_bamboo"), () -> ItemUtil.ofBlock(SMALL_BAMBOO_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_bamboo"))));
		}
		if (isExist("bamboo_mosaic")) {
			RegistryResult<Block> SMALL_BAMBOO_MOSAIC_STAIRS = registry.registerBlock(compatId("small_stairs_bamboo_mosaic"), () -> Blocks.SMALL_BAMBOO_MOSAIC_STAIRS);
			registry.registerItem(compatId("small_stairs_bamboo_mosaic"), () -> ItemUtil.ofBlock(SMALL_BAMBOO_MOSAIC_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_bamboo_mosaic"))));
		}
		if (isExist("prismarine")) {
			RegistryResult<Block> SMALL_PRISMARINE_STAIRS = registry.registerBlock(compatId("small_stairs_prismarine"), () -> Blocks.SMALL_PRISMARINE_STAIRS);
			registry.registerItem(compatId("small_stairs_prismarine"), () -> ItemUtil.ofBlock(SMALL_PRISMARINE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_prismarine"))));
		}
		if (isExist("prismarine_bricks")) {
			RegistryResult<Block> SMALL_PRISMARINE_BRICK_STAIRS = registry.registerBlock(compatId("small_stairs_prismarine_bricks"), () -> Blocks.SMALL_PRISMARINE_BRICK_STAIRS);
			registry.registerItem(compatId("small_stairs_prismarine_bricks"), () -> ItemUtil.ofBlock(SMALL_PRISMARINE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_prismarine_bricks"))));
		}
		if (isExist("dark_prismarine")) {
			RegistryResult<Block> SMALL_DARK_PRISMARINE_STAIRS = registry.registerBlock(compatId("small_stairs_dark_prismarine"), () -> Blocks.SMALL_DARK_PRISMARINE_STAIRS);
			registry.registerItem(compatId("small_stairs_dark_prismarine"), () -> ItemUtil.ofBlock(SMALL_DARK_PRISMARINE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_dark_prismarine"))));
		}
		if (isExist("smooth_sandstone")) {
			RegistryResult<Block> SMALL_SMOOTH_SANDSTONE_STAIRS = registry.registerBlock(compatId("small_stairs_smooth_sandstone"), () -> Blocks.SMALL_SMOOTH_SANDSTONE_STAIRS);
			registry.registerItem(compatId("small_stairs_smooth_sandstone"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_SANDSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_sandstone"))));
		}
		if (isExist("smooth_red_sandstone")) {
			RegistryResult<Block> SMALL_SMOOTH_RED_SANDSTONE_STAIRS = registry.registerBlock(compatId("small_stairs_smooth_red_sandstone"), () -> Blocks.SMALL_SMOOTH_RED_SANDSTONE_STAIRS);
			registry.registerItem(compatId("small_stairs_smooth_red_sandstone"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_RED_SANDSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_red_sandstone"))));
		}
		if (isExist("smooth_quartz")) {
			RegistryResult<Block> SMALL_SMOOTH_QUARTZ_STAIRS = registry.registerBlock(compatId("small_stairs_smooth_quartz"), () -> Blocks.SMALL_SMOOTH_QUARTZ_STAIRS);
			registry.registerItem(compatId("small_stairs_smooth_quartz"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_QUARTZ_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_quartz"))));
		}
		if (isExist("smooth_stone")) {
			RegistryResult<Block> SMALL_SMOOTH_STONE_STAIRS = registry.registerBlock(compatId("small_stairs_smooth_stone"), () -> Blocks.SMALL_SMOOTH_STONE_STAIRS);
			registry.registerItem(compatId("small_stairs_smooth_stone"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_STONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_stone"))));
		}
		if (isExist("mossy_cobblestone")) {
			RegistryResult<Block> SMALL_MOSSY_COBBLESTONE_STAIRS = registry.registerBlock(compatId("small_stairs_mossy_cobblestone"), () -> Blocks.SMALL_MOSSY_COBBLESTONE_STAIRS);
			registry.registerItem(compatId("small_stairs_mossy_cobblestone"), () -> ItemUtil.ofBlock(SMALL_MOSSY_COBBLESTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_mossy_cobblestone"))));
		}
		if (isExist("mossy_stone_bricks")) {
			RegistryResult<Block> SMALL_MOSSY_STONE_BRICK_STAIRS = registry.registerBlock(compatId("small_stairs_mossy_stone_bricks"), () -> Blocks.SMALL_MOSSY_STONE_BRICK_STAIRS);
			registry.registerItem(compatId("small_stairs_mossy_stone_bricks"), () -> ItemUtil.ofBlock(SMALL_MOSSY_STONE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_mossy_stone_bricks"))));
		}
		if (isExist("end_stone_bricks")) {
			RegistryResult<Block> SMALL_END_STONE_BRICK_STAIRS = registry.registerBlock(compatId("small_stairs_end_stone_bricks"), () -> Blocks.SMALL_END_STONE_BRICK_STAIRS);
			registry.registerItem(compatId("small_stairs_end_stone_bricks"), () -> ItemUtil.ofBlock(SMALL_END_STONE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_end_stone_bricks"))));
		}

		if (isExist("deepslate")) {
			RegistryResult<Block> SMALL_DEEPSLATE_STAIRS = registry.registerBlock(compatId("small_stairs_deepslate"), () -> Blocks.SMALL_DEEPSLATE_STAIRS);
			registry.registerItem(compatId("small_stairs_deepslate"), () -> ItemUtil.ofBlock(SMALL_DEEPSLATE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_deepslate"))));
		}
		if (isExist("deepslate_bricks")) {
			RegistryResult<Block> SMALL_DEEPSLATE_BRICK_STAIRS = registry.registerBlock(compatId("small_stairs_deepslate_bricks"), () -> Blocks.SMALL_DEEPSLATE_BRICK_STAIRS);
			registry.registerItem(compatId("small_stairs_deepslate_bricks"), () -> ItemUtil.ofBlock(SMALL_DEEPSLATE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_deepslate_bricks"))));
		}
		if (isExist("deepslate_tiles")) {
			RegistryResult<Block> SMALL_DEEPSLATE_TILE_STAIRS = registry.registerBlock(compatId("small_stairs_deepslate_tiles"), () -> Blocks.SMALL_DEEPSLATE_TILE_STAIRS);
			registry.registerItem(compatId("small_stairs_deepslate_tiles"), () -> ItemUtil.ofBlock(SMALL_DEEPSLATE_TILE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_deepslate_tiles"))));
		}
		if (isExist("polished_deepslate")) {
			RegistryResult<Block> SMALL_POLISHED_DEEPSLATE_STAIRS = registry.registerBlock(compatId("small_stairs_polished_deepslate"), () -> Blocks.SMALL_POLISHED_DEEPSLATE_STAIRS);
			registry.registerItem(compatId("small_stairs_polished_deepslate"), () -> ItemUtil.ofBlock(SMALL_POLISHED_DEEPSLATE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_deepslate"))));
		}
		if (isExist("cobbled_deepslate")) {
			RegistryResult<Block> SMALL_COBBLED_DEEPSLATE_STAIRS = registry.registerBlock(compatId("small_stairs_cobbled_deepslate"), () -> Blocks.SMALL_COBBLED_DEEPSLATE_STAIRS);
			registry.registerItem(compatId("small_stairs_cobbled_deepslate"), () -> ItemUtil.ofBlock(SMALL_COBBLED_DEEPSLATE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cobbled_deepslate"))));
		}

		if (isExist("blackstone")) {
			RegistryResult<Block> SMALL_BLACKSTONE_STAIRS = registry.registerBlock(compatId("small_stairs_blackstone"), () -> Blocks.SMALL_BLACKSTONE_STAIRS);
			registry.registerItem(compatId("small_stairs_blackstone"), () -> ItemUtil.ofBlock(SMALL_BLACKSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_blackstone"))));
		}
		if (isExist("polished_blackstone")) {
			RegistryResult<Block> SMALL_POLISHED_BLACKSTONE_STAIRS = registry.registerBlock(compatId("small_stairs_polished_blackstone"), () -> Blocks.SMALL_POLISHED_BLACKSTONE_STAIRS);
			registry.registerItem(compatId("small_stairs_polished_blackstone"), () -> ItemUtil.ofBlock(SMALL_POLISHED_BLACKSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_blackstone"))));
		}
		if (isExist("polished_blackstone_bricks")) {
			RegistryResult<Block> SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registry.registerBlock(compatId("small_stairs_polished_blackstone_bricks"), () -> Blocks.SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS);
			registry.registerItem(compatId("small_stairs_polished_blackstone_bricks"), () -> ItemUtil.ofBlock(SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_blackstone_bricks"))));
		}

		if (isExist("andesite")) {
			RegistryResult<Block> SMALL_ANDESITE_STAIRS = registry.registerBlock(compatId("small_stairs_andesite"), () -> Blocks.SMALL_ANDESITE_STAIRS);
			registry.registerItem(compatId("small_stairs_andesite"), () -> ItemUtil.ofBlock(SMALL_ANDESITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_andesite"))));
		}
		if (isExist("diorite")) {
			RegistryResult<Block> SMALL_DIORITE_STAIRS = registry.registerBlock(compatId("small_stairs_diorite"), () -> Blocks.SMALL_DIORITE_STAIRS);
			registry.registerItem(compatId("small_stairs_diorite"), () -> ItemUtil.ofBlock(SMALL_DIORITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_diorite"))));
		}
		if (isExist("granite")) {
			RegistryResult<Block> SMALL_GRANITE_STAIRS = registry.registerBlock(compatId("small_stairs_granite"), () -> Blocks.SMALL_GRANITE_STAIRS);
			registry.registerItem(compatId("small_stairs_granite"), () -> ItemUtil.ofBlock(SMALL_GRANITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_granite"))));
		}
		if (isExist("polished_andesite")) {
			RegistryResult<Block> SMALL_POLISHED_ANDESITE_STAIRS = registry.registerBlock(compatId("small_stairs_polished_andesite"), () -> Blocks.SMALL_POLISHED_ANDESITE_STAIRS);
			registry.registerItem(compatId("small_stairs_polished_andesite"), () -> ItemUtil.ofBlock(SMALL_POLISHED_ANDESITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_andesite"))));
		}
		if (isExist("polished_diorite")) {
			RegistryResult<Block> SMALL_POLISHED_DIORITE_STAIRS = registry.registerBlock(compatId("small_stairs_polished_diorite"), () -> Blocks.SMALL_POLISHED_DIORITE_STAIRS);
			registry.registerItem(compatId("small_stairs_polished_diorite"), () -> ItemUtil.ofBlock(SMALL_POLISHED_DIORITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_diorite"))));
		}
		if (isExist("polished_granite")) {
			RegistryResult<Block> SMALL_POLISHED_GRANITE_STAIRS = registry.registerBlock(compatId("small_stairs_polished_granite"), () -> Blocks.SMALL_POLISHED_GRANITE_STAIRS);
			registry.registerItem(compatId("small_stairs_polished_granite"), () -> ItemUtil.ofBlock(SMALL_POLISHED_GRANITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_granite"))));
		}
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
		return BlockUtil.isExist(IdentifierUtil.id(id));
	}
}

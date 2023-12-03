package net.pitan76.additionalsmallstairs;

import ml.pkom.mcpitanlibarch.api.event.registry.RegistryEvent;
import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import ml.pkom.mcpitanlibarch.api.item.DefaultItemGroups;
import ml.pkom.mcpitanlibarch.api.registry.ArchRegistry;
import ml.pkom.mcpitanlibarch.api.util.ItemUtil;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import static net.pitan76.additionalsmallstairs.Blocks.isExist;

public class AdditionalSmallStairs
{
	public static final String MOD_ID = "additionalsmallstairs";
	public static final String MOD_NAME = "Additional Small Stairs";

	public static ArchRegistry registry = new ArchRegistry(MOD_ID);

	public static void init() {
		if (isExist("cut_copper")) {
			RegistryEvent<Block> SMALL_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_cut_copper"), () -> Blocks.SMALL_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_cut_copper"), () -> ItemUtil.ofBlock(SMALL_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cut_copper"))));
		}
		if (isExist("exposed_cut_copper")) {
			RegistryEvent<Block> SMALL_EXPOSED_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_exposed_cut_copper"), () -> Blocks.SMALL_EXPOSED_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_exposed_cut_copper"), () -> ItemUtil.ofBlock(SMALL_EXPOSED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_exposed_cut_copper"))));
		}
		if (isExist("weathered_cut_copper")) {
			RegistryEvent<Block> SMALL_WEATHERED_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_weathered_cut_copper"), () -> Blocks.SMALL_WEATHERED_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_weathered_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WEATHERED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_weathered_cut_copper"))));
		}
		if (isExist("oxidized_cut_copper")) {
			RegistryEvent<Block> SMALL_OXIDIZED_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_oxidized_cut_copper"), () -> Blocks.SMALL_OXIDIZED_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_oxidized_cut_copper"), () -> ItemUtil.ofBlock(SMALL_OXIDIZED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_oxidized_cut_copper"))));
		}
		if (isExist("waxed_cut_copper")) {
			RegistryEvent<Block> SMALL_WAXED_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_waxed_cut_copper"), () -> Blocks.SMALL_WAXED_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_waxed_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_cut_copper"))));
		}
		if (isExist("waxed_exposed_cut_copper")) {
			RegistryEvent<Block> SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_waxed_exposed_cut_copper"), () -> Blocks.SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_waxed_exposed_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_exposed_cut_copper"))));
		}
		if (isExist("waxed_weathered_cut_copper")) {
			RegistryEvent<Block> SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_waxed_weathered_cut_copper"), () -> Blocks.SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_waxed_weathered_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_weathered_cut_copper"))));
		}
		if (isExist("waxed_oxidized_cut_copper")) {
			RegistryEvent<Block> SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = registry.registerBlock(id("small_stairs_waxed_oxidized_cut_copper"), () -> Blocks.SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS);
			registry.registerItem(id("small_stairs_waxed_oxidized_cut_copper"), () -> ItemUtil.ofBlock(SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_waxed_oxidized_cut_copper"))));
		}

		if (isExist("mud_bricks")) {
			RegistryEvent<Block> SMALL_MUD_BRICK_STAIRS = registry.registerBlock(id("small_stairs_mud_bricks"), () -> Blocks.SMALL_MUD_BRICK_STAIRS);
			registry.registerItem(id("small_stairs_mud_bricks"), () -> ItemUtil.ofBlock(SMALL_MUD_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_mud_bricks"))));
		}
		if (isExist("cherry_planks")) {
			RegistryEvent<Block> SMALL_CHERRY_PLANKS_STAIRS = registry.registerBlock(id("small_stairs_cherry_planks"), () -> Blocks.SMALL_CHERRY_PLANKS_STAIRS);
			registry.registerItem(id("small_stairs_cherry_planks"), () -> ItemUtil.ofBlock(SMALL_CHERRY_PLANKS_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cherry_planks"))));
		}
		if (isExist("bamboo")) {
			RegistryEvent<Block> SMALL_BAMBOO_STAIRS = registry.registerBlock(id("small_stairs_bamboo"), () -> Blocks.SMALL_BAMBOO_STAIRS);
			registry.registerItem(id("small_stairs_bamboo"), () -> ItemUtil.ofBlock(SMALL_BAMBOO_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_bamboo"))));
		}
		if (isExist("bamboo_mosaic")) {
			RegistryEvent<Block> SMALL_BAMBOO_MOSAIC_STAIRS = registry.registerBlock(id("small_stairs_bamboo_mosaic"), () -> Blocks.SMALL_BAMBOO_MOSAIC_STAIRS);
			registry.registerItem(id("small_stairs_bamboo_mosaic"), () -> ItemUtil.ofBlock(SMALL_BAMBOO_MOSAIC_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_bamboo_mosaic"))));
		}
		if (isExist("prismarine")) {
			RegistryEvent<Block> SMALL_PRISMARINE_STAIRS = registry.registerBlock(id("small_stairs_prismarine"), () -> Blocks.SMALL_PRISMARINE_STAIRS);
			registry.registerItem(id("small_stairs_prismarine"), () -> ItemUtil.ofBlock(SMALL_PRISMARINE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_prismarine"))));
		}
		if (isExist("prismarine_bricks")) {
			RegistryEvent<Block> SMALL_PRISMARINE_BRICK_STAIRS = registry.registerBlock(id("small_stairs_prismarine_bricks"), () -> Blocks.SMALL_PRISMARINE_BRICK_STAIRS);
			registry.registerItem(id("small_stairs_prismarine_bricks"), () -> ItemUtil.ofBlock(SMALL_PRISMARINE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_prismarine_bricks"))));
		}
		if (isExist("dark_prismarine")) {
			RegistryEvent<Block> SMALL_DARK_PRISMARINE_STAIRS = registry.registerBlock(id("small_stairs_dark_prismarine"), () -> Blocks.SMALL_DARK_PRISMARINE_STAIRS);
			registry.registerItem(id("small_stairs_dark_prismarine"), () -> ItemUtil.ofBlock(SMALL_DARK_PRISMARINE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_dark_prismarine"))));
		}
		if (isExist("smooth_sandstone")) {
			RegistryEvent<Block> SMALL_SMOOTH_SANDSTONE_STAIRS = registry.registerBlock(id("small_stairs_smooth_sandstone"), () -> Blocks.SMALL_SMOOTH_SANDSTONE_STAIRS);
			registry.registerItem(id("small_stairs_smooth_sandstone"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_SANDSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_sandstone"))));
		}
		if (isExist("smooth_red_sandstone")) {
			RegistryEvent<Block> SMALL_SMOOTH_RED_SANDSTONE_STAIRS = registry.registerBlock(id("small_stairs_smooth_red_sandstone"), () -> Blocks.SMALL_SMOOTH_RED_SANDSTONE_STAIRS);
			registry.registerItem(id("small_stairs_smooth_red_sandstone"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_RED_SANDSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_red_sandstone"))));
		}
		if (isExist("smooth_quartz")) {
			RegistryEvent<Block> SMALL_SMOOTH_QUARTZ_STAIRS = registry.registerBlock(id("small_stairs_smooth_quartz"), () -> Blocks.SMALL_SMOOTH_QUARTZ_STAIRS);
			registry.registerItem(id("small_stairs_smooth_quartz"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_QUARTZ_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_quartz"))));
		}
		if (isExist("smooth_stone")) {
			RegistryEvent<Block> SMALL_SMOOTH_STONE_STAIRS = registry.registerBlock(id("small_stairs_smooth_stone"), () -> Blocks.SMALL_SMOOTH_STONE_STAIRS);
			registry.registerItem(id("small_stairs_smooth_stone"), () -> ItemUtil.ofBlock(SMALL_SMOOTH_STONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_smooth_stone"))));
		}
		if (isExist("mossy_cobblestone")) {
			RegistryEvent<Block> SMALL_MOSSY_COBBLESTONE_STAIRS = registry.registerBlock(id("small_stairs_mossy_cobblestone"), () -> Blocks.SMALL_MOSSY_COBBLESTONE_STAIRS);
			registry.registerItem(id("small_stairs_mossy_cobblestone"), () -> ItemUtil.ofBlock(SMALL_MOSSY_COBBLESTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_mossy_cobblestone"))));
		}
		if (isExist("mossy_stone_bricks")) {
			RegistryEvent<Block> SMALL_MOSSY_STONE_BRICK_STAIRS = registry.registerBlock(id("small_stairs_mossy_stone_bricks"), () -> Blocks.SMALL_MOSSY_STONE_BRICK_STAIRS);
			registry.registerItem(id("small_stairs_mossy_stone_bricks"), () -> ItemUtil.ofBlock(SMALL_MOSSY_STONE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_mossy_stone_bricks"))));
		}
		if (isExist("end_stone_bricks")) {
			RegistryEvent<Block> SMALL_END_STONE_BRICK_STAIRS = registry.registerBlock(id("small_stairs_end_stone_bricks"), () -> Blocks.SMALL_END_STONE_BRICK_STAIRS);
			registry.registerItem(id("small_stairs_end_stone_bricks"), () -> ItemUtil.ofBlock(SMALL_END_STONE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_end_stone_bricks"))));
		}

		if (isExist("deepslate")) {
			RegistryEvent<Block> SMALL_DEEPSLATE_STAIRS = registry.registerBlock(id("small_stairs_deepslate"), () -> Blocks.SMALL_DEEPSLATE_STAIRS);
			registry.registerItem(id("small_stairs_deepslate"), () -> ItemUtil.ofBlock(SMALL_DEEPSLATE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_deepslate"))));
		}
		if (isExist("deepslate_bricks")) {
			RegistryEvent<Block> SMALL_DEEPSLATE_BRICK_STAIRS = registry.registerBlock(id("small_stairs_deepslate_bricks"), () -> Blocks.SMALL_DEEPSLATE_BRICK_STAIRS);
			registry.registerItem(id("small_stairs_deepslate_bricks"), () -> ItemUtil.ofBlock(SMALL_DEEPSLATE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_deepslate_bricks"))));
		}
		if (isExist("deepslate_tiles")) {
			RegistryEvent<Block> SMALL_DEEPSLATE_TILE_STAIRS = registry.registerBlock(id("small_stairs_deepslate_tiles"), () -> Blocks.SMALL_DEEPSLATE_TILE_STAIRS);
			registry.registerItem(id("small_stairs_deepslate_tiles"), () -> ItemUtil.ofBlock(SMALL_DEEPSLATE_TILE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_deepslate_tiles"))));
		}
		if (isExist("polished_deepslate")) {
			RegistryEvent<Block> SMALL_POLISHED_DEEPSLATE_STAIRS = registry.registerBlock(id("small_stairs_polished_deepslate"), () -> Blocks.SMALL_POLISHED_DEEPSLATE_STAIRS);
			registry.registerItem(id("small_stairs_polished_deepslate"), () -> ItemUtil.ofBlock(SMALL_POLISHED_DEEPSLATE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_deepslate"))));
		}
		if (isExist("cobbled_deepslate")) {
			RegistryEvent<Block> SMALL_COBBLED_DEEPSLATE_STAIRS = registry.registerBlock(id("small_stairs_cobbled_deepslate"), () -> Blocks.SMALL_COBBLED_DEEPSLATE_STAIRS);
			registry.registerItem(id("small_stairs_cobbled_deepslate"), () -> ItemUtil.ofBlock(SMALL_COBBLED_DEEPSLATE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cobbled_deepslate"))));
		}

		if (isExist("blackstone")) {
			RegistryEvent<Block> SMALL_BLACKSTONE_STAIRS = registry.registerBlock(id("small_stairs_blackstone"), () -> Blocks.SMALL_BLACKSTONE_STAIRS);
			registry.registerItem(id("small_stairs_blackstone"), () -> ItemUtil.ofBlock(SMALL_BLACKSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_blackstone"))));
		}
		if (isExist("polished_blackstone")) {
			RegistryEvent<Block> SMALL_POLISHED_BLACKSTONE_STAIRS = registry.registerBlock(id("small_stairs_polished_blackstone"), () -> Blocks.SMALL_POLISHED_BLACKSTONE_STAIRS);
			registry.registerItem(id("small_stairs_polished_blackstone"), () -> ItemUtil.ofBlock(SMALL_POLISHED_BLACKSTONE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_blackstone"))));
		}
		if (isExist("polished_blackstone_bricks")) {
			RegistryEvent<Block> SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registry.registerBlock(id("small_stairs_polished_blackstone_bricks"), () -> Blocks.SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS);
			registry.registerItem(id("small_stairs_polished_blackstone_bricks"), () -> ItemUtil.ofBlock(SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_blackstone_bricks"))));
		}

		if (isExist("andesite")) {
			RegistryEvent<Block> SMALL_ANDESITE_STAIRS = registry.registerBlock(id("small_stairs_andesite"), () -> Blocks.SMALL_ANDESITE_STAIRS);
			registry.registerItem(id("small_stairs_andesite"), () -> ItemUtil.ofBlock(SMALL_ANDESITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_andesite"))));
		}
		if (isExist("diorite")) {
			RegistryEvent<Block> SMALL_DIORITE_STAIRS = registry.registerBlock(id("small_stairs_diorite"), () -> Blocks.SMALL_DIORITE_STAIRS);
			registry.registerItem(id("small_stairs_diorite"), () -> ItemUtil.ofBlock(SMALL_DIORITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_diorite"))));
		}
		if (isExist("granite")) {
			RegistryEvent<Block> SMALL_GRANITE_STAIRS = registry.registerBlock(id("small_stairs_granite"), () -> Blocks.SMALL_GRANITE_STAIRS);
			registry.registerItem(id("small_stairs_granite"), () -> ItemUtil.ofBlock(SMALL_GRANITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_granite"))));
		}
		if (isExist("polished_andesite")) {
			RegistryEvent<Block> SMALL_POLISHED_ANDESITE_STAIRS = registry.registerBlock(id("small_stairs_polished_andesite"), () -> Blocks.SMALL_POLISHED_ANDESITE_STAIRS);
			registry.registerItem(id("small_stairs_polished_andesite"), () -> ItemUtil.ofBlock(SMALL_POLISHED_ANDESITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_andesite"))));
		}
		if (isExist("polished_diorite")) {
			RegistryEvent<Block> SMALL_POLISHED_DIORITE_STAIRS = registry.registerBlock(id("small_stairs_polished_diorite"), () -> Blocks.SMALL_POLISHED_DIORITE_STAIRS);
			registry.registerItem(id("small_stairs_polished_diorite"), () -> ItemUtil.ofBlock(SMALL_POLISHED_DIORITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_diorite"))));
		}
		if (isExist("polished_granite")) {
			RegistryEvent<Block> SMALL_POLISHED_GRANITE_STAIRS = registry.registerBlock(id("small_stairs_polished_granite"), () -> Blocks.SMALL_POLISHED_GRANITE_STAIRS);
			registry.registerItem(id("small_stairs_polished_granite"), () -> ItemUtil.ofBlock(SMALL_POLISHED_GRANITE_STAIRS.getOrNull(), new CompatibleItemSettings().addGroup(DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_polished_granite"))));
		}





		registry.allRegister();
	}

	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
}

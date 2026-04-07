package net.pitan76.additionalsmallstairs;

import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.midohra.block.BlockWrapper;
import net.pitan76.smallstairs.SmallStairBlock;

import static net.pitan76.additionalsmallstairs.AdditionalSmallStairs._id;
import static net.pitan76.additionalsmallstairs.AdditionalSmallStairs.isExist;

public class Blocks {
    public static SmallStairBlock SMALL_CUT_COPPER_STAIRS;
    public static SmallStairBlock SMALL_EXPOSED_CUT_COPPER_STAIRS;
    public static SmallStairBlock SMALL_WEATHERED_CUT_COPPER_STAIRS;
    public static SmallStairBlock SMALL_OXIDIZED_CUT_COPPER_STAIRS;
    public static SmallStairBlock SMALL_WAXED_CUT_COPPER_STAIRS;
    public static SmallStairBlock SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS;
    public static SmallStairBlock SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS;
    public static SmallStairBlock SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS;

    public static SmallStairBlock SMALL_MUD_BRICK_STAIRS;
    public static SmallStairBlock SMALL_CHERRY_PLANKS_STAIRS;
    public static SmallStairBlock SMALL_BAMBOO_STAIRS;
    public static SmallStairBlock SMALL_BAMBOO_MOSAIC_STAIRS;
    public static SmallStairBlock SMALL_PRISMARINE_STAIRS;
    public static SmallStairBlock SMALL_PRISMARINE_BRICK_STAIRS;
    public static SmallStairBlock SMALL_DARK_PRISMARINE_STAIRS;
    public static SmallStairBlock SMALL_SMOOTH_RED_SANDSTONE_STAIRS;
    public static SmallStairBlock SMALL_SMOOTH_SANDSTONE_STAIRS;
    public static SmallStairBlock SMALL_SMOOTH_QUARTZ_STAIRS;
    public static SmallStairBlock SMALL_SMOOTH_STONE_STAIRS;
    public static SmallStairBlock SMALL_MOSSY_COBBLESTONE_STAIRS;
    public static SmallStairBlock SMALL_MOSSY_STONE_BRICK_STAIRS;
    public static SmallStairBlock SMALL_END_STONE_BRICK_STAIRS;

    public static SmallStairBlock SMALL_DEEPSLATE_STAIRS;
    public static SmallStairBlock SMALL_DEEPSLATE_BRICK_STAIRS;
    public static SmallStairBlock SMALL_DEEPSLATE_TILE_STAIRS;
    public static SmallStairBlock SMALL_POLISHED_DEEPSLATE_STAIRS;
    public static SmallStairBlock SMALL_COBBLED_DEEPSLATE_STAIRS;

    public static SmallStairBlock SMALL_BLACKSTONE_STAIRS;
    public static SmallStairBlock SMALL_POLISHED_BLACKSTONE_STAIRS;
    public static SmallStairBlock SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS;

    public static SmallStairBlock SMALL_ANDESITE_STAIRS;
    public static SmallStairBlock SMALL_POLISHED_ANDESITE_STAIRS;
    public static SmallStairBlock SMALL_DIORITE_STAIRS;
    public static SmallStairBlock SMALL_POLISHED_DIORITE_STAIRS;
    public static SmallStairBlock SMALL_GRANITE_STAIRS;
    public static SmallStairBlock SMALL_POLISHED_GRANITE_STAIRS;

    static {
        if (isExist("cut_copper"))
            SMALL_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_cut_copper"), BlockWrapper.of("cut_copper").get()));
        else
            SMALL_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_cut_copper"), BlockWrapper.of("stone").get()));
        if (isExist("exposed_cut_copper"))
            SMALL_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("exposed_cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_exposed_cut_copper"), BlockWrapper.of("exposed_cut_copper").get()));
        else
            SMALL_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_exposed_cut_copper"), BlockWrapper.of("stone").get()));
        if (isExist("weathered_cut_copper"))
            SMALL_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("weathered_cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_weathered_cut_copper"), BlockWrapper.of("weathered_cut_copper").get()));
        else
            SMALL_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_weathered_cut_copper"), BlockWrapper.of("stone").get()));
        if (isExist("oxidized_cut_copper"))
            SMALL_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("oxidized_cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_oxidized_cut_copper"), BlockWrapper.of("oxidized_cut_copper").get()));
        else
            SMALL_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_oxidized_cut_copper"), BlockWrapper.of("stone").get()));
        if (isExist("waxed_cut_copper"))
            SMALL_WAXED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("waxed_cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_cut_copper"), BlockWrapper.of("waxed_cut_copper").get()));
        else
            SMALL_WAXED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_cut_copper"), BlockWrapper.of("stone").get()));
        if (isExist("waxed_exposed_cut_copper"))
            SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("waxed_exposed_cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_exposed_cut_copper"), BlockWrapper.of("waxed_exposed_cut_copper").get()));
        else
            SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_exposed_cut_copper"), BlockWrapper.of("stone").get()));
        if (isExist("waxed_weathered_cut_copper"))
            SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("waxed_weathered_cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_weathered_cut_copper"), BlockWrapper.of("waxed_weathered_cut_copper").get()));
        else
            SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_weathered_cut_copper"), BlockWrapper.of("stone").get()));
        if (isExist("waxed_oxidized_cut_copper"))
            SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("waxed_oxidized_cut_copper"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_oxidized_cut_copper"), BlockWrapper.of("waxed_oxidized_cut_copper").get()));
        else
            SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_waxed_oxidized_cut_copper"), BlockWrapper.of("stone").get()));

        if (isExist("mud_bricks"))
            SMALL_MUD_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("mud_bricks"), CompatibleBlockSettings.copy(_id("small_stairs_mud_bricks"), BlockWrapper.of("mud_bricks").get()));
        else
            SMALL_MUD_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_mud_bricks"), BlockWrapper.of("stone").get()));
        if (isExist("cherry_planks"))
            SMALL_CHERRY_PLANKS_STAIRS = new SmallStairBlock(BlockWrapper.of("cherry_planks"), CompatibleBlockSettings.copy(_id("small_stairs_cherry_planks"), BlockWrapper.of("cherry_planks").get()));
        else
            SMALL_CHERRY_PLANKS_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_cherry_planks"), BlockWrapper.of("stone").get()));
        if (isExist("bamboo_planks"))
            SMALL_BAMBOO_STAIRS = new SmallStairBlock(BlockWrapper.of("bamboo_planks"), CompatibleBlockSettings.copy(_id("small_stairs_bamboo"), BlockWrapper.of("bamboo_planks").get()));
        else
            SMALL_BAMBOO_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_bamboo"), BlockWrapper.of("stone").get()));
        if (isExist("bamboo_mosaic"))
            SMALL_BAMBOO_MOSAIC_STAIRS = new SmallStairBlock(BlockWrapper.of("bamboo_mosaic"), CompatibleBlockSettings.copy(_id("small_stairs_bamboo_mosaic"), BlockWrapper.of("bamboo_mosaic").get()));
        else
            SMALL_BAMBOO_MOSAIC_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_bamboo_mosaic"), BlockWrapper.of("stone").get()));
        if (isExist("prismarine"))
            SMALL_PRISMARINE_STAIRS = new SmallStairBlock(BlockWrapper.of("prismarine"), CompatibleBlockSettings.copy(_id("small_stairs_prismarine"), BlockWrapper.of("prismarine").get()));
        else
            SMALL_PRISMARINE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_prismarine"), BlockWrapper.of("stone").get()));
        if (isExist("prismarine_bricks"))
            SMALL_PRISMARINE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("prismarine_bricks"), CompatibleBlockSettings.copy(_id("small_stairs_prismarine_bricks"), BlockWrapper.of("prismarine_bricks").get()));
        else
            SMALL_PRISMARINE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_prismarine_bricks"), BlockWrapper.of("stone").get()));
        if (isExist("dark_prismarine"))
            SMALL_DARK_PRISMARINE_STAIRS = new SmallStairBlock(BlockWrapper.of("dark_prismarine"), CompatibleBlockSettings.copy(_id("small_stairs_dark_prismarine"), BlockWrapper.of("dark_prismarine").get()));
        else
            SMALL_DARK_PRISMARINE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_dark_prismarine"), BlockWrapper.of("stone").get()));
        if (isExist("smooth_red_sandstone"))
            SMALL_SMOOTH_RED_SANDSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("smooth_red_sandstone"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_red_sandstone"), BlockWrapper.of("smooth_red_sandstone").get()));
        else
            SMALL_SMOOTH_RED_SANDSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_red_sandstone"), BlockWrapper.of("stone").get()));
        if (isExist("smooth_sandstone"))
            SMALL_SMOOTH_SANDSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("smooth_sandstone"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_sandstone"), BlockWrapper.of("smooth_sandstone").get()));
        else
            SMALL_SMOOTH_SANDSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_sandstone"), BlockWrapper.of("stone").get()));
        if (isExist("smooth_quartz"))
            SMALL_SMOOTH_QUARTZ_STAIRS = new SmallStairBlock(BlockWrapper.of("smooth_quartz"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_quartz"), BlockWrapper.of("smooth_quartz").get()));
        else
            SMALL_SMOOTH_QUARTZ_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_quartz"), BlockWrapper.of("stone").get()));
        if (isExist("smooth_stone"))
            SMALL_SMOOTH_STONE_STAIRS = new SmallStairBlock(BlockWrapper.of("smooth_stone"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_stone"), BlockWrapper.of("smooth_stone").get()));
        else
            SMALL_SMOOTH_STONE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_smooth_stone"), BlockWrapper.of("stone").get()));
        if (isExist("mossy_cobblestone"))
            SMALL_MOSSY_COBBLESTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("mossy_cobblestone"), CompatibleBlockSettings.copy(_id("small_stairs_mossy_cobblestone"), BlockWrapper.of("mossy_cobblestone").get()));
        else
            SMALL_MOSSY_COBBLESTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_mossy_cobblestone"), BlockWrapper.of("stone").get()));
        if (isExist("mossy_stone_bricks"))
            SMALL_MOSSY_STONE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("mossy_stone_bricks"), CompatibleBlockSettings.copy(_id("small_stairs_mossy_stone_bricks"), BlockWrapper.of("mossy_stone_bricks").get()));
        else
            SMALL_MOSSY_STONE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_mossy_stone_bricks"), BlockWrapper.of("stone").get()));
        if (isExist("end_stone_bricks"))
            SMALL_END_STONE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("end_stone_bricks"), CompatibleBlockSettings.copy(_id("small_stairs_end_stone_bricks"), BlockWrapper.of("end_stone_bricks").get()));
        else
            SMALL_END_STONE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_end_stone_bricks"), BlockWrapper.of("stone").get()));

        if (isExist("deepslate"))
            SMALL_DEEPSLATE_STAIRS = new SmallStairBlock(BlockWrapper.of("deepslate"), CompatibleBlockSettings.copy(_id("small_stairs_deepslate"), BlockWrapper.of("deepslate").get()));
        else
            SMALL_DEEPSLATE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_deepslate"), BlockWrapper.of("stone").get()));
        if (isExist("deepslate_bricks"))
            SMALL_DEEPSLATE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("deepslate_bricks"), CompatibleBlockSettings.copy(_id("small_stairs_deepslate_bricks"), BlockWrapper.of("deepslate_bricks").get()));
        else
            SMALL_DEEPSLATE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_deepslate_bricks"), BlockWrapper.of("stone").get()));
        if (isExist("deepslate_tiles"))
            SMALL_DEEPSLATE_TILE_STAIRS = new SmallStairBlock(BlockWrapper.of("deepslate_tiles"), CompatibleBlockSettings.copy(_id("small_stairs_deepslate_tiles"), BlockWrapper.of("deepslate_tiles").get()));
        else
            SMALL_DEEPSLATE_TILE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_deepslate_tiles"), BlockWrapper.of("stone").get()));
        if (isExist("polished_deepslate"))
            SMALL_POLISHED_DEEPSLATE_STAIRS = new SmallStairBlock(BlockWrapper.of("polished_deepslate"), CompatibleBlockSettings.copy(_id("small_stairs_polished_deepslate"), BlockWrapper.of("polished_deepslate").get()));
        else
            SMALL_POLISHED_DEEPSLATE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_polished_deepslate"), BlockWrapper.of("stone").get()));
        if (isExist("cobbled_deepslate"))
            SMALL_COBBLED_DEEPSLATE_STAIRS = new SmallStairBlock(BlockWrapper.of("cobbled_deepslate"), CompatibleBlockSettings.copy(_id("small_stairs_cobbled_deepslate"), BlockWrapper.of("cobbled_deepslate").get()));
        else
            SMALL_COBBLED_DEEPSLATE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_cobbled_deepslate"), BlockWrapper.of("stone").get()));

        if (isExist("blackstone"))
            SMALL_BLACKSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("blackstone"), CompatibleBlockSettings.copy(_id("small_stairs_blackstone"), BlockWrapper.of("blackstone").get()));
        else
            SMALL_BLACKSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_blackstone"), BlockWrapper.of("stone").get()));
        if (isExist("polished_blackstone"))
            SMALL_POLISHED_BLACKSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("polished_blackstone"), CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone"), BlockWrapper.of("polished_blackstone").get()));
        else
            SMALL_POLISHED_BLACKSTONE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone"), BlockWrapper.of("stone").get()));
        if (isExist("polished_blackstone_bricks"))
            SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("polished_blackstone_bricks"), CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone_bricks"), BlockWrapper.of("polished_blackstone_bricks").get()));
        else
            SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone_bricks"), BlockWrapper.of("stone").get()));
        
        if (isExist("andesite"))
            SMALL_ANDESITE_STAIRS = new SmallStairBlock(BlockWrapper.of("andesite"), CompatibleBlockSettings.copy(_id("small_stairs_andesite"), BlockWrapper.of("andesite").get()));
        else
            SMALL_ANDESITE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_andesite"), BlockWrapper.of("stone").get()));
        if (isExist("polished_andesite"))
            SMALL_POLISHED_ANDESITE_STAIRS = new SmallStairBlock(BlockWrapper.of("polished_andesite"), CompatibleBlockSettings.copy(_id("small_stairs_polished_andesite"), BlockWrapper.of("polished_andesite").get()));
        else
            SMALL_POLISHED_ANDESITE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_polished_andesite"), BlockWrapper.of("stone").get()));
        if (isExist("diorite"))
            SMALL_DIORITE_STAIRS = new SmallStairBlock(BlockWrapper.of("diorite"), CompatibleBlockSettings.copy(_id("small_stairs_diorite"), BlockWrapper.of("diorite").get()));
        else
            SMALL_DIORITE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_diorite"), BlockWrapper.of("stone").get()));
        if (isExist("polished_diorite"))
            SMALL_POLISHED_DIORITE_STAIRS = new SmallStairBlock(BlockWrapper.of("polished_diorite"), CompatibleBlockSettings.copy(_id("small_stairs_polished_diorite"), BlockWrapper.of("polished_diorite").get()));
        else
            SMALL_POLISHED_DIORITE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_polished_diorite"), BlockWrapper.of("stone").get()));
        if (isExist("granite"))
            SMALL_GRANITE_STAIRS = new SmallStairBlock(BlockWrapper.of("granite"), CompatibleBlockSettings.copy(_id("small_stairs_granite"), BlockWrapper.of("granite").get()));
        else
            SMALL_GRANITE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_granite"), BlockWrapper.of("stone").get()));
        if (isExist("polished_granite"))
            SMALL_POLISHED_GRANITE_STAIRS = new SmallStairBlock(BlockWrapper.of("polished_granite"), CompatibleBlockSettings.copy(_id("small_stairs_polished_granite"), BlockWrapper.of("polished_granite").get()));
        else
            SMALL_POLISHED_GRANITE_STAIRS = new SmallStairBlock(BlockWrapper.of("stone"), CompatibleBlockSettings.copy(_id("small_stairs_polished_granite"), BlockWrapper.of("stone").get()));
    }
}

package net.pitan76.additionalsmallstairs;

import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
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
            SMALL_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_cut_copper"), net.minecraft.block.Blocks.CUT_COPPER));
        else
            SMALL_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_cut_copper"), net.minecraft.block.Blocks.STONE));
        if (isExist("exposed_cut_copper"))
            SMALL_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.EXPOSED_CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_exposed_cut_copper"), net.minecraft.block.Blocks.EXPOSED_CUT_COPPER));
        else
            SMALL_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_exposed_cut_copper"), net.minecraft.block.Blocks.STONE));
        if (isExist("weathered_cut_copper"))
            SMALL_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.WEATHERED_CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_weathered_cut_copper"), net.minecraft.block.Blocks.WEATHERED_CUT_COPPER));
        else
            SMALL_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_weathered_cut_copper"), net.minecraft.block.Blocks.STONE));
        if (isExist("oxidized_cut_copper"))
            SMALL_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.OXIDIZED_CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_oxidized_cut_copper"), net.minecraft.block.Blocks.OXIDIZED_CUT_COPPER));
        else
            SMALL_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_oxidized_cut_copper"), net.minecraft.block.Blocks.STONE));
        if (isExist("waxed_cut_copper"))
            SMALL_WAXED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.WAXED_CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_waxed_cut_copper"), net.minecraft.block.Blocks.WAXED_CUT_COPPER));
        else
            SMALL_WAXED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_waxed_cut_copper"), net.minecraft.block.Blocks.STONE));
        if (isExist("waxed_exposed_cut_copper"))
            SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.WAXED_EXPOSED_CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_waxed_exposed_cut_copper"), net.minecraft.block.Blocks.WAXED_EXPOSED_CUT_COPPER));
        else
            SMALL_WAXED_EXPOSED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_waxed_exposed_cut_copper"), net.minecraft.block.Blocks.STONE));
        if (isExist("waxed_weathered_cut_copper"))
            SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.WAXED_WEATHERED_CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_waxed_weathered_cut_copper"), net.minecraft.block.Blocks.WAXED_WEATHERED_CUT_COPPER));
        else
            SMALL_WAXED_WEATHERED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_waxed_weathered_cut_copper"), net.minecraft.block.Blocks.STONE));
        if (isExist("waxed_oxidized_cut_copper"))
            SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.WAXED_OXIDIZED_CUT_COPPER, CompatibleBlockSettings.copy(_id("small_stairs_waxed_oxidized_cut_copper"), net.minecraft.block.Blocks.WAXED_OXIDIZED_CUT_COPPER));
        else
            SMALL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_waxed_oxidized_cut_copper"), net.minecraft.block.Blocks.STONE));

        if (isExist("mud_bricks"))
            SMALL_MUD_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.MUD_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_mud_bricks"), net.minecraft.block.Blocks.MUD_BRICKS));
        else
            SMALL_MUD_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_mud_bricks"), net.minecraft.block.Blocks.STONE));
        if (isExist("cherry_planks"))
            SMALL_CHERRY_PLANKS_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.CHERRY_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_cherry_planks"), net.minecraft.block.Blocks.CHERRY_PLANKS));
        else
            SMALL_CHERRY_PLANKS_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_cherry_planks"), net.minecraft.block.Blocks.STONE));
        if (isExist("bamboo_planks"))
            SMALL_BAMBOO_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.BAMBOO_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_bamboo"), net.minecraft.block.Blocks.BAMBOO_PLANKS));
        else
            SMALL_BAMBOO_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_bamboo"), net.minecraft.block.Blocks.STONE));
        if (isExist("bamboo_mosaic"))
            SMALL_BAMBOO_MOSAIC_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.BAMBOO_MOSAIC, CompatibleBlockSettings.copy(_id("small_stairs_bamboo_mosaic"), net.minecraft.block.Blocks.BAMBOO_MOSAIC));
        else
            SMALL_BAMBOO_MOSAIC_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_bamboo_mosaic"), net.minecraft.block.Blocks.STONE));
        if (isExist("prismarine"))
            SMALL_PRISMARINE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.PRISMARINE, CompatibleBlockSettings.copy(_id("small_stairs_prismarine"), net.minecraft.block.Blocks.PRISMARINE));
        else
            SMALL_PRISMARINE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_prismarine"), net.minecraft.block.Blocks.STONE));
        if (isExist("prismarine_bricks"))
            SMALL_PRISMARINE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.PRISMARINE_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_prismarine_bricks"), net.minecraft.block.Blocks.PRISMARINE_BRICKS));
        else
            SMALL_PRISMARINE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_prismarine_bricks"), net.minecraft.block.Blocks.STONE));
        if (isExist("dark_prismarine"))
            SMALL_DARK_PRISMARINE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.DARK_PRISMARINE, CompatibleBlockSettings.copy(_id("small_stairs_dark_prismarine"), net.minecraft.block.Blocks.DARK_PRISMARINE));
        else
            SMALL_DARK_PRISMARINE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_dark_prismarine"), net.minecraft.block.Blocks.STONE));
        if (isExist("smooth_red_sandstone"))
            SMALL_SMOOTH_RED_SANDSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.SMOOTH_RED_SANDSTONE, CompatibleBlockSettings.copy(_id("small_stairs_smooth_red_sandstone"), net.minecraft.block.Blocks.SMOOTH_RED_SANDSTONE));
        else
            SMALL_SMOOTH_RED_SANDSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_smooth_red_sandstone"), net.minecraft.block.Blocks.STONE));
        if (isExist("smooth_sandstone"))
            SMALL_SMOOTH_SANDSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.SMOOTH_SANDSTONE, CompatibleBlockSettings.copy(_id("small_stairs_smooth_sandstone"), net.minecraft.block.Blocks.SMOOTH_SANDSTONE));
        else
            SMALL_SMOOTH_SANDSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_smooth_sandstone"), net.minecraft.block.Blocks.STONE));
        if (isExist("smooth_quartz"))
            SMALL_SMOOTH_QUARTZ_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.SMOOTH_QUARTZ, CompatibleBlockSettings.copy(_id("small_stairs_smooth_quartz"), net.minecraft.block.Blocks.SMOOTH_QUARTZ));
        else
            SMALL_SMOOTH_QUARTZ_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_smooth_quartz"), net.minecraft.block.Blocks.STONE));
        if (isExist("smooth_stone"))
            SMALL_SMOOTH_STONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.SMOOTH_STONE, CompatibleBlockSettings.copy(_id("small_stairs_smooth_stone"), net.minecraft.block.Blocks.SMOOTH_STONE));
        else
            SMALL_SMOOTH_STONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_smooth_stone"), net.minecraft.block.Blocks.STONE));
        if (isExist("mossy_cobblestone"))
            SMALL_MOSSY_COBBLESTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.MOSSY_COBBLESTONE, CompatibleBlockSettings.copy(_id("small_stairs_mossy_cobblestone"), net.minecraft.block.Blocks.MOSSY_COBBLESTONE));
        else
            SMALL_MOSSY_COBBLESTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_mossy_cobblestone"), net.minecraft.block.Blocks.STONE));
        if (isExist("mossy_stone_bricks"))
            SMALL_MOSSY_STONE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.MOSSY_STONE_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_mossy_stone_bricks"), net.minecraft.block.Blocks.MOSSY_STONE_BRICKS));
        else
            SMALL_MOSSY_STONE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_mossy_stone_bricks"), net.minecraft.block.Blocks.STONE));
        if (isExist("end_stone_bricks"))
            SMALL_END_STONE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.END_STONE_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_end_stone_bricks"), net.minecraft.block.Blocks.END_STONE_BRICKS));
        else
            SMALL_END_STONE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_end_stone_bricks"), net.minecraft.block.Blocks.STONE));

        if (isExist("deepslate"))
            SMALL_DEEPSLATE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.DEEPSLATE, CompatibleBlockSettings.copy(_id("small_stairs_deepslate"), net.minecraft.block.Blocks.DEEPSLATE));
        else
            SMALL_DEEPSLATE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_deepslate"), net.minecraft.block.Blocks.STONE));
        if (isExist("deepslate_bricks"))
            SMALL_DEEPSLATE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.DEEPSLATE_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_deepslate_bricks"), net.minecraft.block.Blocks.DEEPSLATE_BRICKS));
        else
            SMALL_DEEPSLATE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_deepslate_bricks"), net.minecraft.block.Blocks.STONE));
        if (isExist("deepslate_tiles"))
            SMALL_DEEPSLATE_TILE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.DEEPSLATE_TILES, CompatibleBlockSettings.copy(_id("small_stairs_deepslate_tiles"), net.minecraft.block.Blocks.DEEPSLATE_TILES));
        else
            SMALL_DEEPSLATE_TILE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_deepslate_tiles"), net.minecraft.block.Blocks.STONE));
        if (isExist("polished_deepslate"))
            SMALL_POLISHED_DEEPSLATE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.POLISHED_DEEPSLATE, CompatibleBlockSettings.copy(_id("small_stairs_polished_deepslate"), net.minecraft.block.Blocks.POLISHED_DEEPSLATE));
        else
            SMALL_POLISHED_DEEPSLATE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_polished_deepslate"), net.minecraft.block.Blocks.STONE));
        if (isExist("cobbled_deepslate"))
            SMALL_COBBLED_DEEPSLATE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.COBBLED_DEEPSLATE, CompatibleBlockSettings.copy(_id("small_stairs_cobbled_deepslate"), net.minecraft.block.Blocks.COBBLED_DEEPSLATE));
        else
            SMALL_COBBLED_DEEPSLATE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_cobbled_deepslate"), net.minecraft.block.Blocks.STONE));

        if (isExist("blackstone"))
            SMALL_BLACKSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.BLACKSTONE, CompatibleBlockSettings.copy(_id("small_stairs_blackstone"), net.minecraft.block.Blocks.BLACKSTONE));
        else
            SMALL_BLACKSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_blackstone"), net.minecraft.block.Blocks.STONE));
        if (isExist("polished_blackstone"))
            SMALL_POLISHED_BLACKSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.POLISHED_BLACKSTONE, CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone"), net.minecraft.block.Blocks.POLISHED_BLACKSTONE));
        else
            SMALL_POLISHED_BLACKSTONE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone"), net.minecraft.block.Blocks.STONE));
        if (isExist("polished_blackstone_bricks"))
            SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.POLISHED_BLACKSTONE_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone_bricks"), net.minecraft.block.Blocks.POLISHED_BLACKSTONE_BRICKS));
        else
            SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_polished_blackstone_bricks"), net.minecraft.block.Blocks.STONE));
        
        if (isExist("andesite"))
            SMALL_ANDESITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.ANDESITE, CompatibleBlockSettings.copy(_id("small_stairs_andesite"), net.minecraft.block.Blocks.ANDESITE));
        else
            SMALL_ANDESITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_andesite"), net.minecraft.block.Blocks.STONE));
        if (isExist("polished_andesite"))
            SMALL_POLISHED_ANDESITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.POLISHED_ANDESITE, CompatibleBlockSettings.copy(_id("small_stairs_polished_andesite"), net.minecraft.block.Blocks.POLISHED_ANDESITE));
        else
            SMALL_POLISHED_ANDESITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_polished_andesite"), net.minecraft.block.Blocks.STONE));
        if (isExist("diorite"))
            SMALL_DIORITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.DIORITE, CompatibleBlockSettings.copy(_id("small_stairs_diorite"), net.minecraft.block.Blocks.DIORITE));
        else
            SMALL_DIORITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_diorite"), net.minecraft.block.Blocks.STONE));
        if (isExist("polished_diorite"))
            SMALL_POLISHED_DIORITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.POLISHED_DIORITE, CompatibleBlockSettings.copy(_id("small_stairs_polished_diorite"), net.minecraft.block.Blocks.POLISHED_DIORITE));
        else
            SMALL_POLISHED_DIORITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_polished_diorite"), net.minecraft.block.Blocks.STONE));
        if (isExist("granite"))
            SMALL_GRANITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.GRANITE, CompatibleBlockSettings.copy(_id("small_stairs_granite"), net.minecraft.block.Blocks.GRANITE));
        else
            SMALL_GRANITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_granite"), net.minecraft.block.Blocks.STONE));
        if (isExist("polished_granite"))
            SMALL_POLISHED_GRANITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.POLISHED_GRANITE, CompatibleBlockSettings.copy(_id("small_stairs_polished_granite"), net.minecraft.block.Blocks.POLISHED_GRANITE));
        else
            SMALL_POLISHED_GRANITE_STAIRS = new SmallStairBlock(net.minecraft.block.Blocks.STONE, CompatibleBlockSettings.copy(_id("small_stairs_polished_granite"), net.minecraft.block.Blocks.STONE));
    }
}

package net.pitan76.additionalsmallstairs.neoforge;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.pitan76.additionalsmallstairs.AdditionalSmallStairs;

@Mod(AdditionalSmallStairs.MOD_ID)
public class AdditionalSmallStairsNeoForge {
    public AdditionalSmallStairsNeoForge(ModContainer modContainer) {
        new AdditionalSmallStairs();
    }
}
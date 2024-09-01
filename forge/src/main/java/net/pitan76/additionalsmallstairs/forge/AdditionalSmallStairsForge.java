package net.pitan76.additionalsmallstairs.forge;

import dev.architectury.platform.forge.EventBuses;
import net.pitan76.additionalsmallstairs.AdditionalSmallStairs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdditionalSmallStairs.MOD_ID)
public class AdditionalSmallStairsForge {
    public AdditionalSmallStairsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AdditionalSmallStairs.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            new AdditionalSmallStairs();
    }
}
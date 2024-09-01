package net.pitan76.additionalsmallstairs.fabric;

import net.pitan76.additionalsmallstairs.AdditionalSmallStairs;
import net.fabricmc.api.ModInitializer;

public class AdditionalSmallStairsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        new AdditionalSmallStairs();
    }
}
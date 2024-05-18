package org.valkyrienskies.vs_collections.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import org.valkyrienskies.vs_collections.VSCollectionsMod;
import org.valkyrienskies.mod.fabric.common.ValkyrienSkiesModFabric;

public class VSCollectionsModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // force VS2 to load before eureka
        new ValkyrienSkiesModFabric().onInitialize();

        VSCollectionsMod.init();
    }

    @Environment(EnvType.CLIENT)
    public static class Client implements ClientModInitializer {

        @Override
        public void onInitializeClient() {
            VSCollectionsMod.initClient();
        }
    }
}

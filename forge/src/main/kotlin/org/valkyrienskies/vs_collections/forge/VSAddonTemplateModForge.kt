package org.valkyrienskies.vs_collections.forge

import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import org.valkyrienskies.vs_collections.VSCollectionsMod
import org.valkyrienskies.vs_collections.VSCollectionsMod.init
import org.valkyrienskies.vs_collections.VSCollectionsMod.initClient
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(VSCollectionsMod.MOD_ID)
class VSCollectionsModForge {
    init {
        MOD_BUS.addListener { event: FMLClientSetupEvent? ->
            clientSetup(
                event
            )
        }
        init()
    }

    private fun clientSetup(event: FMLClientSetupEvent?) {
        initClient()
    }

    companion object {
        fun getModBus(): IEventBus = MOD_BUS
    }
}

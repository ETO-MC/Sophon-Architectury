package org.etomc.sophon.forge;

import dev.architectury.platform.forge.EventBuses;
import org.etomc.sophon.Sophon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Sophon.MOD_ID)
public class SophonForge {
    public SophonForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Sophon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Sophon.init();
    }
}

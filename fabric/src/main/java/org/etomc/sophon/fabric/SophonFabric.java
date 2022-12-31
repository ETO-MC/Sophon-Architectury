package org.etomc.sophon.fabric;

import org.etomc.sophon.Sophon;
import net.fabricmc.api.ModInitializer;

public class SophonFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Sophon.init();
    }
}

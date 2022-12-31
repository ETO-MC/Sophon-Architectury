package org.etomc.sophon.quilt;

import org.etomc.sophon.Sophon;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class SophonQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        Sophon.init();
    }
}

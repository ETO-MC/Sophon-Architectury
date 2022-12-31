package org.etomc.sophon.forge;

import net.minecraftforge.fml.ModList;
import org.etomc.sophon.SophonExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class SophonExpectPlatformImpl {
    /**
     * This is our actual method to {@link SophonExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}

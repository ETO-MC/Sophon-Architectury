package org.etomc.sophon.fabric;

import org.etomc.sophon.SophonExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class SophonExpectPlatformImpl {
    /**
     * This is our actual method to {@link SophonExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}

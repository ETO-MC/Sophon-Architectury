package org.etomc.sophon;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SophonConfig {
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .serializeNulls()
            .disableHtmlEscaping()
            .create();

    public List<String> bannedMods = new ArrayList<String>(Arrays.asList(
            "bacterium"
    ));

    public static SophonConfig loadConfigFile(File file) {
        SophonConfig config = null;

        if (file.exists()) {
            try (BufferedReader fileReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)
            )) {
                config = gson.fromJson(fileReader, SophonConfig.class);
            } catch (IOException e) {
                throw new RuntimeException("[Sophon] Problem occurred when trying to load config: ", e);
            }
        }
        if (config == null) {
            config = new SophonConfig();
        }

        config.saveConfigFile(file);
        return config;
    }

    public void saveConfigFile(File file) {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
            gson.toJson(this, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

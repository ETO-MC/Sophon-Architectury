package org.etomc.sophon;

import dev.architectury.platform.Platform;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sophon {
    public static final String MOD_ID = "sophon";

    static Path configFile = SophonExpectPlatform.getConfigDirectory().resolve("weterdorp.json");
    static SophonConfig config = SophonConfig.loadConfigFile(configFile.toFile());

    public static Boolean isModPartlyLoaded(List<String> modList) {
        ArrayList<String> list = (ArrayList<String>) modList;
        list.add("torcherino");	//torcherino must be banned from using because it's vicious
        for (String mod : list) {
            if (Platform.isModLoaded(mod)) return true;
        }
        return false;
    }

    public static String outputMemeWord() {
        Random random = new Random();
        ArrayList<String> memes = new ArrayList<String>();
        memes.add("傻孩子们，快跑！");
        memes.add("干扰实验结果成功。");
        memes.add("没关系的，都一样");
        memes.add("黑，真TM的黑啊");
        memes.add("新人请说出你的常用模组");
        memes.add("快护好自己的PY吧，朋友。");
        memes.add("在？PY又痒了？");
        memes.add("《MC开发可以有多愚蠢》");
        memes.add("便秘者罗辑，我是你的破（便）秘人");

        return memes.get(random.nextInt(memes.size())-1);
    }


    public static void init() {
        System.out.println(SophonExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());

        if (isModPartlyLoaded(config.bannedMods)) throw new RuntimeException(outputMemeWord());

    }
}

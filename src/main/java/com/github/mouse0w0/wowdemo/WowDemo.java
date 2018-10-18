package com.github.mouse0w0.wowdemo;

import com.github.mouse0w0.wow.WowPlatform;
import com.github.mouse0w0.wow.keybinding.Key;
import com.github.mouse0w0.wow.keybinding.ServerKeyBinding;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class WowDemo extends JavaPlugin {

    @Override
    public void onEnable() {
        WowPlatform.getRegistryManager().register(ServerKeyBinding.builder()
                .defaultKey(Key.KEY_H)
                .displayName("测试")
                .onPress(user -> ((Player) user.getSource()).sendMessage("Hello Wow!"))
                .build()
                .setRegistryName("wow:test"));
    }
}

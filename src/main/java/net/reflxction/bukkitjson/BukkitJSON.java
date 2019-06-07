package net.reflxction.bukkitjson;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * BukkitJSON: A Bukkit alternative to SimpleJSON, to allow running as a dependency for other plugins without needing
 * to embed the library itself
 */
public final class BukkitJSON extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("BukkitJSON successfully loaded!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("BukkitJSON successfully disabled!");
    }
}

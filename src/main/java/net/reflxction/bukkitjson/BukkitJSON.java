package net.reflxction.bukkitjson;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.net.InetAddress;

/**
 * BukkitJSON: A Bukkit alternative to SimpleJSON, to allow running as a dependency for other plugins without needing
 * to embed the library itself
 */
public final class BukkitJSON extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("BukkitJSON successfully loaded!");
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
			System.out.println(Bukkit.getIp());
			System.out.println(Bukkit.getPort());
		
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("BukkitJSON successfully disabled!");
    }
}

package me.plugincode.pomoc.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.plugincode.pomoc.commands.PomocCommand;

public class Main extends JavaPlugin {
	public void onEnable() {
        Bukkit.getLogger().info("[PluginCode-Pomoc] - Plugin zostal wlaczony!");
		this.getCommand("pomoc").setExecutor(new PomocCommand());
	}

}

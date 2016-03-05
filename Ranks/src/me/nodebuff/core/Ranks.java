package me.nodebuff.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import me.nodebuff.core.Commands.Rank;

public class Ranks extends JavaPlugin {

	public void onEnable() {
		getServer().getPluginCommand("ranks").setExecutor(new Rank());
		Bukkit.getConsoleSender().sendMessage("Ranks Enabled.");
	}
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("Ranks Disabled.");
	}
	

}

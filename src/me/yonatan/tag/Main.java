package me.yonatan.tag;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage("§aPlugin de tag ativado.");
		new PlayerTagUpdater().runTaskTimerAsynchronously(this, 20 , 20);
		
		Bukkit.getPluginManager().registerEvents(new TagListener(), this);
		
	}
	
	
}

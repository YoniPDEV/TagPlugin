package me.yonatan.tag;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TagListener implements Listener{

	@EventHandler
	public void aoentrar(PlayerJoinEvent e) {
		Player p = (Player) e.getPlayer();
		
		if(p.isOp() || p.hasPermission("*")) {
			PlayerTag.setTag(0, p, "§6[Master] ", "");
		}
		
	}
	
}

package me.yonatan.tag;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerTagUpdater extends BukkitRunnable{

	@Override
	public void run() {
		
		PlayerTag.updateTags();
		
	}	

}

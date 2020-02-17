package craft.nomad;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		
		if(event.getClickedBlock().getType() == Material.WATER) {
			
			if(event.getPlayer().getItemInHand().getType() == Material.BUCKET) {
				
				
				
			}
			
		}
		
	}
	
	/*
	 * Recursively change all water blocks to air, 
	 * and turn connecting blocks to sand, within 25 blocks of the player.
	 */
	public boolean desertify(Location l) {
		
		Material t = l.getBlock().getType();
		if(t != Material.STATIONARY_WATER && t != Material.WATER && t != Material.AIR) {
			
			l.getBlock().setType(Material.SAND);
			return true;
			
		}else {
			
		}
		
	}

}

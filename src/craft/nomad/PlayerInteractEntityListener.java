package craft.nomad;

import org.bukkit.Material;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractEntityListener implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEntityEvent event) {
	
		if(event.getRightClicked().getType() == EntityType.COW) {
			
			if(event.getPlayer().getItemInHand().getType() == Material.BUCKET) {
				
				((Damageable) event.getRightClicked()).setHealth(0);
				
			}
			
		}
		
	}
	
}

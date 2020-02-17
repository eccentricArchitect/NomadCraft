package craft.nomad;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;

public class EntityDeathListener implements Listener {
	
	@EventHandler
	public void onDeath(EntityDeathEvent event) {
		
		if(event.getEntity() instanceof Animals) {
			
			Random rand = new Random();
			int c = rand.nextInt(4);
			
			switch(c) {
			
			default:
				
				//Normal Drops
				
				break;
			case 0:
				
				//No Drops
				event.getDrops().clear();
				
				break;
				
			case 1:
			case 2:
				
				//Cursed Drops
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(Material.ROTTEN_FLESH));
				event.getDrops().add(new ItemStack(Material.ROTTEN_FLESH));
				event.getDrops().add(new ItemStack(Material.SAND));
				
				break;
				
			
			}
			
		}
		
	}

}

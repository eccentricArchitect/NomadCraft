package craft.nomad;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;

public class SpawnListener implements Listener {
	
	@EventHandler
	public void onSpawn(EntitySpawnEvent event) {
		
		Entity e = event.getEntity();
		
		if(e instanceof Monster) {
			
			ItemStack helm = new ItemStack(Material.LEATHER_HELMET);
			helm.addEnchantment(Enchantment.DURABILITY, 3);
			((Monster) e).getEquipment().setHelmet(helm);
			
		}else if(e instanceof Animals) {
			
			Random rand = new Random();
			int c = rand.nextInt(3);
			
			if(c != 0) {
				
				e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
				((Animals) e).setHealth(0);
				
			}
			
		}
	}
	
}

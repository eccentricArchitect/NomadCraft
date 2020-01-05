package craft.nomad;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;

public class CombustListener implements Listener {
	
	@EventHandler
	public void onCombust(EntityCombustEvent event) {
		
		Entity e = event.getEntity();
		
		if(e instanceof Monster) {
			if(((Monster) e).getEquipment().getHelmet().getType() == Material.AIR) {
		
				ItemStack helm = new ItemStack(Material.LEATHER_HELMET);
				helm.addEnchantment(Enchantment.DURABILITY, 3);
				((Monster) e).getEquipment().setHelmet(helm);
				
				event.setCancelled(true);
				
			}
			
		}
	}
	
}

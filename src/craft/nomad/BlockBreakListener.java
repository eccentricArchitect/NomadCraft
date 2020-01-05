package craft.nomad;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;

public class BlockBreakListener implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		
		Block b = event.getBlock();
		int bX = b.getX();
		int bY = b.getY();
		int bZ = b.getZ();
		
		//Bukkit.broadcastMessage("Type is: " + b.getType());
		
		switch(b.getType()) {
		case CROPS:
		case CARROT:
		case POTATO:
			
			Location l = new Location(b.getWorld(), bX, bY - 1, bZ);
			l.getBlock().setType(Material.SAND);
			
			break;
		case MELON:
		case PUMPKIN:
			for(int i = 0; i < 3; ++i) {
				for (int j = 0; j < 3; ++j) {
					
					l = new Location(b.getWorld(), bX + i, bY, bZ + j);
					
					if(l.getBlock().getType() == Material.MELON_STEM
						|| l.getBlock().getType() == Material.PUMPKIN_STEM){
						
						l = new Location(b.getWorld(), bX + i, bY - 1, bZ + j);
						l.getBlock().setType(Material.SAND);
						
						}
				}
			}
			
			
		}
		
		
	}

}

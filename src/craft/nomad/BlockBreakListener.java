package craft.nomad;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;

public class BlockBreakListener implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		
		Block b = event.getBlock();
		int bX = b.getX();
		int bY = b.getY();
		int bZ = b.getZ();
		
		Bukkit.broadcastMessage("Type is: " + b.getType());
		
		switch(b.getType()) {
		case CROPS:
		case CARROT:
		case POTATO:
			
			Location l = new Location(b.getWorld(), bX, bY - 1, bZ);
			l.getBlock().setType(Material.SAND);
			
			break;
		case MELON_BLOCK:
		case PUMPKIN:
			
			int[][] cross = {{-1,0},{1,0},{0,1},{0,-1}};
			
			for(int i = 0; i < cross.length; ++i) {
				
				l = new Location(b.getWorld(), bX + cross[i][0], bY, bZ + cross[i][1]);
				
				//Bukkit.broadcastMessage("Block " + cross[i][0] + "," + cross[i][1] + " is " + l.getBlock().getType());
				
				if(l.getBlock().getType() == Material.MELON_STEM
						|| l.getBlock().getType() == Material.PUMPKIN_STEM){
					
					//Bukkit.broadcastMessage("STEM FOUND! Replacing...");
					
					l.getBlock().setType(Material.DEAD_BUSH);
						
					l = new Location(b.getWorld(), bX + cross[i][0], bY - 1, bZ + cross[i][1]);
					l.getBlock().setType(Material.SAND);
					
					break;
						
						}
				
			}
			
			break;
			
		case SUGAR_CANE_BLOCK:
			
			int d = 1;
			l = new Location(b.getWorld(), bX, bY, bZ);
			while(l.getBlock().getType() == Material.SUGAR_CANE_BLOCK) {
				
				Bukkit.broadcastMessage("TYPE: " + l.getBlock().getType());
				
				l.getBlock().breakNaturally();
				l = new Location(b.getWorld(), bX, bY - d, bZ);
				++d;
				
				Bukkit.broadcastMessage("Current Y: " + l.getBlockY());
				
			}
			
			--d;
			l.getBlock().setType(Material.SAND);
		
			int[][] cross2 = {{-1,0},{1,0},{0,1},{0,-1}};
			
			for(int i = 0; i < cross2.length; ++i) {
				
				l = new Location(b.getWorld(), bX + cross2[i][0], bY - d, bZ + cross2[i][1]);
				
				Bukkit.broadcastMessage("Block " + cross2[i][0] + "," + cross2[i][1] + " is " + l.getBlock().getType());
				
				if(l.getBlock().getType() == Material.WATER
					|| l.getBlock().getType() == Material.STATIONARY_WATER){
					
					Bukkit.broadcastMessage("WATER FOUND! Replacing...");
					
					l.getBlock().setType(Material.SAND);
					
					break;
						
						}
				
			}
		case LEAVES:
			
			event.getBlock().getDrops().clear();
			
			break;
		
			default:
				
				break;
			
			
		}
		
		
	}

}

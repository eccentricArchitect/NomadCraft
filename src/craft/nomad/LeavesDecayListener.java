package craft.nomad;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;

public class LeavesDecayListener implements Listener {
	
	@EventHandler
	public void onDecay(LeavesDecayEvent event) {
		
		Block leaves = event.getBlock();
		
		event.setCancelled(true);
		
		Bukkit.broadcastMessage("cancelled.");
		
		leaves.getRelative(BlockFace.UP).setType(Material.FIRE);
		
		
	}

}

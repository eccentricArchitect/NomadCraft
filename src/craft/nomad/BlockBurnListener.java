package craft.nomad;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.util.Vector;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.LargeFireball;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;


public class BlockBurnListener implements Listener {
	
	@EventHandler
	public void onBurn(BlockBurnEvent event) {
		
		if(event.getBlock().getType() == Material.LOG) {
			
			Vector v1 = new Vector(1,0,0).normalize();
			Vector v2 = new Vector(-1,0,0).normalize();
			Vector v3 = new Vector(0,0,1).normalize();
			Vector v4 = new Vector(0,0,-1).normalize();
			
			Vector v5 = new Vector(0,1,0).normalize();
			Vector v6 = new Vector(0,-1,0).normalize();
			
			
			Block b = event.getBlock();
			
			Location l1 = new Location(b.getWorld(), b.getX() + 1, b.getY(), b.getZ());
			Location l2 = new Location(b.getWorld(), b.getX() - 1, b.getY(), b.getZ());
			Location l3 = new Location(b.getWorld(), b.getX(), b.getY(), b.getZ() + 1);
			Location l4 = new Location(b.getWorld(), b.getX(), b.getY(), b.getZ() - 1);
			
			Location l5 = new Location(b.getWorld(), b.getX(), b.getY() + 1, b.getZ());
			Location l6 = new Location(b.getWorld(), b.getX(), b.getY() - 1, b.getZ());
			
			
			Fireball f1 = b.getWorld().spawn(l1, Fireball.class);
			f1.setDirection(v1);
			
			Fireball f2 = b.getWorld().spawn(l2, Fireball.class);
			f2.setDirection(v2);

			Fireball f3 = b.getWorld().spawn(l3, Fireball.class);
			f3.setDirection(v3);

			Fireball f4 = b.getWorld().spawn(l4, Fireball.class);
			f4.setDirection(v4);
			
			Fireball f5 = b.getWorld().spawn(l5, Fireball.class);
			f5.setDirection(v5);
			
			Fireball f6 = b.getWorld().spawn(l6, Fireball.class);
			f6.setDirection(v6);
			
			
		}
		
	}

}

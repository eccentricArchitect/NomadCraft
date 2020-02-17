package craft.nomad;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new CombustListener(), this);
		getServer().getPluginManager().registerEvents(new SpawnListener(), this);
		getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
		getServer().getPluginManager().registerEvents(new LeavesDecayListener(), this);
		getServer().getPluginManager().registerEvents(new EntityDeathListener(), this);
		getServer().getPluginManager().registerEvents(new BlockBurnListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerInteractEntityListener(), this);
		
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
}

package craft.nomad;
import org.bukkit.plugin.java.JavaPlugin;

public class ClassTemplate extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new CombustListener(), this);
		getServer().getPluginManager().registerEvents(new SpawnListener(), this);
		getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
		
		
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
}

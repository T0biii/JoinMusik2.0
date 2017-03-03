package de.itztobi.musik;

public class ConfigManager {
	
	 private Main plugin;
	  public ConfigManager(Main plugin)
	  {
		  this.plugin = plugin; 
	  }	

	public void loadConfig() {
	
		
		 this.plugin.getConfig().options().header("Plugin by itzTobi_!\nChange at your own risk");
	   	 this.plugin.getConfig().addDefault("musik", "Song.nbs");
	     this.plugin.getConfig().addDefault("options.update-check", true); 	
	     this.plugin.getConfig().addDefault("options.updateinfo", true);
	     this.plugin.getConfig().addDefault("options.limit.on", false);
	     this.plugin.getConfig().addDefault("options.limit.time", 30);
	     this.plugin.getConfig().addDefault("messages.reload", "Reload Erfolgreich!");
	     this.plugin.getConfig().addDefault("messages.no-permission", "You don't have enough permissions"); 

	    
	   	 
	   	 
	   	 this.plugin.getConfig().options().copyDefaults(true);
		
	}

}

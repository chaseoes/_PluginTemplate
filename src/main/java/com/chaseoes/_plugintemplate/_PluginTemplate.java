package com.chaseoes._plugintemplate;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class _PluginTemplate extends JavaPlugin {
    
    private static _PluginTemplate instance;
    
    public static _PluginTemplate getInstance() {
        return instance;
    }
	
	public void onEnable() {
	    instance = this;
	}
	
	public void onDisable() {
		instance = null;
	}
	
	public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
		return true;
	}

}

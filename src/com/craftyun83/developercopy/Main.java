package com.craftyun83.developercopy;

import org.bukkit.plugin.java.JavaPlugin;

import com.craftyun83.developercopy.commands.DeveloperCopyCommands;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		new DeveloperCopyCommands(this);
		
	}

}

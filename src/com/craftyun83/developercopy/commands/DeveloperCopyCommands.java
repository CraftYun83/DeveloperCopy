package com.craftyun83.developercopy.commands;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.apache.commons.io.FileUtils;

import com.craftyun83.developercopy.Main;

public class DeveloperCopyCommands implements CommandExecutor {
	
	private Main plugin;
	
	public DeveloperCopyCommands(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("developercopy").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {

		try {
			
			FileUtils.copyURLToFile(new URL(args[0]), new File(plugin.getServer().getWorldContainer().getAbsolutePath()+File.separator+"plugins"));
			
		} catch (ArrayIndexOutOfBoundsException | IOException exc) {
			
			sender.sendMessage(ChatColor.RED+"This command requires at least 1 subcommand!");
			
		}
		
		return false;
	}

}

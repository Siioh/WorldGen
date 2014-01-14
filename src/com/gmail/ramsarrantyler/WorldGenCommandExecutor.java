package com.gmail.ramsarrantyler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

public class WorldGenCommandExecutor implements CommandExecutor {
	public WorldGen plugin;
	 
	public WorldGenCommandExecutor(WorldGen plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("blockbreak")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				PermissionAttachment attachment = player.addAttachment(plugin);
				if(sender.hasPermission("WorldGen.blockbreak")) {
					attachment.setPermission("WorldGen.blockbreak", false);
					player.sendMessage("Ability to break un-breakable blocks is now disabled.");
					return true;
				} else {
				if(!(sender.hasPermission("WorldGen.blockbreak"))) {
					attachment.setPermission("WorldGen.blockbreak", true);
					player.sendMessage("Ability to break un-breakable blocks is now enabled.");
					return true;
				}
				}
			}
		} return false;
	}
}
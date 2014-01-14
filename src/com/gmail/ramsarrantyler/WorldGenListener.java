package com.gmail.ramsarrantyler;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class WorldGenListener implements Listener {
	public WorldGen plugin;
	
	public WorldGenListener(WorldGen plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent evt) {
		Player player = evt.getPlayer();
		Material block = evt.getBlock().getType();
		if(block == Material.REDSTONE_BLOCK || block == Material.WOOL || block == Material.LAPIS_BLOCK || block == Material.GLASS) {
			if(!(player.hasPermission("WorldGen.blockbreak"))) {
				evt.setCancelled(true);
				player.sendMessage("A magical force prevents you from breaking that block.");
			}
		}
	}
	
	@EventHandler
	public void onPlace(BlockPlaceEvent evt) {
		Player player = evt.getPlayer();
		Material block = evt.getBlock().getType();
		if(block == Material.REDSTONE_BLOCK || block == Material.WOOL || block == Material.LAPIS_BLOCK || block == Material.GLASS) {
			if(!(player.hasPermission("WorldGen.blockbreak"))) {
				evt.setCancelled(true);
				player.sendMessage("A magical force prevents you from placing that block.");
			}
		}
	}
}
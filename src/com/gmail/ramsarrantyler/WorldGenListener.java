package com.gmail.ramsarrantyler;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class WorldGenListener implements Listener {
	public WorldGen plugin;
	
	public WorldGenListener(WorldGen plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent evt) {
		Player player = evt.getPlayer();
		Material block = evt.getBlock().getType();
		if(block == Material.REDSTONE_BLOCK || block == Material.WOOL || block == Material.LAPIS_BLOCK || block == Material.GLASS || block == Material.STONE_PLATE) {
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
		if(block == Material.REDSTONE_BLOCK || block == Material.WOOL || block == Material.LAPIS_BLOCK || block == Material.GLASS || block == Material.STONE_PLATE) {
			if(!(player.hasPermission("WorldGen.blockbreak"))) {
				evt.setCancelled(true);
				player.sendMessage("A magical force prevents you from placing that block.");
			}
		}
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent evt) {
		Player player = evt.getPlayer();
		Location player_loc = player.getLocation();
		Location block = player_loc;
		int x = (int) block.getX();
		double y = block.getY();
		int z = (int) block.getZ();
		//Location tp = player_loc;
		World world = player.getWorld();
		Vector velocity = player.getLocation().getDirection().multiply(3).setY(1.5);
		PermissionManager pex = PermissionsEx.getPermissionManager();
		PermissionUser user = pex.getUser(player.getName());
		if (x == 2 && y <= 151.1 && y >= 151 && z == 102){ //Blue
			if (Cooldowns.tryCooldown(player, "Teleport", 750)) {
				//Block high_block = Bukkit.getServer().getWorld("world").getHighestBlockAt(2, 100);
				//tp.setX(2.5);
				//tp.setY(high_block.getY()+0.5);
				//tp.setZ(100.5);
				//player.teleport(tp);
				user.addTimedPermission("PVP.nofall", "world", 10);
				world.playSound(player_loc, Sound.ENDERMAN_TELEPORT, 10, 0);
				player.setVelocity(player.getVelocity().add(velocity));
			}
		}
		if (x == 2 && y <= 151.1 && y >= 151 && z == -100){ //Red
			if (Cooldowns.tryCooldown(player, "Teleport", 750)) {
				//Block high_block = Bukkit.getServer().getWorld("world").getHighestBlockAt(2, -98);
				//tp.setX(2.5);
				//tp.setY(high_block.getY()+0.5);
				//tp.setZ(-98.5);
				//player.teleport(tp);
				user.addTimedPermission("PVP.nofall", "world", 10);
				world.playSound(player_loc, Sound.ENDERMAN_TELEPORT, 10, 0);
				player.setVelocity(player.getVelocity().add(velocity));
			}
		}
	}
}
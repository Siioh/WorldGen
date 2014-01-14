package com.gmail.ramsarrantyler;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldGen extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getLogger().info("WorldGen has successfully started up!");
		new WorldGenListener(this);
	    this.getServer().getPluginManager().registerEvents(new WorldGenListener(this), this);
	    getCommand("blockbreak").setExecutor(new WorldGenCommandExecutor(this));
		
		int gen = 100; //Distance to generate, multiply by 2 to get total distance.
		int renew = gen; //Renews or restarts the gen value.
		
		int startx1 = 1; //X-value to start
		int startx2 = 2;
		int startx3 = 3;
		//Separates by directions
		int startx4 = 1;
		int startx5 = 2;
		int startx6 = 3;
		
		int startz1 = 1; //Z-Value to start
		int startz2 = 1;
		int startz3 = 1;
		//Separates by directions
		int startz4 = 0;
		int startz5 = 0;
		int startz6 = 0;
		
		//Renewal values
		int x1 = startx1;
		int x2 = startx2;
		int x3 = startx3;
		int x4 = startx4;
		int x5 = startx5;
		int x6 = startx6;
		
		int z1 = startz1;
		int z2 = startz2;
		int z3 = startz3;
		int z4 = startz4;
		int z5 = startz5;
		int z6 = startz6;
		
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx1,startz1);
			int x = block.getX();
			int y = block.getY()-2;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.OBSIDIAN);
			gen=gen-1;
			startz1=startz1+1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx2,startz2);
			int x = block.getX();
			int y = block.getY()-2;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.OBSIDIAN);
			gen=gen-1;
			startz2=startz2+1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx3,startz3);
			int x = block.getX();
			int y = block.getY()-2;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.OBSIDIAN);
			gen=gen-1;
			startz3=startz3+1;
			}
		}
		//Negative values
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx4,startz4);
			int x = block.getX();
			int y = block.getY()-2;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.OBSIDIAN);
			gen=gen-1;
			startz4=startz4-1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx5,startz5);
			int x = block.getX();
			int y = block.getY()-2;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.OBSIDIAN);
			gen=gen-1;
			startz5=startz5-1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx6,startz6);
			int x = block.getX();
			int y = block.getY()-2;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.OBSIDIAN);
			gen=gen-1;
			startz6=startz6-1;
			}
		}
		
		startx1 = x1; //X-value to start
		startx2 = x2;
		startx3 = x3;
		//Separates by directions
		startx4 = x4;
		startx5 = x5;
		startx6 = x6;
		
		startz1 = z1; //Z-Value to start
		startz2 = z2;
		startz3 = z3;
		//Separates by directions
		startz4 = z4;
		startz5 = z5;
		startz6 = z6;
		
		//Start upper layer
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx1,startz1);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.HARD_CLAY);
			gen=gen-1;
			startz1=startz1+1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx2,startz2);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.HARD_CLAY);
			gen=gen-1;
			startz2=startz2+1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx3,startz3);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.HARD_CLAY);
			gen=gen-1;
			startz3=startz3+1;
			}
		}
		//Negative values
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx4,startz4);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.HARD_CLAY);
			gen=gen-1;
			startz4=startz4-1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx5,startz5);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.HARD_CLAY);
			gen=gen-1;
			startz5=startz5-1;
			}
		}
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx6,startz6);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			if(Bukkit.getWorld("world").getBlockAt(x, y, z).getType() == Material.LEAVES) {
				Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.AIR);
			} else {
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.HARD_CLAY);
			gen=gen-1;
			startz6=startz6-1;
			}
		}
		
		startx2 = x2;
		startz2 = z2;
		//Add lighting
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx2,startz2);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.GLOWSTONE);
			gen=gen-5;
			startz2=startz2-5;
			
		}
		startx2 = x2;
		startz2 = z2;
		gen = renew;
		while(gen>0) {
			Block block = Bukkit.getServer().getWorld("world").getHighestBlockAt(startx2,startz2);
			int x = block.getX();
			int y = block.getY()-1;
			int z = block.getZ();
			Bukkit.getWorld("world").getBlockAt(x, y, z).setType(Material.GLOWSTONE);
			gen=gen-5;
			startz2=startz2+5;
		}
		//Add spawn area in sky
		int x = 9; //Set number of times to repeat on this x value
		int newx = x;
		while(x>0) {
			Bukkit.getServer().getWorld("world").getBlockAt(x, 100, 0).setType(Material.GLASS);
			x=x-1;
		}
		x = newx;
		while(x>0) {
			Bukkit.getServer().getWorld("world").getBlockAt(x, 100, 1).setType(Material.GLASS);
			x=x-1;
		}
		x = newx;
		while(x>0) {
			Bukkit.getServer().getWorld("world").getBlockAt(x, 100, 2).setType(Material.GLASS);
			x=x-1;
		}
	}
	
	@Override
	public void onDisable(){
		getLogger().info("WorldGen has successfully shut down.");
	}
}

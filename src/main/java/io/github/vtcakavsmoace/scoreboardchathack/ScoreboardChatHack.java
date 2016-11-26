package io.github.vtcakavsmoace.scoreboardchathack;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Team;
import org.bukkit.event.player.PlayerJoinEvent;

/* This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://www.wtfpl.net/ for more details. */
/**
 * 
 * ScoreboardChatHack main class and Chat Listener.
 * 
 * @author vtcakavsmoace
 *
 */
public final class ScoreboardChatHack extends JavaPlugin implements Listener {

	/**
	 * Called when enabled. If this fails, you really need to check your spigot
	 * configuration.
	 */
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("ScoreboardChatHack started.");
	}

	/**
	 * Called when disabled. If this fails, you really need to check your spigot
	 * configuration.
	 */
	@Override
	public void onDisable() {
		HandlerList.unregisterAll((Listener) this);
		getLogger().info("ScoreboardChatHack killed.");
	}
	
	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerJoin(PlayerJoinEvent event) {
		String playerName = event.getPlayer().getName();
		Team playerTeam = Bukkit.getScoreboardManager().getMainScoreboard().getEntryTeam(playerName);
		event.getPlayer().setDisplayName(playerTeam.getPrefix() + playerName + playerTeam.getSuffix());
	}

}

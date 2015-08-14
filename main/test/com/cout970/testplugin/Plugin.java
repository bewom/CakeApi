package com.cout970.testplugin;

import org.cakepowered.api.base.CakePlugin;
import org.cakepowered.api.base.Game;
import org.cakepowered.api.base.Log;
import org.cakepowered.api.base.Player;
import org.cakepowered.api.event.EventSuscribe;
import org.cakepowered.api.event.InitializationEvent;
import org.cakepowered.api.event.PlayerChatEvent;
import org.cakepowered.api.event.PlayerJoinEvent;
import org.cakepowered.api.event.ServerStatingEvent;
import org.cakepowered.api.scoreboard.Team;
import org.cakepowered.api.util.text.TextFormating;

@CakePlugin(id = "plugin_id", name = "plugin_nombre", version = "plugin_0.0.0")
public class Plugin {

	public Log logger;
	public Game game;
	public static Plugin INSTANCE;
	
	@EventSuscribe
	public void onInit(InitializationEvent event){
		logger = event.getLogger("plugin_id");
		game = event.getGame();
		logger.info("debug plugin loaded Successful");
		INSTANCE = this;
	}
	
	@EventSuscribe
	public void onStart(ServerStatingEvent event){
		game.getWorldManager().createWorld(2);
		game.getWorldManager().createWorld(3);
	}
	
	
	@EventSuscribe
	public void onPlayerChat(PlayerChatEvent event){
		event.getPlayer().sendMessage("http://www.google.com");
	}

	@EventSuscribe
	public void on(PlayerJoinEvent e){
		Team t = getTeam(e.getPlayer());
		t.addPlayer(e.getPlayer());
	}
	
	public Team getTeam(Player p){
		Team t = p.getWorld().getScoreboard().getTeam("admin");
		if(t == null){
			t = p.getWorld().getScoreboard().addTeam("admin");
			t.setColor(TextFormating.DARK_AQUA);
		}
		return t;
	}
}

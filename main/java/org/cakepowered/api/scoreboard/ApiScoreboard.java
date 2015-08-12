package org.cakepowered.api.scoreboard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.cakepowered.api.base.Player;

import net.minecraft.scoreboard.ScorePlayerTeam;

public class ApiScoreboard implements Scoreboard {
	
	public net.minecraft.scoreboard.Scoreboard scoreboard;
	
	public ApiScoreboard(net.minecraft.scoreboard.Scoreboard scoreboard) {
		this.scoreboard = scoreboard;
	}
	
	@Override
	public Team getPlayerTeam(Player player) {
		return new ApiTeam(this.scoreboard.getPlayersTeam(player.getUserName()));
	}

	@Override
	public Team getTeam(String teamName) {
		return new ApiTeam(this.scoreboard.getPlayersTeam(teamName));
	}

	@Override
	public void removeTeam(Team team) {
		this.scoreboard.removeTeam(this.scoreboard.getPlayersTeam(team.getName()));
		
	}

	@Override
	public Team addTeam(String team) throws IllegalArgumentException {
		
		ScorePlayerTeam s = this.scoreboard.createTeam(team);
		return new ApiTeam(s);
		
	}

	@Override
	public List<Team> getTeams() {
		List<Team> t = new ArrayList<Team>();
		for(Object s : this.scoreboard.getTeamNames()){
			
			t.add(new ApiTeam(this.scoreboard.getPlayersTeam(s.toString())));
			
		}
		
		return t;
	}

}
package com.mmcoe.ipl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPL {
    private static final int MAX_TEAMS = 5;
    private static final int MAX_PLAYERS = 5;
    private Map<Team, List<Player>> teams = new HashMap<>();

    
    public void addTeam(Team team) throws IplException {
        if(teams.size() == MAX_TEAMS)
            throw new IplException("Maximum Teams Reached");
        teams.put(team, new ArrayList<Player>());
    }

    
    public void addPlayer(String teamName, Player player) throws IplException {
        Team team = findTeam(teamName);
        if(team == null) {
            throw new IplException("Team Not Found");
        }

        List<Player> players = teams.get(team);
        if(players.size() == MAX_PLAYERS)
            throw new IplException("Team is Full");
        players.add(player);
    }

    
    public void displayPlayers(String teamName) throws IplException {
        Team team = findTeam(teamName);
        if(team == null) {
            throw new IplException("Team Not Found");
        }
        System.out.println("\nPlayers of " + team.getTeamName());
        for(Player player : teams.get(team)) {
            System.out.println(player);
        }
    }

    
    private Team findTeam(String teamName) {
    	for(Team team : teams.keySet()) {
    		if(team.getTeamName().equals(teamName))
    			return team;
    	}
    	return null;
    }
    
    
    public void displayAllTeams() {
        for(Team team : teams.keySet()) {
            System.out.println("\nTeam : " + team.getTeamName());
            for(Player player : teams.get(team)) {
                System.out.println(player);
            }
        }
    }
}
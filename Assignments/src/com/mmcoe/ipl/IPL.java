package com.mmcoe.ipl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPL {
    private static final int MAX_TEAMS = 5;
    private static final int MAX_PLAYERS = 5;
    private Map<Team, List<Player>> teams;

    public IPL() {
        teams = new HashMap<>();
    }

    public void addTeam(Team team) throws IplException {
        if (teams.size() == MAX_TEAMS) {
            throw new IplException("Maximum Team Limit Reached");
        }
        teams.put(team, new ArrayList<>());
    }

    
    public void addPlayer(String teamName, Player player) throws IplException {
        Team team = findTeam(teamName);
        if (team == null) {
            System.out.println("Team Not Found");
            return;
        }
        List<Player> players = teams.get(team);
        if (players.size() == MAX_PLAYERS) {
            throw new IplException(teamName + " Team is Full");
        }
        players.add(player);
    }
    

    private Team findTeam(String teamName) {
        for (Team team : teams.keySet()) {
            if (team.getTeamName().equalsIgnoreCase(teamName)) {
                return team;
            }
        }
        return null;
    }

    
    public void displayTeamPlayers(String teamName) {
        Team team = findTeam(teamName);
        if (team == null) {
            System.out.println("Team Not Found");
            return;
        }
        System.out.println("\nPlayers of " + team.getTeamName());
        System.out.println("----------------------------------------------");
        teams.get(team).forEach(System.out::println);
    }

    
    public void displayAllTeams() {
        teams.forEach((team, players) -> {
            System.out.println("\n================================");
            System.out.println(team.getTeamName());
            System.out.println("================================");
            players.forEach(System.out::println);
        });
    }

    
    public void searchPlayer(String playerName) {
        Player player = teams.values().stream().flatMap(List::stream).filter(p -> p.getPlayerName().equals(playerName))
                .findFirst().orElse(null);

        if (player != null) {
            System.out.println(player);
        } else {
            System.out.println("Player Not Found");
        }
    }
    

    public void deletePlayer(String playerName) {
        Player player = teams.values().stream().flatMap(List::stream).filter(p -> p.getPlayerName().equals(playerName))
                .findFirst().orElse(null);

        if(player == null) {
            System.out.println("Player Not Found");
            return;
        }
        teams.values().forEach(list -> list.remove(player));
        System.out.println("Player Deleted Successfully");
    }

    
    public void filterByRole(String role) {
        teams.values().stream().flatMap(List::stream).filter(p -> p.getRole().equals(role))
                .forEach(System.out::println);
    }
    

    public void filterByPriceGreaterThan(double amount) {
        teams.values().stream().flatMap(List::stream).filter(p -> p.getBidAmount() > amount)
                .forEach(System.out::println);
    }
    

    public void filterByPriceLessThan(double amount) {
        teams.values().stream().flatMap(List::stream).filter(p -> p.getBidAmount() < amount)
                .forEach(System.out::println);
    }
}
package com.mmcoe.ipl;

public class Team {
	private String teamName;
	private Player[] players;
	private int count;
	
	public Team(String teamName) {
        this.teamName = teamName;
        players = new Player[16];
    }
	
	
	public String getTeamName() {
		return teamName;
	}


	public void addPlayers(Player p) {
		if(count == players.length) {
            System.out.println("Team is Full");
            return;
        }
        players[count++] = p;
	}
	
	
	public void printPlayers() {
		System.out.println("\nPlayers of " + teamName);

        for(int i=0;i<count;i++) {
            System.out.println(players[i]);
        }
	}
	
}

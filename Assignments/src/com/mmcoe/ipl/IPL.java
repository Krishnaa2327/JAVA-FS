package com.mmcoe.ipl;

public class IPL {
    private Team[] teams;
    private int count;

    
    public IPL() {
        teams = new Team[10];
    }

    
    public void addTeam(Team t) {
        teams[count++] = t;
    }

    
    public Team searchTeam(String name) {
        for(int i=0;i<count;i++) {
            if(teams[i].getTeamName().equals(name)) {
                return teams[i];
            }
        }
        return null;
    }
    
}
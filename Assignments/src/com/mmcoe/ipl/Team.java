package com.mmcoe.ipl;

public class Team {
    private int teamId;
    private String teamName;

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return teamId + " - " + teamName;
    }
}
package com.mmcoe.ipl;

public class Player {
	private String playerName;
	private int jerseyNumber;
	private double bidAmount;
		
	public Player(int jerseyNumber, String playerName, double bidAmount) {
        this.jerseyNumber = jerseyNumber;
        this.playerName = playerName;
        this.bidAmount = bidAmount;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    @Override
    public String toString() {
        return jerseyNumber + "\t" + playerName + "\t₹" + bidAmount + " Cr";
    }
	
	
}

package com.mmcoe.ipl;

public class Player {
	private String Name;
	private Double BidAmount;
		
	public Player(String name, Double bidAmount) {
		super();
		Name = name;
		BidAmount = bidAmount;
	}

	public String getName() {
		return Name;
	}

	public Double getBidAmount() {
		return BidAmount;
	}

	@Override
	public String toString() {
		return "Player [Name= " + Name + ", Bid Amount= " + BidAmount + " Cr ]";
	}
	
	
}

package com.mmcoe.ipl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    private static final String FILE_PATH = "src\\com\\mmcoe\\ipl\\players.csv";
    public static void loadPlayers(IPL service) {

    	try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
    	    String line;
    	    br.readLine();
    	    
    	    while((line = br.readLine()) != null) {
    	        String[] data = line.split(",");
    	        String teamName = data[0];
    	        int jersey = Integer.parseInt(data[1]);
    	        String playerName = data[2];
    	        double bid = Double.parseDouble(data[3]);
    	        String role = data[4];
    	        Player player = new Player(jersey, playerName, bid, role);

    	        try {
    	            service.addPlayer(teamName, player);
    	        } catch(IplException e) {
    	            System.out.println(playerName + " : " + e.getMessage());
    	        }
    	    }
    	} catch(IOException e) {
    	    System.out.println(e.getMessage());
    	}
    }
}
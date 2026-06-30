package com.mmcoe.ipl;
import java.util.Scanner;

public class TestIPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPL service = new IPL();
        try {
            service.addTeam(new Team(1, "MI"));
            service.addTeam(new Team(2, "RCB"));
            service.addTeam(new Team(3, "GT"));
            service.addTeam(new Team(4, "CSK"));
            service.addTeam(new Team(5, "KKR"));
        } catch (IplException e) {
            System.out.println(e.getMessage());
        }

        
        int choice;
        do {
            System.out.println("\n========== IPL MANAGEMENT ==========");
            System.out.println("1. Import Players From CSV");
            System.out.println("2. Search Player");
            System.out.println("3. Delete Player");
            System.out.println("4. Filter By Role");
            System.out.println("5. Filter Price Greater Than");
            System.out.println("6. Filter Price Less Than");
            System.out.println("7. Display Team Players");
            System.out.println("8. Display All Teams");
            System.out.println("9. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            switch (choice) {
            case 1:
                CsvReader.loadPlayers(service);
                System.out.println("Players loaded successfully !!");
                break;

            case 2:
                sc.nextLine();
                System.out.print("Enter Player Name : ");
                String playerName = sc.nextLine();
                service.searchPlayer(playerName);
                break;

                
            case 3:
            	sc.nextLine();
            	System.out.print("Enter Player Name : ");
            	String playerName1 = sc.nextLine();
            	service.deletePlayer(playerName1);
                break;

                
            case 4:
                sc.nextLine();
                System.out.print("Enter Role (BATTER/BOWLER) : ");
                String role = sc.nextLine();
                service.filterByRole(role);
                break;

                
            case 5:
                System.out.print("Enter Amount : ");
                double greater = sc.nextDouble();
                service.filterByPriceGreaterThan(greater);
                break;

                
            case 6:
                System.out.print("Enter Amount : ");
                double less = sc.nextDouble();
                service.filterByPriceLessThan(less);
                break;

                
            case 7:
                sc.nextLine();
                System.out.print("Enter Team Name : ");
                String teamName = sc.nextLine();
                service.displayTeamPlayers(teamName);
                break;

                
            case 8:
                service.displayAllTeams();
                break;

                
            case 9:
                System.out.println("Thank You");
                break;

                
            default:
                System.out.println("Invalid Choice");
            }
        } while (choice != 9);
        sc.close();
    }
}
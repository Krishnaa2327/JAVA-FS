package com.mmcoe.ipl;

import java.util.Scanner;

public class TestIPL {
    public static void main(String[] args) throws IplException {

        Scanner sc = new Scanner(System.in);
        IPL ipl = new IPL();
        int choice;
        do {
            System.out.println("\n===== IPL MANAGEMENT =====");
            System.out.println("1. Add Team");
            System.out.println("2. Add Player");
            System.out.println("3. Display Team Players");
            System.out.println("4. Display All Teams");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            switch(choice) {
            case 1:
                    System.out.print("Enter Team ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Team Name : ");
                    String teamName = sc.nextLine();
                    ipl.addTeam(new Team(id, teamName));
                    System.out.println("Team Added Successfully");
                    break;

            case 2:
                    sc.nextLine();
                    System.out.print("Enter Team Name : ");
                    String teamName1 = sc.nextLine();

                    System.out.print("Enter Jersey Number : ");
                    int jersey = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Player Name : ");
                    String playerName = sc.nextLine();

                    System.out.print("Enter Bid Amount : ");
                    double bid = sc.nextDouble();

                    ipl.addPlayer(teamName1, new Player(jersey, playerName, bid));
                    System.out.println("Player Added Successfully");
                    break;

            case 3:
                sc.nextLine();
                System.out.print("Enter Team Name : ");
                String teamName11 = sc.nextLine();
                ipl.displayPlayers(teamName11);
                break;

            case 4:
                ipl.displayAllTeams();
                break;

            case 5:
                System.out.println("Thank You");
                break;

            default:
                System.out.println("Invalid Choice");
            }

        } while(choice != 5);
        
        sc.close();
    }
}
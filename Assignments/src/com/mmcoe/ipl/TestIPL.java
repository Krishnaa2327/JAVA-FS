// Day-4 Assignment

package com.mmcoe.ipl;
import java.util.Scanner;

public class TestIPL {

    public static void main(String[] args) {
        IPL ipl = new IPL();

        Team rcb = new Team("RCB");
        rcb.addPlayers(new Player("Virat Kohli",21.0));
        rcb.addPlayers(new Player("Rajat Patidar",11.0));
        rcb.addPlayers(new Player("Josh Hazlewood",12.5));

        Team mi = new Team("MI");
        mi.addPlayers(new Player("Jasprit Bumrah",18.0));
        mi.addPlayers(new Player("Hardik Pandya",16.0));
        mi.addPlayers(new Player("Rohit Sharma",16.3));

        Team csk = new Team("CSK");
        csk.addPlayers(new Player("MS Dhoni",14.0));
        csk.addPlayers(new Player("Ravindra Jadeja",18.0));
        csk.addPlayers(new Player("R Ashwin",9.75));

        ipl.addTeam(rcb);
        ipl.addTeam(mi);
        ipl.addTeam(csk);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Team Name : ");
        String teamName = sc.nextLine();
        Team team = ipl.searchTeam(teamName);

        if(team != null) {
            team.printPlayers();
        }
        else {
            System.out.println("Team Not Found");
        }
        sc.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClasses;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class RegistrationManager {

    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<String> teamName = new ArrayList<>();

    public RegistrationManager() {

    }

    public void createAndAddTeam(String tname) {
        if (tname.equals("")) {
            System.out.println("Team name can't be emtpy");
        } else {
            teamName.add(tname);
            Team t = new Team(tname);
            teams.add(t);
            System.out.println("Team " + tname + " created");
            
        }
    }

    public void createAndAttachPlayer(String tname, String pname) {
        Player p = new Player(pname, tname);
        for (Team t : teams) {
            if (t.getTeamName().equals(tname)) {
                t.addTeamMember(p);
                System.out.println("Player " + pname + " added to " + tname);
                break;
            }
        }
        players.add(p);

    }

    /**
     * getter and Setters *
     */
    public ArrayList<String> returnMembers(String tname) {
        Team t = new Team(tname);
        return t.listMembers();
    }

    public Team getTeam(String tname) {
        for (Team t : teams) {
            if (t.getTeamName().equals(tname)) {
                return t;
            }
        }
        return null;
    }

    public ArrayList<Team> getAllTeams() {
        System.out.println("do");
        return teams;
    }
    
    public ArrayList<String> getAllTeamNames(){
        return teamName;
    }
    
    public void getTeamNames(ArrayList<String> tname){
        this.teamName = tname;
    } 
    

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Player> getAllPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

}

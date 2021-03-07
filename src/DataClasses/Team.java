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

public class Team {

    private String teamName;
    private ArrayList<Player> players = new ArrayList<>();
   
    
    
    
    private int matchesPlayed;
    private int matchesWon;
    private int setsWon;

    public Team() {}

    public Team(String teamName) {

        this.teamName = teamName;
        
    }
    
     public void addTeamMember(Player p){
        players.add(p);
        System.out.println("Size is now: " + players.size());
        System.out.println("added" + p.toString() + " to team " + teamName);
    }
     
     public ArrayList<String> listMembers(){
        ArrayList<String> p = new ArrayList<>();
        int i = 0;
        while(i < players.size()){
            System.out.println(players.get(i).getName());
            p.add(players.get(i).getName());
            i++;
        }
        return p;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    @Override
    public String toString() {
        return "Team{" + "players=" + players + '}';
    }
     
   

    
    public void setTeamName(String teamname) {

        this.teamName = teamname;
    }

    public String getTeamName() {

        return teamName;
    }

    public int getSetsWon() {

        return setsWon;
    }

    

    

    

   
}

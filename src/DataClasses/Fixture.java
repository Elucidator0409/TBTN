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
import java.util.*;


public class Fixture {

    public ArrayList<Match> matches = new ArrayList<>();
    private ArrayList<Team> temp = new ArrayList<>();

    public Fixture() {

    }


    public void generateFixtures(ArrayList<Team> t) {
        temp = t;
        System.out.println("Do");
        matches.clear();
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                Match match = new Match(temp.get(i).getTeamName(),temp.get(j).getTeamName());
                matches.add(match);
            }
            
        }
        System.out.println("DO3");
        for (Match m : matches) {
          System.out.println(m.getHTeam() + " v " + m.getATeam());
        }
}




    public Match getAMatch(String hteam, String ateam) {

        for (Match m : matches) {
            if (m.getHTeam().equals(hteam) && m.getATeam().equals(ateam)) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
    
    public ArrayList<Team> getTempTeam() {
        return temp;
    }

    public void setTempTeam(ArrayList<Team> tempteam) {
        this.temp = tempteam;
    }

}

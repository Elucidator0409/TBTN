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
public class Player {

    private String name;
    private String team;

    public Player() {}

    public Player(String name, String team) {

        this.name = name;
        this.team = team;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setTeam(String team) {

        this.team = team;
    }

    public String getName() {

        return name;
    }

    public String getTeam() {

        return team;
    }

    public String toString() {

        return "Player Name: " + getName() + ", Team: " + getTeam();
    }

}

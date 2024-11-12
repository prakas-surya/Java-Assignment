package assignment;

import java.util.List;
import java.util.ArrayList;

public class Team {
	
    private String name;
    private String city;
    private String division;
    private List<Player> playersList = new ArrayList<>();

    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    
    public List<Player> getPlayersList() { // returns players of the team
    	return playersList;
    }
    
    public void addPlayer(Player player) { // adds new player to the team
    	playersList.add(player);
    }

    public void playGame() {
        System.out.println(name + " from " + city + " is playing in the " + division + " division");
    }

    public void hireCoach(String coachName) {
        System.out.println(name + " has hired " + coachName + " as their new coach");
    }
    
    public void displayTeamDetails() {
    	System.out.println("Name : " + name);
    	System.out.println("City : " + city);
    	System.out.println("Division : " + division);
    }
}


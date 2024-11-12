package assignment;

public class Player {

    private String name;
    private String position;
    private int jerseyNumber;

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void playGame() {
        System.out.println(name + " is playing in position " + position + " with jersey number " + jerseyNumber);
    }

    public void train() {
        System.out.println(name + " is training in position " + position);
    }
    
    public void displayPlayerDetails() {
    	System.out.println("Name : " + name);
		System.out.println("Position : " + position);
		System.out.println("Jersey Number : " + jerseyNumber);
    }
    
    public String toString() {
    	return "Player{Name: " + name + ", Position: " + position + ", Jersey Number: " + jerseyNumber + "}";
    }
}


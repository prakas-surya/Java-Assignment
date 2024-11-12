package assignment;

public class TeamManagement {

	public static void main(String[] args) {
		
		Team team = new Team("Madurai Stars", "Madurai", "Division Three");
		
		// display team details
		System.out.println("Displaying team details : ");
		team.displayTeamDetails();
		
		// playGame method
		System.out.println();
		System.out.println("PlayGame method is invoked using team : ");
		team.playGame();
		
		//hireCoach method
		System.out.println();
		System.out.println("New Coach Assigned to the team : ");
		team.hireCoach("Mike");
		
		Player player1 = new Player("player1", "Striker", 1);
		Player player2 = new Player("player2", "Mid Fielder", 2);
		Player player3 = new Player("player10", "Defender", 10);
		
		// get player 3 using getters
		System.out.println();
		System.out.println("Fetching details of player3 using getters : ");
		System.out.println("Name : " + player3.getName());
		System.out.println("Position : " + player3.getPosition());
		System.out.println("Jersey Number : " + player3.getJerseyNumber());
		
		// modify player 3 details using setters
		player3.setName("player3");
		player3.setPosition("Goal Keeper");
		player3.setJerseyNumber(3);
		
		//get player 3 details using displayPlayerDetails method
		System.out.println();
		System.out.println("Player3 details fetched using displayPlayerDetails method after modification done using setters:");
		player3.displayPlayerDetails();
		
		// playGame method
		System.out.println();
		System.out.println("Calling playGame method using player1 :");
		player1.playGame();
		
		// train method
		System.out.println();
		System.out.println("Calling train method using player 1 :");
		player1.train();
		
		// assign players to the team
		team.addPlayer(player1);
		team.addPlayer(player2);
		team.addPlayer(player3);
		
		// list the players belongs to team
		System.out.println();
		System.out.println("Players List of the team : ");
		System.out.println(team.getPlayersList());
		
	}

}

package javatest;

import java.util.Scanner;

public class LiftSystem {
	
	static int[] floor = new int[5];
	static Scanner sc = new Scanner(System.in);
	
	static int currentFloor;
	static int destinationFloor;
	
	static int[] accessLevel = {5, 5, 10, 10, 0};
	
	// default capacity is 12;
	static int[] capacity = {12, 12, 12, 12, 12};

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("1. display lifts");
			System.out.println("2. assign lifts");
			System.out.println("3. display lifts to user");
			System.out.println("4. display nearest lift");
			System.out.println("5. display Nearest Accessible Lift");
			System.out.println("6. exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : displayLift(); break;
			case 2 : assignLift(); break;
			case 3 : assignLiftToUser(); break;
			case 4 : assignNearestLift(); break;
			case 5 : assignNearestAccessibleLift();
			case 6 : System.exit(0);
			default : System.exit(0);
			}
		}
	}
	
	public static void displayLift() {
		System.out.print("Lift  : ");
		for (int i=1; i<=floor.length; i++)
			System.out.print("L" + i + " ");
		
		System.out.println();
		System.out.print("Floor : ");
		for (int i=0; i<floor.length; i++) 
			System.out.print(floor[i] + "  ");
	}
	
	public static void assignLift() {
		System.out.println("Enter Lift position below : ");
		
		for (int i=1; i<=floor.length; i++) {
			System.out.print("L" + i + " : ");
			floor[i-1] = sc.nextInt();
		}
	}
	
	public static void assignLiftToUser() {
		getUserInput();
		
		int nearestFloor = 0;
		int differenceBetweenFloors = Math.abs(currentFloor - floor[0]);
		
		for (int i=1; i<floor.length; i++) {
			if (Math.abs(currentFloor - floor[i]) < differenceBetweenFloors) {
				differenceBetweenFloors = Math.abs(currentFloor - floor[i]);
				nearestFloor = i;
			}
		}
		
		floor[nearestFloor] = destinationFloor;
		
		System.out.println("Output : ");
		System.out.println("L" + (nearestFloor+1) + " is assigned");
		
		displayLift();
	}
	
	public static void assignNearestLift() {
		getUserInput();
		
		int nearestFloor = 0;
		int differenceBetweenFloors = Math.abs(currentFloor - floor[0]);
		boolean rightDirection = findDirection(floor[0]);
		
		for (int i=1; i<floor.length; i++) {
			if (Math.abs(currentFloor - floor[i]) < differenceBetweenFloors) {
				differenceBetweenFloors = Math.abs(currentFloor - floor[i]);
				nearestFloor = i;
				rightDirection = findDirection(floor[i]);
				
			} else if (Math.abs(currentFloor - floor[i]) == differenceBetweenFloors) {
				if (!rightDirection && findDirection(floor[i])) {
					differenceBetweenFloors = Math.abs(currentFloor - floor[i]);
					nearestFloor = i;
					rightDirection = true;
				}
			}
		}
		
		floor[nearestFloor] = destinationFloor;
		
		System.out.println("Output : ");
		System.out.println("L" + (nearestFloor+1) + " is assigned");
		
		displayLift();
	}
	
	public static void assignNearestAccessibleLift() {
		getUserInput();
		
		int nearestFloor = 0;
		int differenceBetweenFloors = Math.abs(currentFloor - floor[0]);
		boolean rightDirection = findDirection(floor[0]);
		
		for (int i=1; i<floor.length; i++) {
			if (!isAccessible(i)) {
				continue;
			}
			else if (Math.abs(currentFloor - floor[i]) < differenceBetweenFloors) {
				differenceBetweenFloors = Math.abs(currentFloor - floor[i]);
				nearestFloor = i;
				rightDirection = findDirection(floor[i]);
				
			} else if (Math.abs(currentFloor - floor[i]) == differenceBetweenFloors) {
				if (!rightDirection && findDirection(floor[i])) {
					differenceBetweenFloors = Math.abs(currentFloor - floor[i]);
					nearestFloor = i;
					rightDirection = true;
				}
			}
		}
		
		floor[nearestFloor] = destinationFloor;
		
		System.out.println("Output : ");
		System.out.println("L" + (nearestFloor+1) + " is assigned");
		
		displayLift();
	}
	
	public static boolean isAccessible(int position) {
		int access = accessLevel[position];
		
		if (access == 5) {
			return (destinationFloor <= access);
		} else if (access == 10) {
			return (destinationFloor >= 6 || destinationFloor == 0);
		} else return true;
	}
	
	public static boolean findDirection(int lift) {
		if (currentFloor - destinationFloor > 0) {
			return (lift > currentFloor);
		} else {
			return (lift < currentFloor);
		}
	}
	
	public static void getUserInput() {
		System.out.print("Enter current and destination floor : ");
		
		currentFloor = sc.nextInt();
		destinationFloor = sc.nextInt();
	}

}

package assignment;

import java.util.Scanner;

public class AdventureGame4 {
	static int minPath;
	static char target;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter dungeon dimension :");
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		
		System.out.println("Enter adventurer position :");
		int adventurerRow = scanner.nextInt() - 1;
		int adventurerColumn = scanner.nextInt() - 1;
		
		System.out.println("Enter monster position :");
		int monsterRow = scanner.nextInt() - 1;
		int monsterColumn = scanner.nextInt() - 1;
		
		System.out.println("Enter Trigger position :");
		int triggerRow = scanner.nextInt() - 1;
		int triggerColumn = scanner.nextInt() - 1;
		
		System.out.println("Enter gold position :");
		int goldRow = scanner.nextInt() - 1;
		int goldColumn = scanner.nextInt() - 1;
		
		char[][] board = new char[row][column];
		boolean[][] visited = new boolean[row][column];
		
		board[adventurerRow][adventurerColumn] = 'A';
		board[goldRow][goldColumn] = 'G';
		board[monsterRow][monsterColumn] = 'M';
		board[triggerRow][triggerColumn] = 'T';
		
		// monster logics
		minPath = row * column;
		target = 'G';
		shortestPath(monsterRow, monsterColumn, board, visited, 0);
		int monsterCount = minPath;
		
		// adventurer logics
		minPath = row * column;
		shortestPath(adventurerRow, adventurerColumn, board, visited, 0);
		int adventurerCount = minPath;
		
		if (monsterCount < adventurerCount) {
			// monster to trigger logics
			minPath = row * column;
			target = 'T';
			shortestPath(monsterRow, monsterColumn, board, visited, 0);
			int monsterTriggerCount = minPath;
			
			// adventurer to trigger logics
			minPath = row * column;
			shortestPath(adventurerRow, adventurerColumn, board, visited, 0);
			int adventurerTriggerCount = minPath;
			
			if (monsterTriggerCount < adventurerTriggerCount) {
				System.out.println("There is no Possibilities...!");
			} else {
				// trigger to gold logics
				minPath = row * column;
				target = 'G';
				shortestPath(triggerRow, triggerColumn, board, visited, 0);
				int triggerCount = minPath;
				System.out.println("No of Steps taken : " + (adventurerTriggerCount + triggerCount));
			}
		} else {
			System.out.println("No of Steps taken : " + adventurerCount);
		}
		
		scanner.close();
	}
	
	public static void shortestPath(int row, int column, char[][] board, boolean[][] visited, int count) {
		if (row >= board.length || column >= board[0].length || row < 0 || column < 0 || visited[row][column] || count > minPath) {
			return;
		}
		
		if (board[row][column] == target) {
			if (count < minPath) minPath = count;
			return;
		}
		
		visited[row][column] = true;
		
		shortestPath(row+1, column, board, visited, count+1);
		shortestPath(row-1, column, board, visited, count+1);
		shortestPath(row, column+1, board, visited, count+1);
		shortestPath(row, column-1, board, visited, count+1);
		
		visited[row][column] = false;
	}
	
}

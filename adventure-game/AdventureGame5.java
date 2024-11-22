package assignment;

import java.util.Scanner;

public class AdventureGame5 {
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
		
		System.out.println("Enter gold position :");
		int goldRow = scanner.nextInt() - 1;
		int goldColumn = scanner.nextInt() - 1;
		
		// constructing dungeon and assigning values...
		char[][] board = new char[row][column];
		boolean[][] visited = new boolean[row][column];
		
		board[adventurerRow][adventurerColumn] = 'A';
		board[goldRow][goldColumn] = 'G';
		
		System.out.println("Enter no of pits : ");
		int pits = scanner.nextInt();
		
		for (int i=1; i<=pits; i++) {
			System.out.println("Position of pit " + i + ": ");
			int pitRow = scanner.nextInt() - 1;
			int pitColumn = scanner.nextInt() - 1;
			board[pitRow][pitColumn] = 'P';
		}
		
		// adventurer logics
		target = 'G';
		minPath = row * column;
		shortestPath(adventurerRow, adventurerColumn, board, visited, 0);
		int adventurerCount = minPath;
		
		if (row * column == adventurerCount) System.out.println("There is no Possible solution");
		else System.out.println("Minimum no of steps : " + adventurerCount);
		
		scanner.close();
	}
	
	public static void shortestPath(int row, int column, char[][] board, boolean[][] visited, int count) {
		if (row >= board.length || column >= board[0].length || row < 0 || column < 0 || visited[row][column] || count > minPath || board[row][column] == 'P') {
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

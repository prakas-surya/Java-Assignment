package assignment;

import java.util.Scanner;

public class AdventureGame2 {

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
		
		System.out.println("Enter gold position :");
		int goldRow = scanner.nextInt() - 1;
		int goldColumn = scanner.nextInt() - 1;
		
		char[][] board = new char[row][column];
		boolean[][] visited = new boolean[row][column];
		
		board[adventurerRow][adventurerColumn] = 'A';
		board[goldRow][goldColumn] = 'G';
		board[monsterRow][monsterColumn] = 'M';
		
		int adventurerPathLength = shortestPath(adventurerRow, adventurerColumn, board, visited, row*column, 0);
		int monsterPathLength = shortestPath(monsterRow, monsterColumn, board, visited, row*column, 0);
		if (adventurerPathLength <= monsterPathLength) System.out.println(adventurerPathLength); 
		else System.out.println("No possible solution");
		scanner.close();
	}
	
	private static int shortestPath(int row, int column, char[][] board, boolean[][] visited, int minPath, int count) {
		if (row >= board.length || column >= board[0].length || row < 0 || column < 0 || visited[row][column] || count > minPath) {
			return minPath;
		}
		
		if (board[row][column] == 'G') {
			return count;
		}
		
		visited[row][column] = true;
		
		int rowPlus = shortestPath(row+1, column, board, visited, minPath, count+1);
		if (rowPlus < minPath) minPath = rowPlus;
		
		int rowMinus = shortestPath(row-1, column, board, visited, minPath, count+1);
		if (rowMinus < minPath) minPath = rowMinus;
		
		int columnPlus = shortestPath(row, column+1, board, visited, minPath, count+1);
		if (columnPlus < minPath) minPath = columnPlus;
		
		int columnMinus = shortestPath(row, column-1, board, visited, minPath, count+1);
		if (columnMinus < minPath) minPath = columnMinus;
		
		visited[row][column] = false;
		
		return minPath;
	}
}

package assignment;

import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row and col :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		row++;
		col++;
		System.out.println("enter pos of adventure :");
		int adventureRow = sc.nextInt();
		int adventureCol = sc.nextInt();
		System.out.println("enter pos of adventure :");
		int goldRow = sc.nextInt();
		int goldCol = sc.nextInt();
		sc.close();
		
		char[][] arr = new char[row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if (adventureRow == i && adventureCol == j) arr[i][j] = 'A';
				if (goldRow == i && goldCol == j) arr[i][j] = 'G';
			}
		}
		
		System.out.println(findShortestPath(adventureRow, adventureCol, arr, row*col, 0));
	}
	
	private static int findShortestPath(int row, int col, char[][] arr, int minPath, int count) {
		
		if (arr[row][col] == 'G') {
			return count;
		}
		
		if ((row > arr.length && col > arr[0].length)) {
			return arr.length * arr[0].length;
		}
		
		if (row-1 > 0) {
			int path = findShortestPath(row-1, col, arr, minPath, count+1);
			if (path < minPath) minPath = path;
		}
		if (row+1 < arr.length) {
			int path = findShortestPath(row+1, col, arr, minPath, count+1);
			if (path < minPath) minPath = path;
		}
		if (col-1 > 0) {
			int path = findShortestPath(row, col-1, arr, minPath, count+1);
			if (path < minPath) minPath = path;
		}
		if (col+1 < arr[0].length) {
			int path = findShortestPath(row, col+1, arr, minPath, count+1);
			if (path < minPath) minPath = path;
		}
		
		return minPath;
	}

}

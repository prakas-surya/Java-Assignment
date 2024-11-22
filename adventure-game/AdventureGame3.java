package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AdventureGame3 {
	static int minPath;

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
		
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> adventurerPath = new ArrayList<>();
		List<List<Integer>> monsterPath = new ArrayList<>();
		
		// monster logics
		minPath = row * column;
		shortestPath(monsterRow, monsterColumn, board, visited, 0, list, monsterPath);
		int monsterCount = minPath;
		
		// adventurer logics
		minPath = row * column;
		list.clear();
		shortestPath(adventurerRow, adventurerColumn, board, visited, 0, list, adventurerPath);
		int adventurerCount = minPath;
		
		if (adventurerCount == monsterCount) { // check if monster and adventure count is same....
			System.out.println("No of Steps taken : " + adventurerCount);
			findValidPath(adventurerPath, monsterPath, goldRow, goldColumn);
			
		} else if (adventurerCount < monsterCount) { // we can print any possibilities...
			System.out.println("No of Steps taken : " + adventurerCount);
			
			displayValidPath(adventurerPath.get(0), goldRow+1, goldColumn+1);
			
		} else { // no possibilities is possible...
			System.out.println("Adventurer cannot reach the Gold...!");
		}
		
		scanner.close();
	}
	
	public static void shortestPath(int row, int column, char[][] board, boolean[][] visited, int count, List<Integer> temp, List<List<Integer>> possibilities) {
		if (row >= board.length || column >= board[0].length || row < 0 || column < 0 || visited[row][column] || count > minPath) {
			return;
		}
		
		if (board[row][column] == 'G') {
			if (count <= minPath) {
				if (count < minPath) possibilities.clear();
				possibilities.add(new ArrayList<>(temp));
				minPath = count;
			}
			return;
		}
		
		visited[row][column] = true;
		temp.add(row+1);
		temp.add(column+1);
		
		shortestPath(row+1, column, board, visited, count+1, temp, possibilities);
		shortestPath(row-1, column, board, visited, count+1, temp, possibilities);
		shortestPath(row, column+1, board, visited, count+1, temp, possibilities);
		shortestPath(row, column-1, board, visited, count+1, temp, possibilities);
		
		visited[row][column] = false;
		temp.remove(temp.size()-1);
		temp.remove(temp.size()-1);
	}
	
	public static void findValidPath(List<List<Integer>> adventurerPath, List<List<Integer>> monsterPath, int goldRow, int goldColumn) {
		Set<String> pairSet = new HashSet<>();
        for (List<Integer> path : monsterPath) {
            for (int i = 0; i < path.size(); i += 2) {
                String pair = path.get(i) + "," + path.get(i + 1);
                pairSet.add(pair);
            }
        }
        int index;
        boolean isFound = false;
        for (index=0; index<adventurerPath.size(); index++) {
        	isFound = true;
        	for (int j=0; j<adventurerPath.get(index).size(); j=j+2) {
        		String s = adventurerPath.get(index).get(j) + "," + adventurerPath.get(index).get(j+1);
        		if (pairSet.contains(s)) {
        			isFound = false;
        			break;
        		}
        	}
        	if (isFound == true) {
        		displayValidPath(adventurerPath.get(index), goldRow+1, goldColumn+1);
        		break;
        	}
        }
        
        if (isFound == false) System.out.println("There is no Possible combinations...!");
	}
	
	public static void displayValidPath(List<Integer> validPath, int goldRow, int goldColumn) {
		for (int i=0; i<validPath.size(); i=i+2) {
			System.out.print("(" + validPath.get(i) + "," + validPath.get(i+1) + ")->");
		}
		System.out.print("(" + goldRow + "," + goldColumn + ")");
	}
}

package Assignment;

import java.util.Scanner;

public class SecondOccurrenceOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, target, count = 0, j;
		
		System.out.println("Enter the size of array : ");
		size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter array values : ");
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target element : ");
		target = sc.nextInt();
		sc.close();
		
		for (j=0; j<size; j++) {
			if (arr[j] == target) count++;
			if (count == 2) break;
		}
		
		if (count == 2) System.out.println("The second occurrence of target is at " + j + "th index");
		else if (count == 1) System.out.println("Target occurs only once in array");
		else System.out.println("Target element not found!");
	}

}

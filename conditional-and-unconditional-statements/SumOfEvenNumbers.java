package Assignment;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int size, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array : ");
		size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of Array : ");
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]%2 == 0) sum += arr[i];
		}
		
		System.out.println("The sum of Even numbers in the array is " + sum);
		sc.close();
	}

}

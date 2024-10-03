package Assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to generate Multiplication table : ");
		int n = sc.nextInt();
		
		System.out.println("The Multiplication table for " + n + " is");
		for (int i=1; i<=10; i++) {
			System.out.println(i + " x " + n + " = " + i*n);
		}
		sc.close();
	}

}

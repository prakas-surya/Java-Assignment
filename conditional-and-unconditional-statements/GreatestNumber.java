package Assignment;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c : ");
		double c = sc.nextDouble();
		
		System.out.println("The Greatest number among a, b and c is " + Math.max(a, Math.max(b, c)));
		sc.close();
	}

}

package Assignment;

import java.util.Scanner;

public class FindGrade {
	static void calculateGrade(double score) {
		if (score < 0 || score > 100) System.out.println("Invalid Score");
		else {
			if (score >= 91 && score <= 100) System.out.println("Your grade is A");
			else if (score >= 81 && score <= 90) System.out.println("Your grade is B");
			else if (score >= 71 && score <= 80) System.out.println("Your grade is C");
			else if (score >= 61 && score <= 70) System.out.println("Your grade is D");
			else System.out.println("Your grade is F");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Score : ");
		double score = sc.nextDouble();
		
		calculateGrade(score);
		sc.close();
	}

}

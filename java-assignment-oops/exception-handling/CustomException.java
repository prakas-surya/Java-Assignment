package assignment;

import java.util.Scanner;

class NegativeNumberException extends Exception {
	public NegativeNumberException(String message) {
		super(message);
	}
}

public class CustomException {

	public static void main(String[] args) throws NegativeNumberException {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the number : ");
			int number = scanner.nextInt();
			scanner.close();
			
			if (number < 0) throw new NegativeNumberException("Number should not be negative");
			else System.out.println("Program is fine");
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
	}

}

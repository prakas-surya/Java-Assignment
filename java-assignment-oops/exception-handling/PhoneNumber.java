package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter phone number : ");
			long number = sc.nextLong();
			sc.close();
			System.out.println(number);
		} catch (InputMismatchException e) {
			System.out.println("Phone number must contain only numbers");
		}
		

	}

}

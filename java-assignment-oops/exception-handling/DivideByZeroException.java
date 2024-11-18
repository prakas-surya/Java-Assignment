package assignment;

import java.util.Scanner;

public class DivideByZeroException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter dividend: ");
            int dividend = scanner.nextInt();
            
            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();
            
            int result = dividend / divisor;
            System.out.println("Result: " + result);
            scanner.close();
            
        } catch (ArithmeticException e) {
            System.out.println("Division any number by 0 leads to infinity!");
        }
    }
}

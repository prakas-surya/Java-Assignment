package assignment;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Integer Operations:");
        System.out.println("Add: " + math.add(10, 5));
        System.out.println("Subtract: " + math.subtract(10, 5));
        System.out.println("Multiply: " + math.multiply(10, 5));
        System.out.println("Divide: " + math.divide(10, 5));

        System.out.println("\nDouble Operations:");
        System.out.println("Add: " + math.add(10.5, 5.2));
        System.out.println("Subtract: " + math.subtract(10.5, 5.2));
        System.out.println("Multiply: " + math.multiply(10.5, 5.2));
        System.out.println("Divide: " + math.divide(10.5, 5.2));
    }
}


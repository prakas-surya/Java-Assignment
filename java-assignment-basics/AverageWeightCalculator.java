import java.util.Scanner;

public class AverageWeightCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of People :");
		int noOfPeople = scanner.nextInt();
		
		double[] weights = new double[noOfPeople];
		double totalWeight = 0.0;
		
		System.out.println("Enter weight in kg");
		for (int i=0; i<noOfPeople; i++) {
			System.out.println("Enter weight of person" + (i+1) + " :");
			weights[i] = scanner.nextDouble();
			totalWeight += weights[i];
		}
		
		double averageWeight = totalWeight / noOfPeople;
		System.out.printf("The average weight is : %.2f Kg\n", averageWeight);
		
		scanner.close();
	}

}

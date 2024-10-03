package Assignment;

public class PrimeNumbers {
	static boolean isPrimeNumber(int n) {
		for (int i=2; i<=n/2; i++) {
			if (n%i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("The Prime numbers between 1 and 30 are ");
		for (int i=2; i<=30; i++) {
			if (isPrimeNumber(i)) System.out.print(i + " ");
		}
	}

}

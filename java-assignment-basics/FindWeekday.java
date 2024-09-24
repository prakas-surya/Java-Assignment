import java.util.Scanner;

enum Weekdays {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class FindWeekday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a day between 1 to 7 :");
		int dayNumber = scanner.nextInt();
		
		if (dayNumber < 1 || dayNumber > 7) {
			System.out.println("Entered number is invalid");
		}
		else {
			Weekdays day = Weekdays.values()[dayNumber-1];
			System.out.println("The Weekday is " + day);
		}
		scanner.close();
	}

}

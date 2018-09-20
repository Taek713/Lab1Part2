											// Lab 2 By Tae Kim
package mysecondlab;

import java.util.Scanner; // Using scanner to get user input.
import java.time.LocalDate; // Import LocalDate
import java.time.Period; // Import Period

public class TimeDurationCalculator {

			// Creating a main method.
	public static void main(String[] args) {

			// Prompt for oldest date input by user.
		System.out.print("Enter the oldest date in YYYY-MM-DD format: ");

			// Create a Scanner object
		Scanner scanner = new Scanner(System.in);

		String oldestDateString = scanner.nextLine();

		LocalDate oldestDate = LocalDate.parse(oldestDateString);

		System.out.println("You entered " + oldestDate + " for your oldest date.");
		System.out.print("Enter the most recent date in YYYY-MM-DD format: ");

		String newestDateString = scanner.nextLine();
		LocalDate newestDate = LocalDate.parse(newestDateString);
		System.out.println("You entered " + newestDate + " for your most recent date.");

		Period difference = oldestDate.until(newestDate);

		int days = difference.getDays();
		int months = difference.getMonths();
		int years = difference.getYears();

		scanner.close();

		System.out
				.println("Your time difference is: " + months + " Months, " + days + " Days, and " + years + " Years.");
	}

}

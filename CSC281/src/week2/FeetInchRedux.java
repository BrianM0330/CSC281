package week2;
import java.util.Scanner;

public class FeetInchRedux {

	public static void main(String[] args) {
		
		// This is a constant because of the keyword final
		final double INCHES_IN_FOOT = 12.0;
		// What happens if I modify INCHES_IN_FOOT in the program?
		// Why did I make this constant a double?
		// What happens if the constant is not a double?

		double feet, inches;
		int wholeInches;
		String ft, inch;

		Scanner ourScanner = new Scanner(System.in);

		// What happens here if the user types in an integer value?
		System.out.print("Enter a number in feet: ");
		ft = ourScanner.nextLine();
		feet = Double.parseDouble(ft);

		inches = feet * INCHES_IN_FOOT;

		System.out.println("\n" + feet + " feet is " + inches + " inches.\n");

		// What happens here if the user types in a decimal value?
		System.out.print("Now, enter a whole number in inches: ");
		inch = ourScanner.nextLine();
		wholeInches = Integer.parseInt(inch);

		feet = wholeInches / INCHES_IN_FOOT;

		System.out.println("\n" + wholeInches + " inches is " + feet + " feet.\n");
		
		ourScanner.close();
	}
}

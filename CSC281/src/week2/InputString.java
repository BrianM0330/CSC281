package week2;
import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		
		Scanner ourScanner = new Scanner(System.in);

		System.out.print("Enter your full name: ");
		String fullName = ourScanner.nextLine();

		System.out.println("Your first name is " + fullName);
		
		//String lineSeparator = System.getProperty("line.separator");
		//ourScanner.useDelimiter(lineSeparator);
		// The following line is equivalent to the previous two lines:
		//ourScanner.useDelimiter(System.getProperty("line.separator"));

		// What happens if the user enters his/her full name here?
		System.out.print("Enter your first name: ");
		String firstName = ourScanner.next();

		System.out.println("Your name is " + firstName + "\n");
		
		// Enter another name
		//System.out.print("Please enter your best friend's name: ");
		//String friend = ourScanner.next();
		//System.out.println("You entered: " + friend);
		
		// Enter a number
		//System.out.print("Please enter a whole number: ");
		//int num = ourScanner.nextInt();
		//System.out.println("The number is: " + num);
		
		ourScanner.close();
	}
}

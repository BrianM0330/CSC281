package week3;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		Scanner theScan = new Scanner(System.in);
		System.out.print("Enter a string for testing: ");
		String sample = theScan.nextLine();
		Character option, ans = 'y';
		String test, s;

		while (ans.equals('y')) {
			System.out.print("Enter a string to be tested: ");
			test = theScan.nextLine();
			System.out.print("Which operation (e = equals, s = startswith, d = endswith)? ");
			s = theScan.nextLine();
			option = s.toLowerCase().charAt(0);
			if (option.equals('e'))
				System.out.println(sample + " equals " + test + " : " + sample.equals(test));
			else if (option.equals('s'))
				System.out.println(sample + " startswith " + test + " : " + sample.startsWith(test, 0));
			else if (option.equals('d'))
				System.out.println(sample + " endswith " + test + " : " + sample.endsWith(test));
			else
				System.out.println("I didn't understand that response.");
			System.out.print("Do you wish to continue (y/n): ");
			s = theScan.nextLine();
			ans = s.toLowerCase().charAt(0);
		}
		
		System.out.println("Thanks! Goodbye.");
		theScan.close();
	}
}

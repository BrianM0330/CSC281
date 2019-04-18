package week3;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		Scanner theScan = new Scanner(System.in); //Initializing the scanner 
		System.out.print("Enter a string for testing: "); //print to terminal 
		String sample = theScan.nextLine(); //defining the string object named sample as the scanner's input 
		Character option, ans = 'y'; //
		String test, s; //Defining the string object. Format is typically string stringName = new String('Some character string');

		while (ans.equals('y')) {
			System.out.print("Enter a string to be tested: ");
			test = theScan.nextLine(); //initialize the TEST variable to a scan 
			System.out.print("Which operation (e = equals, s = startswith, d = endswith)? ");
			s = theScan.nextLine(); //initialize the S variable to a scan
			option = s.toLowerCase().charAt(0); //converting it to lowercase -> getting the first character using .charAt so we can use it as a param
			if (option.equals('e')) //if the converted option = e run line 18 
				System.out.println(sample + " equals " + test + " : " + sample.equals(test));
			else if (option.equals('s'))
				System.out.println(sample + " startswith " + test + " : " + sample.startsWith(test, 0));
			else if (option.equals('d'))
				System.out.println(sample + " endswith " + test + " : " + sample.endsWith(test));
			else
				System.out.println("I didn't understand that response.");
			System.out.print("Do you wish to continue (y/n): "); // prompt
			s = theScan.nextLine(); //this takes the answer that was printed in l29
			ans = s.toLowerCase().charAt(0); //convert it to make it valid - if it is n -> while loop terminates
		}
		
		System.out.println("Thanks! Goodbye.");
		theScan.close();
	}
}

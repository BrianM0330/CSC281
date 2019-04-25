package week4;

// Author: Amber Settle
// CSC 281-501/510

import java.util.Scanner;

public class temptester {

	public static void main(String[] args) {
	
		Temp firstT = new Temp();
		Temp secondT = new Temp(-3.0, 'c');
		Temp thirdT = new Temp(3, '%');
		Temp fourthT = new Temp(15.5, 'F');
		System.out.println(firstT.getC() + " Celsius is " +
				firstT.getF() + " Fahrenheit.");
		System.out.println(secondT.getC() + " Celsius is " +
				secondT.getF() + " Fahrenheit.");
		System.out.println(thirdT.getC() + " Celsius is " +
				thirdT.getF() + " Fahrenheit.");
		System.out.println(fourthT.getC() + " Celsius is " +
				fourthT.getF() + " Fahrenheit.");
		System.out.println();
		
		String rText;
		char reply;
		boolean done = false;
		Scanner tScan = new Scanner(System.in);

		while (!done) {
			
			System.out.println("Calling set on the first temp ...");
			firstT.set();
			System.out.println("Calling set on the second temp ...");
			secondT.set();

			System.out.println(firstT.getC() + " Celsius is " +
								firstT.getF() + " Fahrenheit.");
			System.out.println(secondT.getC() + " Celsius is " +
								secondT.getF() + " Fahrenheit.");

			System.out.print("Do you wish to continue (y/n)? ");
			rText = tScan.next();
			reply = rText.charAt(0);

			System.out.println();
			
			if (reply == 'n' || reply == 'N')
				done = true;

	    }

		System.out.println("Goodbye!");
		tScan.close();
	}
}

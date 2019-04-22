package week3;

// Put your name here
// Put your collaboration statement here

import java.util.*;

public class Hw3 {

	// This method should not change in your submission version.
	// All changes to make the program work should be done in the
	// three methods below.
	// The compilation errors here are the fault of the methods below,
	// not the main method.
	// When the methods below are correctly fixed/written, this main
	// will work as desired.
	public static void main(String[] args) {
		Scanner aScan = new Scanner(System.in);
	
		System.out.println("How many cities are there? ");
		int max = getPosInt(aScan);
		
		String[] cities = getCities(max, aScan);
		
		System.out.println("The maximum city (alphabetically) you entered is: ");
		System.out.println(getLargest(cities));
		
		aScan.close();	
	}
	
	// The method below contains compilation and runtime errors which you 
	// should: 1. correct and 2. mark so that I can see the changes you've made.
	// Do not change the basic functioning of the method -- just make it run.
	// There are three compilation errors and two runtime errors
	public static getPosInt(theScan) {
		System.out.println("Entering the getPosInt method ...");
		max = 0;
		String maxS;
		
		while (max <= 0); 
			System.out.print("Enter a positive (> 0) whole number: ");
			maxS = theScan.nextLine();
			max = Integer.parseInt(maxS);
			if (max <= 0) 
				System.out.println("Please enter a positive (> 0) number.");
		
		System.out.println("Leaving the getPosInt method ...");
		return max;
	}
	
	// Write this method
	public static String[] getCities(int m, Scanner theScan) {
		// A stub -- delete when you write the method
		return new String[0];
	}
	
	// The method below contains compilation and runtime errors which you 
	// should: 1. correct and 2. mark so that I can see the changes you've made.
	// Do not change the basic functioning of the method -- just make it run.
	// There are four compilation errors and one runtime error
	public String getLargest(String sArray) {
		System.out.println("Entering the getLargest method ...");
		maxPos = 0;
		for (int index = 1; index < sArray.length; index--)
    	{
        	if (sArray[index].compareTo(sArray[maxPos]) > 0)
            	maxPos = index;
    	}
		System.out.println("Leaving the getLargest method ...");
		return sArray[maxPos]
	}
}

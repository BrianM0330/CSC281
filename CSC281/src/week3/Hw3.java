package week3;

//Brian Mendoza 
//I worked alone on this assignment.

import java.util.*;

public class Hw3 {

	public static void main(String[] args) {
		Scanner aScan = new Scanner(System.in);
	
		System.out.println("How many cities are there? ");
		int max = getPosInt(aScan);
		String[] cities = getCities(max, aScan);
		
		System.out.println("The maximum city (alphabetically) you entered is: ");
		System.out.println(getLargest(cities));
		
		aScan.close();	
	}
	
	// There are three compilation errors and two runtime errors
	public static int getPosInt(Scanner theScan) {
		//added variable type Scanner to theScan to resolve issue with VariableDeclaratorID
		//added int at the end of public static so it can return an int for main 
		System.out.println("Entering the getPosInt method ...");
		//added int to max to declare it as a variable of type int
		
		int max = 0; 
		String maxS;
		
		//added {} to encompass the body of the while loop the ; was preventing it from running (this was making me really mad)
		while (max <= 0) {
			System.out.print("Enter a positive (> 0) whole number: ");
			maxS = theScan.nextLine();
			max = Integer.parseInt(maxS);
			if (max <= 0) 
				System.out.println("Please enter a positive (> 0) number.");
		}
		System.out.println("Leaving the getPosInt method ...");
		return max;
	}
	
//The method takes an integer m and a Scanner object as parameters. It first creates
//an array of m Strings. It enter m cities from the user using the scanner and places
//them into the array. Finally, it returns the filled array of names. The method
//should not open or close a scanner - this is done in main.
	public static String[] getCities(int m, Scanner theScan) {
		String[] cities = new String[m]; //creating an array city of m strings 
		String cityName;
		System.out.println("Entering the getCities method ...");
		while (cities.length <= m) { //maybe this is the issue? 
			System.out.print("Enter a city: ");
			cityName = theScan.nextLine();
			for (int i=0; i < 1; i++)
			{
				cities[i] = new String(cityName);
			}
		}

		return cities;
	}
	
	
	// There are four compilation errors and one runtime error
	public static String getLargest(String [] sArray) {
		//added Static to resolve issues with using this method in main
		//Turned regular String into an array by adding [] (resolve the issues in for loop)
		System.out.println("Entering the getLargest method ...");
		//added int to declare maxPos as an variable of the type integer 
		int maxPos = 0;
		for (int index = 1; index < sArray.length; index--)
    	{
        	if (sArray[index].compareTo(sArray[maxPos]) > 0)
            	maxPos = index;
    	}
		System.out.println("Leaving the getLargest method ...");
		//added semicolon at end of return statement to resolve Syntax error 
		return sArray[maxPos];
	}
}

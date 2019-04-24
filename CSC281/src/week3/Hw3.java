package week3;

//Brian Mendoza
//I worked alone on this assignment used pythontutor.com for a little code visualization.

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
	
	public static int getPosInt(Scanner theScan) {
		//added variable type Scanner to theScan to resolve issue with VariableDeclaratorID
		
		//added int at the end of public static so it can return an int for main 

		//added int to max to declare it as a variable of type int
		
		//added {} to encompass the body of the while loop the ; was preventing it from running (this was making me really mad i spent way too long on this >:( )
		
		System.out.println("Entering the getPosInt method ...");
		int max = 0; 
		String maxS;
		
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
	
	public static String[] getCities(int m, Scanner theScan) {
		String[] cities = new String[m]; //creating an array city of m strings 
		System.out.println("Entering the getCities method ...");
		if (cities.length <= m) { 
			for (int i=0; i < cities.length; i++)
			{
				System.out.print("Enter a city: ");
				cities[i] = theScan.nextLine();
			}
		}
		return cities;
	}
		
	public static String getLargest(String [] sArray) {
		//added Static to resolve issues with using this method in main
		
		//Turned regular String into an array by adding [] (resolve the issues in for loop)
		
		//Added int to declare maxPos as an variable of the type integer 
		
		//Not sure if I changed how the fundamental problem works but I changed index-- to index++ and I changed index to 0 because it was throwing an
		//IndexOutOfBoundsException. 
		
		//added semicolon at end of return statement to resolve Syntax error 
		
		System.out.println("Entering the getLargest method ...");
		int maxPos = 0;
		for (int index = 0; index < sArray.length; index++)
    	{
        	if (sArray[index].compareTo(sArray[maxPos]) > 0)
            	maxPos = index;
    	}
		System.out.println("Leaving the getLargest method ...");
		return sArray[maxPos];
	}
}

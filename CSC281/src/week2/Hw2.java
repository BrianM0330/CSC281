package week2;
import java.util.Scanner;

// Brian Mendoza
// Put your collaboration statement here

public class Hw2 {

	// Do not modify this method except to test your partially completed program.
	// The final version should use the main as originally provided to you.
	// All of your work will be in writing the three methods found below.
	public static void main(String[] args) {
		
		try
		{
			int val = enterPos();
			int [] ages = new int[val];
			int start = 10;
			for (int i = 0; i < val; i++) {
				ages[i] = start;
				start += 20;
			}
			System.out.println("The ages:");
			printArray(ages);
			System.out.println("The number of ages >= 20: " + countValues(ages, 20));
			System.out.println("The number of ages >= 50: " + countValues(ages, 50));
			// A call that will cause problems for a non-empty, positive ages array
			//System.out.println("The number of ages >= -1: " + countValues(ages, -1)); // line 1
			// Two arrays that will cause problems -- put them into your code to test that
			// the method that counts ages handles erroneous arrays correctly
			// The line numbers are referenced in the assignment description
			//int [] empty = new int[0]; // line 2
			//System.out.println("The count for empty is: " + countValues(empty, 0)); // line 3
			//int [] incorrect = {23, 8, -1}; // line 4
			//System.out.println("The count for incorrect is: " + countValues(incorrect, 0)); // line 5
			//System.out.println("The 
		}

		catch (IllegalArgumentException exception)
		{
			System.out.println("The computation of the count failed.");
			System.out.println(exception);
		}

	}
	// A method that prints a 1D int array to standard output, all on one line with commas between each element
	public static void printArray(int[] output) {
		int[] number = {1,2,3,4,5,6}; //defined array? 
		if (number.length > 0 ) { //only if the array is not empty 
			for (int i=0; i < number.length-1; i++) { //index, for all but the last in array
				System.out.print(number[i] + ", "); //print the numbers from the list w comma
			}
		} //Is this where the newline part of the problem would go? Outside the for loop
	}

	// Write this method
	// A method that enters a positive integer from the user
	public static int enterPos() {
		int position;
		Scanner myScan = new Scanner(System.in); //Declared the scanner 
		
		System.out.println("Entering the enterPos method ...");
		position = myScan.nextInt(); //var position gets an int from the user
		while (position <= 0) { //While the position is 0 or lower 
			System.out.println("Entering the enterPos method ...");
			position = myScan.nextInt(); //Keep prompting the user to input an integer
		}
		System.out.println("Leaving the enterPos method ...");
		myScan.close();
		return position;
	}

	// Write this method
	// A method that returns the number of ages greater than or equal to value in
	// the array ages
	// If an empty array or an array with negative values is passed as a parameter
	// it raises an IllegalArgumentException
	// If value is < 0 it also raises an IllegalArgumentException
	public static int countValues(int [] ages, int value) throws IllegalArgumentException {
		System.out.println("Entering the countValues method ...");
		// Put your code here
		System.out.println("Leaving the countValues method ...");
		// A stub -- delete once you write the method
		return 0;
	}
}

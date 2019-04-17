package week2;
import java.util.Scanner;

// Brian Mendoza.
// I worked with tutor Matt Erickson to explain the try block and nudge me in the right direction for creating a newline for the last element.
// In total I worked with 2 people - myself and Matt on this assignment.

public class Hw2 {

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
		if (output.length > 0 ) { //only if the array is not empty 
			for (int i=0; i < output.length-1; i++) { //index, for all but the last in array
				System.out.print(output[i] + ", "); //print the numbers from the list w comma excluding last
			}
			System.out.println(output[output.length-1]); //prints the last number with a newline at the end
		}
	}

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

	public static int countValues(int [] ages, int value) throws IllegalArgumentException {
		int occurences = 0; 
		
		System.out.println("Entering the countValues method ...");
		if (ages.length > 0 && value > 0) { //If both age and value are >0
			for (int i=1; i < ages.length; i++ ) {
				if (ages[i] > value) {
					occurences++;
				}
			}
		}
		
		else { 
			throw new IllegalArgumentException();
		}
		System.out.println("Leaving the countValues method ...");
		return occurences;
	}
}

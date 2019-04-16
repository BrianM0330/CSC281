package week2;

import java.util.*;
import java.util.Scanner;

public class ArrayExcept {

	public static void main(String[] args) {
		
		int value, index;
		Scanner numScan = new Scanner(System.in);
		int [] anArray = {-7};

		// This is indented because I want to add a while loop that forces a valid answer
			try {
				System.out.print("Enter the array index: ");
				index = numScan.nextInt();
				value = anArray[index];
				System.out.println("The value at position " +
					   	index + " is " + value);
			}
			catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("Valid indices are between 0 and " +
							(anArray.length - 1) + ".");
			}
			
			catch(InputMismatchException except) {
				System.out.println("I meant a whole number.");
			}
		
		System.out.println("The largest of the ages in the array is: " + maxAge(anArray));

		numScan.close();
	}
	
	public static int maxAge(int [] elements) throws IllegalArgumentException {
		if (elements.length < 2)
			throw new IllegalArgumentException("The array must have two elements.");
		int maxPos = 0;
    	for (int i = 1; i < elements.length; i++) {
    		if (elements[maxPos] < elements[i]) { // is the current value bigger?
    			maxPos = i;
    		}
    	}
    	return elements[maxPos];
	}
}

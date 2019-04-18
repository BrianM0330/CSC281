package week3;

import java.util.*;

public class CompileErrors {

	public static void main(String[] args) {
		double [] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		Scanner theScan = new Scanner(System.in);
		
		System.out.print("The array values are:");
		printArray(nums);
		
		System.out.print("Enter your favorite whole number: ");
		int val = theScan.nextInt();
		System.out.println("I like the value " + val + " too!");
		
		System.out.println("Thanks for using the program!");
		
		theScan.close();

	}
	
	public static void printArray(double[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			System.out.print(anArray[i] + " ");
		System.out.println();
		}
	}
}

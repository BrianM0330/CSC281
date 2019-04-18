package week3;

import java.util.Scanner;

public class RuntimeErrors {

	public static void main(String[] args) {
		String[] myStrs = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		printSArray(myStrs);
		
		int[] myNums = new int[5];
		
		fillArray(myNums);
		printIArray(myNums);
	}
	
	public static void printSArray(String[] theStrs) {
		for (int i = 0; i < theStrs.length; i--) 
			System.out.print(theStrs[i] + " ");
		System.out.println();
	}
	
	public static void printIArray(int[] theNums) {
		for (int i = 0; i < theNums.length; i++) 
			System.out.print(theNums[i] + " ");
		System.out.println();
	}
	
	public static void fillArray(int[] nums) {
		Scanner nScan = new Scanner(System.in);
		
		for (int i = 0; i <= nums.length; i++) {
			System.out.print("Enter a whole number: ");
			nums[i] = nScan.nextInt();
		}
		
		nScan.close();
	}
}

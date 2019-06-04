package week9;

import java.util.Arrays;

public class UseArrays {
	
	final static int MAX = 10;

	public static void main(String[] args) {
		
		int[] iArray = new int[MAX];
		for (int i = 0; i < MAX; i++)
			iArray[i] = 1 + (int)(MAX * Math.random());
		
		System.out.println("The int array: " + Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println("The sorted int array: " + Arrays.toString(iArray));
		System.out.println();
		
		String[] sArray = {"one", "two", "three", "four", "five"};
		
		System.out.println("The String array: " + Arrays.toString(sArray));
		Arrays.sort(sArray);
		System.out.println("The sorted String array: " + Arrays.toString(sArray));
	}
}

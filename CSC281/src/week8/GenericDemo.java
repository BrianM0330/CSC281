package week8;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i <= 10; i++)
			arr.add(1 + (int) (6 * Math.random()));
		
		System.out.println("The random values: ");
		for (int i = 0; i <= 10; i++)
			System.out.print(arr.get(i) + " ");
		System.out.println("\n");
		
		try {
			System.out.println("The largest value is: " + findMax(arr));
		}
		catch (Exception e) {
			System.out.println("Problem finding a maximum: " + e);
		}
		
		System.out.println("\nThe sum of the array elements: " + getISum(arr));
		ArrayList<Double> arr2 = new ArrayList<>();
		for (int i = 0; i <= 10; i++)
			arr2.add(6 * Math.random());
		
		System.out.println("The random values: ");
		for (int i = 0; i <= 10; i++)
			System.out.print(arr2.get(i) + " ");
		System.out.println("\n");
		
		try {
			System.out.println("The largest value is: " + findMax(arr2));
		}
		catch (Exception e) {
			System.out.println("Problem finding a maximum: " + e);
		}
		
		System.out.println("\nThe sum of the array elements: " + getISum(arr2));
	}
	
	public static <T extends Comparable<T>> T findMax(ArrayList<T> elements) throws Exception{
		if (elements.size() == 0) 
			throw new Exception("Empty ArrayList given to findMax -- cannot find the largest");
		T max = elements.get(0);
		T val;
		for (int i = 1; i < elements.size(); i++) {
			val = elements.get(i);
			if (val.compareTo(max) > 0) 
				max = val;
		}
		return max;
	}
	
	// Write a method getISum that returns an int consisting of the sum of all elements
	// in an ArrayList<T> where <T extends Number>
	public static <T extends Number> int getISum(ArrayList<T> elements) {
		int sum = 0;
		// Put the code here
		for (int i = 0; i < elements.size(); i++) {
			sum += elements.get(i).intValue();
		}
		return sum;
	}
}

package week7;

import week7.people.Child;

public class Hw7 {

	public static void main(String[] args) {
		
		Child[] kids = new Child[3];
		kids[0] = new Child("Prudence", 2007, "Andre Berthiaume");
		kids[1] = new Child();
		kids[2] = new Child("Joon", 1994, "Jeff Elam");
		
		System.out.println("The children:");
		for (int i = 0; i < kids.length; i++) {
			System.out.println(kids[i]);
		}
		
		System.out.println();
		
		int index = findMax(kids);
		System.out.println("The largest element in the Child array is: ");
		System.out.println(kids[index]);
		System.out.println();
	}
	
	public static <T extends Comparable<T>> int findMax(T[] values) {
		
		int maxPosition = 0;
    	for (int index = 1; index < values.length; index++ )
    	{
        		if (values[index].compareTo(values[maxPosition]) > 0)
            		maxPosition = index;
    	}
   
    	return maxPosition;
	}
}

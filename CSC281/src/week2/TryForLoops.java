package week2;

import java.util.Scanner;

public class TryForLoops {

	public static void main(String[] args) {
		
		int i;
		int upper = -1;
		Scanner numScan = new Scanner(System.in);
		
		while (upper < 1)
		{
			System.out.print("Enter a positive (>= 1) whole number: ");
			upper = numScan.nextInt();
		}

		for (i = 1; i <= upper; i++)
		{
			System.out.print(i + " ");
			// Change this to print values other than i
		}

		System.out.println();

		// Demonstrate nested for loops
		for (int x = 0; x <= 3; x++)
		{
			for (int y = 1; y <= 5; y++)
			{
				System.out.print( "(" + x + "," + y + ") " );
			}
			System.out.println();
		}
		
		numScan.close();
	}
}

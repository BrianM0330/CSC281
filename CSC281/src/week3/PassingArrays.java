package week3;

public class PassingArrays {

	public static void main(String[] args) {
		double[] squareRoots = { Math.sqrt(0), Math.sqrt(1),
				Math.sqrt(2), Math.sqrt(3), Math.sqrt(4) };

	  System.out.println("Before:");
	  printArray(squareRoots);

	  // What happens if we do this?
	  //trashArray(squareRoots);

	  // What happens if we do this?
	  //trashElement(squareRoots[2]);

	  System.out.println();
	  System.out.println("After:");
	  printArray(squareRoots);
	}
	
	// Why do the following methods have to be static?

	// Display the contents of an array
	public static void printArray(double[] output)
	{
	    for (int i = 0; i < output.length; i++ )
	         System.out.println( i + ": \t" + output[i]);
	}

	// Destroy an array
	public static void trashArray(double[] destroyed)
	{
	    for (int i = 0; i < destroyed.length; i++ )
	         destroyed[i] = 99999;
	}

	// Destroy an element
	public static void trashElement(double outputElement)
	{
	    outputElement = 99999;
	}
}

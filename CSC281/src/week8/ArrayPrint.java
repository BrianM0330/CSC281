package week8;

public class ArrayPrint {

	public static void main(String[] args) {
		// Test cases for when the method has been made generic
		Integer[][] iArray = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
		
		printArray(iArray);
		System.out.println();
		
		String[][] sArray = {{"one", "two"}, {"three", "four", "five"}};
		
		printArray(sArray);
	}
	
	// Revise the method so that it accepts a 2D array of type T and prints it
	// line-by-line to the standard output stream
	
	public static <T> void printArray(T[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}

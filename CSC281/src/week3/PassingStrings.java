package week3;

public class PassingStrings {

	public static void main(String[] args) {
		String ourString = new String("This is a test.");
		//char[] theArray = {'a', 'b', 'c'};

		System.out.println("Before:");
		System.out.println(ourString);
		//printArray(theArray);
		System.out.println();

		// What happens if we do this?
		modifyString(ourString);

		// What happens if we do this?
		//modifyArray(theArray);

		System.out.println();
	    System.out.println("After:");
	    System.out.println(ourString);
	    //printArray(theArray);
	}
	
	// Display the contents of an array
	public static void printArray(char[] output)
	{
	    for (int i = 0; i < output.length; i++ )
	         System.out.println( i + ": \t" + output[i]);
	}
	
	// Modify a String
	public static void modifyString(String s) {
		for (int i = 0; i < s.length(); i++)
			s = s.replace(s.charAt(i), 'z');
		System.out.println("In modifyString: " + s);
	}
	
	// Modify an array of characters
	public static void modifyArray(char[] destroyed)
	{
	    for (int i = 0; i < destroyed.length; i++ )
	         destroyed[i] = 'z';
	    System.out.println("In modifyArray: ");
	    printArray(destroyed);
	}
}

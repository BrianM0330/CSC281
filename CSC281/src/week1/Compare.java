package week1;

public class Compare {

	public static void main(String[] args) {
		int number = 94;

    	System.out.println( number + " is between 0 and 100 is ... " +
        	(0 <= number && number <= 100));

		// Can you rewrite the following so that it uses an &&
		// instead of an ||?
		// Hint: You will need to use negation
    	System.out.println( number +
    			" is greater than 95 or less than 60 is ... " +
        		// opposite condition:
    			//(60 <= number && number <= 95));
    			(60 > number || number > 95));

		// How would you write a condition to check whether
		// number is between 70 and 79?
    	
		// How would you write a condition to check whether a
		// number is NOT in the range 30 to 39?
	}
}

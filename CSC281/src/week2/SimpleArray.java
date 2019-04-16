package week2;

public class SimpleArray {

	public static void main(String[] args) {
		
		//int[] number = new int[9];
		//number[0] = 2;
		//number[1] = -1;
		//number[2] = 7;
		
		int[] number = { -1, -2, -7, -45, -7, -88, -3, -35 };
    	// array of length nine is automatically allocated

    	// Echo back array contents
    	for (int index = 0; index < number.length; index++ )
    	{
        	System.out.println("number[" + index + "] = " + number[index]);
    	}
    	
    	int[] nums = new int[5];
    	for (int i = 0; i < nums.length; i++) {
    		nums[i] = 10 + i;
    	}
    	
    	for (int index = 0; index < nums.length; index++ )
    	{
        	System.out.println("nums[" + index + "] = " + nums[index]);
    	}

    	// Find largest element in the array
    	int maxPos = 0;
    	for (int i = 1; i < number.length; i++) {
    		if (number[maxPos] < number[i]) { // is the current value bigger?
    			maxPos = i;
    		}
    		System.out.println("The biggest so far is: " + number[maxPos]);
    	}
    	System.out.println("The biggest is: " + number[maxPos]);
	}
}

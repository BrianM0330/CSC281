package week7;

public class Search {

	public static void main(String[] args) {
		
		int[] number = { 2, -1, 7, 45, -7, 0, 88, 3, -35, 12 };
		int index = findMaxInt(number);
		System.out.println();
		System.out.println("The largest element in the int array is: " + number[index]);
		System.out.println();
		
		String[] strs = {"Amber", "Chad", "Sam", "Gertrude", "Prudence", "Samantha", "Erin"};
		
		index = findMax(strs);
		System.out.println();
		System.out.println("The largest element in the String array is: " + strs[index]);
		System.out.println();
		
		Double[] nums = {1.1, 5.5, 3.3, 4.4, 5.5};
		index = findMax(nums);
		System.out.println();
		System.out.println("The largest element in the Double array is: " + nums[index]);
		System.out.println();
		
		Person[] people = new Person[3];
		people[0] = new Person();
		people[1] = new Person("An", 1999);
		people[2] = new Person("Adam", 1991);
		
		// "name was born in year" where name and year are the properties of the person
		System.out.println("The people: ");
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i] + " is " + people[i].age() + " years old");
		}
		
		index = findMax(people);
		System.out.println();
		System.out.println("The largest element in the Person array is: " + people[index]);
		System.out.println();
	}
	
	// T is not a type in Java
	// T is not a class defined in Java
	public static <T extends Comparable<T>> int findMax(T[] values) {
		
		int maxPosition = 0;

    	for (int index = 1; index < values.length; index++ )
    	{
    			// x.compareTo(y) == 0 if x "==" y
    			// x.compareTo(y) > 0 if x ">" y
    			// x.compareTo(y) < 0 if x "<" y
    							 // >
        		if (values[index].compareTo(values[maxPosition]) > 0)
            		maxPosition = index;
    	}

    	return maxPosition;
	}
	
	public static int findMaxInt(int[] values) {
		
		int maxPosition = 0;
    	//System.out.println(0 + ": largest element seen so far is "
        //    		+ values[maxPosition]);
    	
    	for (int index = 1; index < values.length; index++ )
    	{
        		if (values[index] > values[maxPosition])
            		maxPosition = index;

        		//System.out.println(index + ": largest element seen so far is "
            	//	+ values[maxPosition]);
    	}
    	
    	//System.out.println("Largest array element is number[" + maxPosition +
       // 		"] = " + values[maxPosition]);
    	return maxPosition;
	}
}

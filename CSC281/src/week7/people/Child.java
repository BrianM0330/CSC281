package week7.people;

// Put your name here
// Put your collaboration statement here

import java.time.LocalDate;

public class Child extends Person implements Comparable<Child>{

	// Do not add any additional members to the class
	// If you wish to use local variables in the method you may
	
	private String parent;
	
	private final int AGE_MAJ = 18;
	private final int D_AGE = 15;
	
	public Child() {
		
	}
	
	public Child(String n, int y, String p) {
		
	}
	
	public int compareTo(Child other) {
		// A stub -- replace when you write the class
		return 0;
	}
	
	public String toString() {
		// A stub -- replace when you write the class
		return "";
	}
}

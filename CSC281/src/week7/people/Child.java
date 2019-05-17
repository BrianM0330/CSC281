package week7.people;

// Brian Mendoza
// Put your collaboration statement here

import week7.Person;

import java.time.LocalDate;

public class Child extends Person implements Comparable<Child>{

	// Do not add any additional members to the class
	// If you wish to use local variables in the method you may
	
	private String parent;
	
	private final int AGE_MAJ = 18;
	private final int D_AGE = 15;
	
	public Child() {
		name = "Erin";
		LocalDate today = LocalDate.now();
		bYear = today.getYear() - D_AGE;
	}
	
	public Child(String n, int y, String p) {

		LocalDate today = LocalDate.now();
		int theYear = today.getYear();

		if (y < AGE_MAJ) {
			bYear = y;
		}
		else {
			bYear = theYear - D_AGE;
		}
	}
	
	public int compareTo(Child other) {

		return 0;
	}
	
	public String toString() {
		return String.format("Name: %s, birth year: %d, parent: ", name, bYear) + parent ;
	}
}

package week7.people;

// Brian Mendoza
// Worked alone.

import week7.Person;

import java.time.LocalDate;

public class Child extends Person implements Comparable<Child>{

	private String parent;

	private final int AGE_MAJ = 18;
	private final int D_AGE = 15;

	public Child() {
		name = "Erin";
		parent = "Amber Settle";
		LocalDate today = LocalDate.now();
		bYear = today.getYear() - D_AGE;
	}

	public Child(String n, int y, String p) {
	    name = n;
	    parent = p;
		LocalDate today = LocalDate.now();
		int theYear = today.getYear();

		if (theYear - y < AGE_MAJ) {
			bYear = y;
		}
		else {
			bYear = theYear - D_AGE;
		}
	}

	public int compareTo(Child other) {
        LocalDate today = LocalDate.now();
        int theYear = today.getYear();

	    if (theYear - this.bYear < theYear - other.bYear)
	        return -1;
	    else if (theYear - this.bYear > theYear - other.bYear)
	        return 1;
	    else
	        return 0;
	}

	public String toString() {
		return String.format("Name: %s, birth year: %d, parent: %s", name, bYear, parent);
	}
}

package week7;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
	
	private int bYear;
	private String name;
	
	public Person() {
		LocalDate today = LocalDate.now();
		name = "Default";
		bYear = today.getYear();
	}
	
	// This method does no error checking and it should!
	public Person(String initName, int birthYear) {
		name = initName;
		bYear = birthYear;
	}
	
	public int compareTo(Person other) {
		// comparing names 
		// return 0, -1, or 1
		// name of calling object: this.name or name
		// name of other object: other.name
		if (this.name.compareTo(other.name) == 0)
			return 0;
		else if (this.name.compareTo(other.name) > 0)
			return 1;
		else return -1;
		
		// return this.name.compareTo(other.name);
		
	}
	public int age() {
		int current = LocalDate.now().getYear();
		return current - bYear;
	}
	
	// "name was born in year" where name and year are the properties of the person
	public String toString() {
		return String.format("%s was born in %d", name, bYear);
		//return name + " was born in " + bYear;
	}
}

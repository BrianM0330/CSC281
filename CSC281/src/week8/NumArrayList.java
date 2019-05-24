// To use or not as you wish
package week8; //!!!!!!!!!!!!!!!!!!!!!! CHANGE BACK TO hw8

// Brian Mendoza
// Worked alone.

import java.util.ArrayList;
import java.util.Arrays;

public class NumArrayList<T extends Number>{

	private ArrayList<T> L;

	public NumArrayList() {
		this.L = new ArrayList<>();
	}
	
	// Create a new NumArrayList, initializing it with the parameter
	public NumArrayList(T[] initValues) {
		L = new ArrayList<>();
		for (element : initValues) {
			L.add(element);
		}
	}
	
	public void add(T elem) {
	
	}
	
	// Uncomment out and write this method
	// There isn't a reasonable stub I can put in it
	//public T get(int index) {
	//	
	//}

	// Return the String representation of the NumArrayList
	public String toString() {
		// replace this with the correct implementation
		return "";
	}

	
	// Multiply the NumArrayList by an Integer value
	public NumArrayList<Integer> iMult(Integer val) {
		NumArrayList<Integer> product = new NumArrayList<Integer>();
		// Put your code to fill the NumArrayList product here
		return product;
	}
}



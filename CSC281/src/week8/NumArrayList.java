package week8; //!!!!!!!!!!!!!!!!!!!!!! CHANGE BACK TO hw8

// Brian Mendoza
// Worked with tutor.

import java.util.ArrayList;

public class NumArrayList<T extends Number> {

	private ArrayList<T> L;
	public NumArrayList() {
		this.L = new ArrayList<>();
	}

	 //Create a new NumArrayList, initializing it with the parameter
	public NumArrayList(T[] initValues) {
		L = new ArrayList<T>(); //WHY DID THIS WORK (Creates new ArrayList, but how does it use type T?
		//Basically, I kind of get what type T means but maybe you can explain it better
		for (T i: initValues) { //for value i type T in the array initValues
			this.L.add(i); //add that value to the arrayList
		}
	}

	public void add(T elem) {
		this.L.add(elem);
	}

	public T get(int index) {
		return this.L.get(index);
	}

	// Return the String representation of the NumArrayList
	public String toString() {
		String toPrint = "";
		for (T s : this.L) //Iterator variable type T named S, going through L.
			toPrint = toPrint + s.toString() + " ";
		return toPrint;
	}



	// Multiply the NumArrayList by an Integer value
	public NumArrayList<Integer> iMult (Integer val) { //explain this a little? wtf is iMult?
		NumArrayList<Integer> product = new NumArrayList<>(); //the NumArrayList of type integer named product
		for (T i:L) //for an i type T in the existing arrayList L
			product.add(  i.intValue()  *val); //add the integer value of i (the current value in L) (could be a double) and then multiply THAT value by val
		return product; //return the numArrayList named product
	}
}



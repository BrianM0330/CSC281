package hw8;

// Brian Mendoza
// Worked with tutor Brandon Meng to help solidify the concept of a 'type T'

import java.util.ArrayList;

public class NumArrayList<T extends Number> {

	private ArrayList<T> L;
	public NumArrayList() {
		this.L = new ArrayList<>();
	}

	public NumArrayList(T[] initValues) {
		L = new ArrayList<>();
		for (T i: initValues) {
			this.L.add(i);
		}
	}

	public void add(T elem) {
		this.L.add(elem);
	}

	public T get(int index) {
		return this.L.get(index);
	}

	public String toString() {
		String toPrint = "";
		for (T s : this.L)
			toPrint = toPrint + s.toString() + " ";
		return toPrint;
	}

	public NumArrayList<Integer> iMult (Integer val) {
		NumArrayList<Integer> product = new NumArrayList<>();
		for (T i:L)
			product.add(  i.intValue()  *val);
		return product;
	}
}



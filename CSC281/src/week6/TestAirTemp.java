package week6;

// Amber Settle
// CSC 281-601/610

import week6.temp.AirTemp;

public class TestAirTemp {

	public static void main(String[] args) {
		System.out.println("The number of AirTemp objects: " + AirTemp.getNumAir());
		AirTemp t1 = new AirTemp();
		System.out.println("The first object: " + t1);
		System.out.println("The number of AirTemp objects: " + AirTemp.getNumAir());
		AirTemp t2 = new AirTemp(-100, 'c');
		System.out.println("The second object: " + t2);
		System.out.println("The number of AirTemp objects: " + AirTemp.getNumAir());
		AirTemp t3 = new AirTemp(-100, 'c');
		System.out.println("The third object: " + t3);
		System.out.println("The number of AirTemp objects: " + AirTemp.getNumAir());
		AirTemp t4 = new AirTemp(50, 'F');
		System.out.println("The fourth object: " + t4);
		System.out.println("The number of AirTemp objects: " + AirTemp.getNumAir());
		System.out.println("Are the first and second objects the same? " + t1.equals(t2));
		System.out.println("Are the first and fourth objects the same? " + t1.equals(t4));
	}
}

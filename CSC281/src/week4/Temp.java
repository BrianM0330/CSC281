package week4;

//Brian Mendoza 
//I did not collaborate with anybody for this assignment. I worked alone. 

import java.util.Scanner;

public class Temp {
	private double tValue;

	private Character scale;

	private Scanner vScan = new Scanner(System.in);

	public Temp() {
		this.tValue = 32.0;
		scale = 'f';
	}

	public Temp(double initT, Character initS) {
		this.scale = initS; // Declares the scale to be uased as initS
		this.tValue = initT; // Declares the temperature to be used as initT

		if (Character.toLowerCase(initS) == 'c') { // Forces the parameter to be lowercase so I can check since there is
													// no equalIgnoreCase for Characters
			scale = initS;
		}

		else if (Character.toLowerCase(initS) == 'f') {
			scale = initS;
		}

		else {
			scale = 'f';
		}
	}

	public void set() {
		boolean done = false;
		System.out.println("Entering the set method.");

		// I got this from your example and liked it.
		// Is it okay if I use this type of structure in future problems? Or is it
		// inefficient/sub-optimal/a crutch

		while (!done) {
			System.out.println("Please enter the temp scale (c/f): ");
			String charS = vScan.nextLine();

			if (charS.equalsIgnoreCase("C")) {
				this.scale = charS.charAt(0);
				done = true;
			}

			else if (charS.equalsIgnoreCase("F")) {
				this.scale = charS.charAt(0);
				done = true;
			}

			else {
				System.out.println("Celcius and Fahrenheit are the only valid scales.");
			}
		}
		System.out.println("Please enter a temperature: ");
		this.tValue = vScan.nextDouble();
		System.out.println("Leaving the set method.");
	}

	public double getC() {
		if (Character.toLowerCase(scale) == 'c') {
			return tValue;
		}

		else {
			this.tValue = (tValue - 32) / 1.8;
			return tValue;
		}
	}

	public double getF() {
		if (Character.toLowerCase(scale) == 'f') {
			return tValue;
		}

		else {
			this.tValue = (tValue * 1.8) + 32;
			return tValue;
		}
	}
}

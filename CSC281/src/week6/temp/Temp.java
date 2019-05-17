package week6.temp;

//Author: Amber Settle
//CSC 281-601/610

import java.util.Scanner;

public class Temp
{
	// Please do not declare any additional members of the class
	// Feel free to use local variables as necessary in each method
	protected double tValue;
	protected char scale;
	
	private Scanner vScan = new Scanner(System.in);

 	// The default constructor for the class
 	public Temp()
 	{
     	tValue = 32.0;
		scale = 'f';
 	}

 	// The parameterized constructor for the class
	public Temp(double initT, char initS)
	{
		if (initS != 'c' && initS != 'C' && initS != 'f' && initS != 'F')
		  	scale = 'f';
		else scale = initS;
		tValue = initT;
	}

 	// Input values for the instance variables using the Scanner vScan
 	public void set()
 	{
	  	String iText;
	  	boolean done = false;

     	while (!done) {
			System.out.print("Please enter the temp scale (c/f): ");
			iText = vScan.next();
			scale = iText.charAt(0);
			if (scale != 'c' && scale != 'C' && scale != 'f' && scale != 'F')
				System.out.println("Celsius and Fahrenheit are the only valid scales");
			else done = true;
		}
     	
     	System.out.print("Please enter a temperature: ");
		tValue = vScan.nextDouble();
 	}

 	// Return the temperature in Celsius
	public double getC()
	{
		double value;

		if (scale == 'c' || scale == 'C')
			value = tValue;
		else value = (tValue - 32) / 1.8;
		
		return value;
	}

	// Return the temperature in Fahrenheit
	protected double getF()
	{
		double value;

		if (scale == 'f' || scale == 'F')
			value = tValue;
		else value = tValue * 1.8 + 32;
		
		return value;
	}
}


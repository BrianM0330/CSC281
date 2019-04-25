package week4;

//Put your name here
//Put your collaboration statement here

import java.util.Scanner;

public class Temp
{
	// Please do not declare any additional members of the class
	// Feel free to use local variables as necessary in each method
	private double tValue;
	// If you like, you can change the type of scale to Character
	private char scale;
	
	private Scanner vScan = new Scanner(System.in);

 	// The default constructor for the class
 	public Temp()
 	{
     	double tempF = 32.0;
     	double tempC = 0.0;
 	}

 	// The parameterized constructor for the class
	public Temp(double initT, char initS) //This is the one used in lines 12-15 in the driver
	{
		this.scale = initS; //Declares the scale to be uased as initS
		this.tValue = initT; //Declares the temperature to be used as initT
	}

 	// Input values for the instance variables using the Scanner vScan
 	public void set()
 	{
		// You can omit this statement if you wish
		// It's designed to help you figure out what belongs in this method
 		System.out.println("Entering the set method.");
	  	
 		tempType = aScan.
 		
		// You can omit this statement if you wish
		// It's designed to help you figure out what belongs in this method
		System.out.println("Leaving the set method.");
 	}

 	// Return the temperature in Celsius
	public double getC()
	{
		// A stub -- remove when you write this method
		return 0.0;
	}

	// Return the temperature in Fahrenheit
	public double getF()
	{
		// A stub -- remove when you write this method
		return 0.0;
	}
}


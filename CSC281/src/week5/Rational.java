package week5;

public class Rational
{
	// Two private instance variables
	// representing the numerator and denominator of the number
	private int num, denom;

	// Default constructor
	public Rational() {
		num = 1;
		denom = 1;
	}

	public void display() {
		System.out.println(num + " / " + denom);
	}
	
	// Reduces a rational number to lowest terms using
	// the gcd of the numerator and denominator
	private void reduce() {
			
		int a = gcd(Math.abs(num), Math.abs(denom));
		num = num / a;
		denom = denom / a;
	}
	
	// Use Euclid's algorithm to find the gcd of a and b
	private int gcd(int a, int b) {
			
		int temp;
		//System.out.println(a + " , " + b);
		while ( b > 0 )
		{
	       	temp = a;
	       	a = b;
	       	b = temp % a;
	       	//System.out.println(a + " , " + b);
	    }
		return a;
	}
}

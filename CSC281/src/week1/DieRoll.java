package week1;

public class DieRoll {

	public static void main(String[] args) {
		int max = 3;
		int count = 0;
		
		System.out.println("We are rolling a 6-sided die " + max + " times:");
		while (count <= max-1) {
			System.out.println(rollDie());
			count++;
		// Write a loop that calls rollDie max number of times and prints each result
		}
	}
	
	// Roll a 6-sided die once
	public static int rollDie() {
		
		return 1+(int)(6*Math.random());
	}
}

package week6;

public class CheckingAccount extends Account {
	
	// Balance below which a monthly fee is assessed
	private double minBal;

	// The amount of the fee assessed if below the minimum
	// public double monthlyFee;
	private double monthlyFee;

	// The parameterized constructor
	public CheckingAccount(String inName, String number, double amount,
				      double minimum, double fee)
	{
		super(inName, number, amount);
		System.out.println("CheckingAccount constructor called.");
		// Here we are duplicating some work
		// This is bad practice!
		//name = inName;
		//acctNum = number;
		//balance = amount;
		// These statements are necessary
		minBal = minimum;
		monthlyFee = fee;
		}
	
	public String toString() {
		String s = super.toString();
		return s + String.format(",\nmin bal = $%.2f, monthly fee = $%.2f", minBal, monthlyFee);
	}

	// If the account balance is below the minimum balance, subtract
	// the monthly fee.  Make sure that the account balance does not
	// become negative.
	public void checkMonthlyFee()
	{
		if (balance < minBal)
			balance = balance - monthlyFee;
		if (balance < 0)
			balance = 0;
	}

}


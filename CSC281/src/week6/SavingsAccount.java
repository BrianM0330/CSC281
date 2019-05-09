package week6;

public class SavingsAccount extends Account {
	
	// The annual interest rate on the account
	// given as a percentage (i.e. 1.25 is 1.25%)
	private double interestRate;

	public SavingsAccount(String n, String num, double a,
					      double rate)
	{
		super(n, num, a); // call the Account constructor
		System.out.println("SavingsAccount constructor called.");
		// Here we are duplicating work
		// This is bad practice!
		//name = inName;
		//acctNum = number;
		//balance = amount;
		// This is work we must do ourselves
		interestRate = rate;
		}

	// Credit one month's worth of interest to the account balance

	public void addMonthlyInterest()
	{
		balance = balance + balance * (interestRate / (12 * 100.0));
	}
	
}

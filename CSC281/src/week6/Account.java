package week6;

public class Account
{
	protected String name;
	protected String acctNum;
	protected double balance;

	// Default constructor
	public Account()
	{
	 	System.out.println("Account default constructor called.");
	}

	// Other constructor
	public Account(String inName, String number, double amount)
	{
		System.out.println("Account constructor called.");
		name = inName;
		acctNum = number;
		balance = amount;
	}
	
	public boolean equals(Account other) {
		return acctNum.equals(other.acctNum);
	}

	public void deposit(double depositAmount)
	{
		balance = balance + depositAmount;
	}

	public void withdraw(double withdrawAmount)
	{
		balance = balance - withdrawAmount;
	}
	
	public String toString() {
		return String.format("Name: %s, account #: %s, balance = $%.2f", name, acctNum, balance);
	}
	
	public void display()
	{
		System.out.printf("Name: %s, account #: %s, balance = $%.2f\n", name, acctNum, balance);
	}
}


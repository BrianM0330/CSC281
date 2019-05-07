package week5;

public class Item
{
	private String name;
	private double price;
	private int numberInStock;

	private final int INIT_VAL = 0;
	private final int D_VAL = 10;
	
	public Item() {
		this.name = "Harness";
		price = 105;
		this.numberInStock = D_VAL;
	}
	
	// Name as parameter
	public Item(String theName) {
		this.name = theName;
		price = 10;
		numberInStock = 5;
	}
	
	// Price as parameter
	public Item(double theVal) {
		this.price = theVal;
		this.name = "Harness";
		this.numberInStock = D_VAL;
		
	}
	
	// Quantity in stock as parameter
	public Item(int theNum) {
		this.numberInStock = theNum;
		this.name = "Harness";
		this.price = 150;
		
	}

	// The constructor for the class
	public Item(String iName, double iPrice, int iStock)
	{
		this.name = iName;

		if (iPrice >= INIT_VAL)
			price = iPrice;
		else price = INIT_VAL;

		if (iStock >= INIT_VAL)
			numberInStock = iStock;
		else numberInStock = INIT_VAL;
	}

	// Report information about an Item
	public void checkItem()
	{
		System.out.println("Item name: " + name);
		//System.out.println("Item price: $" + price);
		System.out.printf("Item price: $%.2f\n", price);
		System.out.println("Number in stock: " + numberInStock);
		System.out.println();
	}

	// Check how many of an Item are available
	public int numberLeft()
	{
		return numberInStock;
	}
	
	public boolean equals(Item other) {
		// name in calling object: this.name
		// name in parameter object: other.name
		if (this.price == other.price && 
				this.numberInStock == other.numberInStock &&
				this.name.equals(other.name))
			return true;
		else return false;
	}

	// Remove the specified number of Items from the quantity in stock,
	// provided that such an action is possible.
	public void sell(int numberToSell)
	{
		if (numberToSell < INIT_VAL)
			System.out.println("Error: Cannot sell negative Items!");
		else if (numberToSell <= numberInStock)
			{
				numberInStock = numberInStock - numberToSell;
				System.out.println("Just sold " + numberToSell +
						" " + name + "s, now " +
						numberInStock + " remain.");
			}
		else System.out.println("Error: Cannot sell " + numberToSell +
					" items, only " + numberInStock + " in stock!");
		System.out.println();
	}
}


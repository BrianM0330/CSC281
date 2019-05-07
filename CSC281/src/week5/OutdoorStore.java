package week5;

public class OutdoorStore {

	public static void main(String[] args) {

		Item firstOne = new Item("Carabiner", 9, 100);
		firstOne.checkItem();
		
		//firstOne.name = "Bogus";

		firstOne.sell(10);
		firstOne.checkItem();

		Item secondOne = new Item("Rope", 175, 5);
		secondOne.checkItem();

		secondOne.sell(7);
		secondOne.checkItem();
		
		Item thirdOne = new Item();
		thirdOne.checkItem();
		
		Item fourthOne = new Item("Tent");
		fourthOne.checkItem();
		
		Item fifthOne =  new Item(150.0);
		fifthOne.checkItem();
		
		Item sixthOne = new Item(10);
		sixthOne.checkItem();
		
		if (sixthOne.equals(fifthOne)) 
			System.out.println("The fifth and sixth ones are the same.");
		else System.out.println("The fifth and sixth ones are not the same.");
		
		}
		
}

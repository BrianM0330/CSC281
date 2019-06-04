package week9;

import java.util.ArrayList;

public class Invoice {
	
	private ArrayList<Item> items;
	
	private static class Item {
		String description;
		int quantity;
		double unitPrice;
		
		double price() {
			return quantity * unitPrice;
		}
	}
	
	public Invoice() {
		items = new ArrayList<Item>();
	}
	
	public void printBill() {
		
		System.out.println("Your invoice is as follows: ");
		for (int i = 0; i < items.size(); i++) {
			Item current = items.get(i);
			System.out.printf("Item: %s, quantity: %d, total cost: $%.2f\n", 
							current.description, current.quantity, current.price() );
		}
	}
	
	public void addItem(String d, int q, double p) {
		Item newItem = new Item();
		newItem.description = d;
		newItem.quantity = q;
		newItem.unitPrice = p;
		items.add(newItem);
	}
}

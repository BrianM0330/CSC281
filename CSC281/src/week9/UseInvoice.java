package week9;

public class UseInvoice {

	public static void main(String[] args) {
		Invoice theBill = new Invoice();
		theBill.addItem("coat", 10, 59.99);
		theBill.addItem("book", 100, 78.76);
		
		theBill.printBill();
	}
}

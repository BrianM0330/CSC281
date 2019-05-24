package week8;

public class TestEntry {

	public static void main(String[] args) {
		
		Entry<String, Integer> ent1 = new Entry<>("Amber", 50);
		Entry<String, Double> ent2 = new Entry<>("Gertrude", 12.4);
		
		System.out.println("The first entry: " + ent1.getKey() + ", " + ent1.getValue()); 
		System.out.println("The second entry: " + ent2.getKey() + ", " + ent2.getValue()); 
	}
}

package week3;

public class StringBuildEx {

	public static void main(String[] args) {
		int [] iArray = {5, 10, 15, 20, 25, 30, 100};
		String s = "testing, testing";
		
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println("The first StringBuilder object:");
		System.out.println(sb1);
		
		System.out.println();
		
		StringBuilder sb2 = makeSB(iArray);
		System.out.println("The second StringBuilder object: ");
		System.out.println(sb2);
		
		System.out.println();
		
		String s3 = sb2.toString();
		System.out.println("The second StringBuilder as a String: " + s3);
	}
	
	// Turn an array of int values into a StringBuilder object
	public static StringBuilder makeSB(int [] anArray) {
		StringBuilder theSB = new StringBuilder();
		// Build a StringBuilder out of the integer array
		for(int i = 0; i < anArray.length; i++) {
			theSB.append(anArray[i] + " ");
		}
		return theSB;
	}
}

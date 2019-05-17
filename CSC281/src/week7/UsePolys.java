package week7;

import shapes.*;

public class UsePolys {

	public static void main(String[] args) {
		
		Polygon[] pArray = new Polygon[3];
		pArray[0]  = new Polygon(3, 4, 4);
		pArray[1] = new Square(5);
		pArray[2] = new Square(10);
		
		System.out.println("The polygons: ");
		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i] + " has area " + pArray[i].area());
		}

	}

}

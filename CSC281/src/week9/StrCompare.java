package week9;

import java.util.Arrays;
import java.util.Comparator;

public class StrCompare {

	public static void main(String[] args) {
		
		/*Comparator<String> comp = new StrLenComp();
		if (comp.compare("Amber", "Chad") > 0)
			System.out.println("Amber is greater than Chad.");
		else System.out.println("Chad is greater than Amber.");
		*/
		String[] cats = {"Prudence", "Gertrude", "Tardar", "Buster"};
		//Arrays.sort(cats, comp);
		//Arrays.sort(cats, new StrLenComp());
		Arrays.sort(cats, (String first, String second) -> first.length() - second.length());
		System.out.println(Arrays.toString(cats));	
	}
}

package week9;

import java.util.Comparator;

public class StrLenComp implements Comparator<String>{
	
	public int compare(String first, String second) {
		return first.length() - second.length();
	}
}

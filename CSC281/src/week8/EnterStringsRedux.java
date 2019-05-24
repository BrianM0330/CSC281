package week8;

// Both Scanner and ArrayList
import java.util.*;

public class EnterStringsRedux {

	public static void main(String[] args) {
		
		ArrayList<String> userList = getStrings();
		System.out.println("You entered: ");
		for (String s: userList)
			System.out.println(s);
		
		System.out.println("You entered: ");
		ListIterator<String> iter = userList.listIterator(userList.size());
		while (iter.hasPrevious())
			System.out.println(iter.previous());
		//while (iter.hasNext())
		//	System.out.println(iter.next());
		
		//for (int i = 0; i < userList.size(); i++)
		//	System.out.println(userList.get(i));
	}
	
	public static ArrayList<String> getStrings() {
		// Modify this to enter an arbitrary number of Strings from the
		// user and store them into theList
		ArrayList<String> theList = new ArrayList<>();
		// Open a Scanner
		Scanner vScan = new Scanner(System.in);
		// Read a bunch of Strings from the user
		// Stopping condition: quit
		String s = "";
		while (!s.equals("quit")) {
			System.out.print("Enter a string (quit to stop): ");
			s = vScan.nextLine().toLowerCase();
			if (!s.equals("quit"))
				theList.add(s);
		}
		
		vScan.close();
		return theList;
	}
}

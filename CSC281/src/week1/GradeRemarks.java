package week1;

public class GradeRemarks {

	public static void main(String[] args) {
		
		char grade = 'a';
		String reply;

		// How do we change the code to make this work for lower case letters too?
		if (grade == 'A' || grade == 'a')
		         reply = "Excellent job!";
		else if (grade == 'B')
		         reply = "That's good.";
		else if (grade == 'C')
		        reply = "You passed.";
		else if (grade == 'D')
		        reply = "Not passing if required for your major.";
		else if (grade == 'F')
		        reply = "Sorry, you failed.";
		else
        		reply = "Not a valid grade.";

		System.out.println(reply);
	}
}

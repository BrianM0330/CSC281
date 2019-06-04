package week9;
import java.util.Arrays;
import week9.Child;

public class ChildDriver extends Child implements Comparable <Child> {

    final static int MAX = 3;
    public static void main(String[] args) {
        //step A
       Child[] kids = new Child[MAX]; //An array of the type child named childArray is created with the length of MAX

        //step B
       kids[0] = new Child();
       kids[1] = new Child("Joon", 1994, "Jeff Elam");
       kids[2] = new Child("Prudence", 2007, "Andre Berthiaume");

       //step C
       System.out.println("The children: " + Arrays.toString(kids));

       //step D
        Arrays.sort(kids); //already implements comparable with the header. Issue was the MAX amount of entries

        //Step E
        System.out.println("The child Array, after sorting (using compareTo): " + Arrays.toString(kids));

        //step F
        Arrays.sort(kids, (first, second) -> first.getParent().compareTo(second.getParent()));

        //step G
        System.out.println("The child array, after sorting (using the lambda): " + Arrays.toString(kids));
//            if (first.getParent().compareTo(second.getParent()) > 0)
//                return 1;
//            else if (first.getParent().compareTo(second.getParent()) < 0)
//                return -1;
//            else return 0;

    }

}

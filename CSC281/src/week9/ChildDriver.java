//Brian Mendoza. I worked alone. It is 4AM I am losing my marbles.

package week9;

import java.util.Arrays;

public class ChildDriver extends Child implements Comparable<Child> {

    final static int MAX = 3;

    public static void main(String[] args) {
        Child[] kids = new Child[MAX];
        kids[0] = new Child();
        kids[1] = new Child("Joon", 1994, "Jeff Elam");
        kids[2] = new Child("Prudence", 2007, "Andre Berthiaume");

        System.out.println("The children: " + Arrays.toString(kids));

        Arrays.sort(kids);

        System.out.println("The child Array, after sorting (using compareTo): " + Arrays.toString(kids));

        Arrays.sort(kids, (first, second) -> first.getParent().compareTo(second.getParent()));

        System.out.println("The child array, after sorting (using the lambda): " + Arrays.toString(kids));
    }
}

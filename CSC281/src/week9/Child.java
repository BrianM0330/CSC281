package week9;

import java.time.LocalDate;

// Brian Mendoza. WOrked alone. I might be going crazy.

public class Child extends Person implements Comparable<Child> {

    private String parent;

    private final int AGE_MAJ = 18;
    private final int D_AGE = 15;

    public Child() {
        name = "Erin";
        bYear = LocalDate.now().getYear() - D_AGE;
        parent = "Amber Settle";
    }

    public Child(String n, int y, String p) {
        int year = LocalDate.now().getYear();
        if (y > year - AGE_MAJ)
            bYear = y;
        else bYear = year - D_AGE;
        name = n;
        parent = p;
    }

    public String getParent() {
        return this.parent;
    }

    public int compareTo(Child other) {
        return age() - other.age();
    }

    public String toString() {
        return super.toString() + ", parent: " + parent;
    }
}

// Exo2b.java
package m1.finalee.tache2;

import java.util.ArrayList;

public class Exo2b {
    public static void main(String[] args) {
        try {
            ArrayList<Orange> list = new ArrayList<Orange>();
            Orange a = new Orange("France", 80);
            Orange b = new Orange("Espagne", 90);
            Orange c = new Orange("Espagne", 90);

            list.add(a);
            list.add(b);

            System.out.println(list.indexOf(a));
            System.out.println(list.indexOf(b));
            System.out.println(list.indexOf(c));
            System.out.println(b.equals(c));
        } catch (Orange.InvalidSeedsLevelException e) {
            System.err.println(e.getMessage());
        }
    }
}

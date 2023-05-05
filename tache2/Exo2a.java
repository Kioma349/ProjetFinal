// Exo2a.java
package m1.finalee.tache2;

public class Exo2a {
    public static void main(String[] args) {

        try {
            Orange a = new Orange("France", 80);
            Orange b = new Orange("Espagne", 90);
            Orange c = new Orange("Espagne", 40);
            Orange d = a;

            System.out.println(a == b);
            System.out.println(b == c);
            System.out.println(a == d);
            System.out.println(a.equals(b));
            System.out.println(b.equals(c));
            System.out.println(a.equals(d));


        }

        catch (Orange.InvalidSeedsLevelException e) {
            System.err.println(e.getMessage());
        }
    }
}

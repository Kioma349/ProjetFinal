package m1.finalee.tache2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Orange.InvalidSeedsLevelException {
        // Test de la classe Orange
        Orange a = new Orange("France", 80);
        Orange b = new Orange("Espagne", 90);
        Orange c = new Orange("Espagne", 90);
        Orange d = a;

        System.out.println("Test des références d'objets : ");
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == d);

        System.out.println("Test de la méthode equals : ");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(d));

        System.out.println("Test de la méthode toString : ");
        System.out.println(a.toString());
        System.out.println(b.toString());

        // Test de la classe Basket
        Basket panier1 = new Basket();
        Basket panier2 = new Basket();

        System.out.println("Test des IDs des paniers : ");
        System.out.println(panier1);
        System.out.println(panier2);

        panier1.ajouter(a);
        panier1.ajouter(b);
        panier2.ajouter(c);

        System.out.println("Test de la méthode toString de Basket : ");
        System.out.println(panier1);
        System.out.println(panier2);

        System.out.println("Test de la méthode valeurPanier : ");
        System.out.println("Valeur du panier 1 : " + panier1.valeurPanier() + " €");
        System.out.println("Valeur du panier 2 : " + panier2.valeurPanier() + " €");

        // Test de la méthode equals avec la classe ArrayList
        ArrayList<Orange> list = new ArrayList<Orange>();
        list.add(a);
        list.add(b);

        System.out.println("Test de la méthode equals avec ArrayList : ");
        System.out.println(list.indexOf(a));
        System.out.println(list.indexOf(b));
        System.out.println(list.indexOf(c));
        System.out.println(b.equals(c));

        // Test de la création d'une orange avec un niveau de pépins trop élevé
        Orange e;
        e = new Orange("France", 80, 10);

    }
}

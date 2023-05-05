package m1.finalee.tache1;

public class Main {
    public static void main(String[] args) {
        LinkedList liste = new LinkedList();

        // Test d'ajout en début et en fin de liste
        liste.addFirst(1);
        liste.addLast(2);
        liste.addFirst(3);
        liste.addLast(4);
        System.out.println("Liste chaînée après ajout d'éléments: " + liste);

        // Test de suppression en début et en fin de liste
        try {
            liste.deleteFirst();
            liste.deleteLast();
            System.out.println("Liste chaînée après suppression d'éléments: " );
        } catch (Exception e) {
            System.out.println("Exception attrapée: " + e.getMessage());
        }

        // Test de présence d'un élément et de son index dans la liste
        System.out.println("La liste contient 1 ? " + liste.contains(1));
        System.out.println("Index de 2 dans la liste: " + liste.indexOf(2));
    }
}

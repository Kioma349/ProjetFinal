package m1.finalee.tache1;

public class LinkedList {
    Node first;
    Node last;

    // Ajouter un élément au début de la LinkedList
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    // Ajouter un élément à la fin de la LinkedList
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    // Supprimer le premier élément de la LinkedList
    public void deleteFirst() throws Exception {
        if (first == null) {
            throw new Exception("La LinkedList est vide.");
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.next;
        }
    }

    // Supprimer le dernier élément de la LinkedList
    public void deleteLast() throws Exception {
        if (last == null) {
            throw new Exception("La LinkedList est vide.");
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            Node current = first;
            while (current.next != last) {
                current = current.next;
            }
            last = current;
            last.next = null;
        }
    }

    // Vérifier si un élément existe dans la LinkedList
    public boolean contains(int value) {
        Node current = first;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Trouver l'index d'un élément dans la LinkedList
    public int indexOf(int value) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // Afficher le contenu de la LinkedList
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = first;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}

package m1.finalee.tache2;

// Basket.java

import java.util.ArrayList;

public class Basket {
    private static int count = 0;
    private int id;
    private ArrayList<Fruit> fruits;

    public Basket() {
        id = ++count;
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void boycottOrigin(String country) {
        fruits.removeIf(fruit -> fruit.getOrigin().equals(country));
    }

    public double getTotalValue() {
        double total = 0;
        for (Fruit fruit : fruits) {
            total += fruit.getPrice() / 100.0;
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basket id - ").append(id).append(" - [\n");
        for (Fruit fruit : fruits) {
            sb.append(fruit).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public String valeurPanier() {
        return null;
    }

    public void ajouter(Orange a) {
    }
}

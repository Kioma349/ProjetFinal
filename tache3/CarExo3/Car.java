package m1.finalee.tache3.CarExo3;


// Classe représentant une voiture
public class Car {
    private final String marque;
    private final NumberPlate plaque;

    // Constructeur
    public Car(String marque, NumberPlate plaque) {
        this.marque = marque;
        this.plaque = plaque;
    }

    // Méthode pour représenter la voiture sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "Car{" +
                "marque='" + marque + '\'' +
                ", plaque=" + plaque +
                '}';
    }
}

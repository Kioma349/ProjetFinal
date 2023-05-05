package m1.finalee.tache3.CarExo3;

// Classe représentant une plaque d'immatriculation européenne
public class EuropeanNumberPlate extends NumberPlate {
    // Constructeur
    public EuropeanNumberPlate(String plaque) {
        super(plaque);
    }

    // Méthode pour créer une plaque d'immatriculation selon le format
    public static EuropeanNumberPlate creerPlaque(boolean nouveauFormat) {
        if (nouveauFormat) {
            return new EuropeanNumberPlate("AA 111 AA");
        } else {
            return new EuropeanNumberPlate("AAA 111");
        }
    }
}
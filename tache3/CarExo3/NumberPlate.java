package m1.finalee.tache3.CarExo3;

// Classe représentant une plaque d'immatriculation
public class NumberPlate {
    private final String plaque;

    // Constructeur
    public NumberPlate(String plaque) {
        this.plaque = plaque;
    }

    // je récupére la plaque
    public String getPlaque() {
        return plaque;
    }

    // Méthode pour calculer le coût de fabrication d'une plaque
    public int coutFabrication(int coutParCaractere) {
        return plaque.length() * coutParCaractere;
    }

    // Méthode pour représenter la plaque sous forme de chaîne de caractères
    @Override
    public String toString() {
        return plaque;
    }
}

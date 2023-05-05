package m1.finalee.tache2;


public class Orange {
    private long valeur; // Valeur en centimes d'euros
    private String origine; // Pays d'origine de l'orange
    private int seedsLevel; // Niveau de pépins

    public Orange(String france, int i, int seedsLevel) {
    }
    // InvalidSeedsLevelException.java

    public class InvalidSeedsLevelException extends Exception {
        public InvalidSeedsLevelException(String message) {
            super(message);
        }
    }
    public Orange(long valeur, String origine) throws InvalidSeedsLevelException {
        this(valeur, origine, 0); // Niveau de pépins par défaut à 0
    }

    public Orange(long valeur, String origine, int seedsLevel) throws InvalidSeedsLevelException {
        if (seedsLevel * 5 * 2 > valeur) {
            throw new InvalidSeedsLevelException("Le niveau de pépins est trop élevé et diminue de plus de moitié la valeur de l'orange.");
        }
        this.valeur = valeur;
        this.origine = origine;
        this.seedsLevel = seedsLevel;
    }

    public Orange(String origine, long valeur) throws InvalidSeedsLevelException {
        this(valeur, origine, 0); // Niveau de pépins par défaut à 0
    }

    public long getValue() {
        long adjustedValue = valeur - (5 * seedsLevel); // Réduit la valeur en fonction du niveau de pépins
        return adjustedValue < 0 ? 0 : adjustedValue;
    }

    public String getOrigin() {
        return origine;
    }

    @Override
    public String toString() {
        return "Orange : " + origine + " : " + (valeur / 100.0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Orange)) {
            return false;
        }
        Orange o = (Orange) obj;
        return this.valeur == o.valeur && this.origine.equals(o.origine) && this.seedsLevel == o.seedsLevel;
    }
}


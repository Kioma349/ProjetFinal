package m1.finalee.tache3.CarExo3;

public class Main {
    public static void main(String[] args) {
        // Je Crée une plaque d'immatriculation avec l'ancien format
        NumberPlate oldNumberPlate = new NumberPlate("AAA 111");
        // Je Crée une plaque d'immatriculation avec le nouveau format européen
        EuropeanNumberPlate newNumberPlate = new EuropeanNumberPlate("AA 111 AA");

        // je Crée une voiture avec une plaque d'immatriculation ancienne
        Car oldCar = new Car("Peugeot", oldNumberPlate);
        // Je Crée une voiture avec une plaque d'immatriculation européenne
        Car newCar = new Car("Renault", newNumberPlate);

        // j'Affiche les informations sur l'ancienne voiture
        System.out.println("Vieille voiture: " + oldCar);
        // j'Affiche les informations sur la nouvelle voiture
        System.out.println("Nouvelle voiture: " + newCar);

        // Définit le coût par caractère pour la fabrication de plaques d'immatriculation
        int costPerCharacter = 2;

        // Je Affiche le coût de fabrication de l'ancienne plaque d'immatriculation
        System.out.println("Coût de fabrication de l'ancienne plaque d'immatriculation: " + oldNumberPlate.coutFabrication(costPerCharacter));
        // Je Affiche le coût de fabrication de la nouvelle plaque d'immatriculation
        System.out.println("Coût de fabrication d'une nouvelle plaque d'immatriculation: " + newNumberPlate.coutFabrication(costPerCharacter));

        // Je Génère une plaque d'immatriculation avec l'ancien format
        EuropeanNumberPlate generatedOldNumberPlate = EuropeanNumberPlate.creerPlaque(false);
        // Je Génère une plaque d'immatriculation avec le nouveau format européen
        EuropeanNumberPlate generatedNewNumberPlate = EuropeanNumberPlate.creerPlaque(true);

        // j'Affiche la plaque générée avec l'ancien format
        System.out.println("Ancienne plaque d'immatriculation générée: " + generatedOldNumberPlate);
        // j'Affiche la plaque générée avec le nouveau format
        System.out.println("Nouvelle plaque d'immatriculation générée: " + generatedNewNumberPlate);
    }
}

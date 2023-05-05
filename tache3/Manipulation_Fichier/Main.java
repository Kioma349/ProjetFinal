package m1.finalee.tache3.Manipulation_Fichier;

import java.io.File;

import static m1.finalee.tache3.Manipulation_Fichier.ManipulationFichier.*;

public class Main {
    public static void main(String[] args) {
        // Crée un objet File représentant un répertoire
        File repertoire = new File("C:\\Users\\pc\\Pictures");
        // Définit un préfixe pour filtrer les fichiers
        String prefix = "W";

        // Affiche les fichiers du répertoire ayant le préfixe spécifié
        System.out.println("printFiles:");
        printFiles(repertoire, prefix);

        // Calcule et affiche la taille totale des fichiers du répertoire
        System.out.println("\ntotalSizeOfFiles: " + totalSizeOfFiles(repertoire));

        // Trouve et affiche le fichier le plus récent du répertoire
        System.out.println("\nmostRecentFile: " + mostRecentFile(repertoire));
    }
}

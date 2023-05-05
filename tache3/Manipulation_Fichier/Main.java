package m1.finalee.tache3.Manipulation_Fichier;


import java.io.File;

import static m1.finalee.tache3.Manipulation_Fichier.ManipulationFichier.*;

public class Main {
    public static void main(String[] args) {
        File repertoire = new File("C:\\Users\\pc\\Pictures");
        String prefix = "W";

        System.out.println("printFiles:");
        printFiles(repertoire, prefix);
        System.out.println("\ntotalSizeOfFiles: " + totalSizeOfFiles(repertoire));
        System.out.println("\nmostRecentFile: " + mostRecentFile(repertoire));
    }
}

package m1.finalee.tache3.Manipulation_Fichier;
import java.io.File;
import java.io.FilenameFilter;

public class ManipulationFichier {
    // Interface pour définir une action à effectuer sur un fichier
    interface FileAction {
        void perform(File file);
    }

    // Méthode pour afficher les noms de fichiers d'un répertoire ayant un préfixe spécifique
    public static void printFiles(File repertoire, String prefix) {
        applyActionOnFiles(repertoire, prefix, new FileAction() {
            @Override
            public void perform(File file) {
                System.out.println(file.getName());
            }
        });
    }

    // Méthode pour calculer la taille totale des fichiers d'un répertoire
    public static long totalSizeOfFiles(File repertoire) {
        // Classe interne pour calculer la taille totale des fichiers
        class TailleCalculateur implements FileAction {
            long tailleTotale = 0;

            @Override
            public void perform(File file) {
                if (file.isFile()) {
                    tailleTotale += file.length();
                }
            }
        }

        TailleCalculateur calculateur = new TailleCalculateur();
        applyActionOnFiles(repertoire, null, calculateur);
        return calculateur.tailleTotale;
    }

    // Méthode pour trouver le fichier le plus récent d'un répertoire
    public static File mostRecentFile(File repertoire) {
        // Classe interne pour trouver le fichier le plus récent
        class PlusRecentFichierFinder implements FileAction {
            File fichierLePlusRecent = null;
            long derniereModif = Long.MIN_VALUE;

            @Override
            public void perform(File file) {
                if (file.lastModified() > derniereModif) {
                    fichierLePlusRecent = file;
                    derniereModif = file.lastModified();
                }
            }
        }

        PlusRecentFichierFinder finder = new PlusRecentFichierFinder();
        applyActionOnFiles(repertoire, null, finder);
        return finder.fichierLePlusRecent;
    }

    // Méthode privée pour appliquer une action sur les fichiers d'un répertoire avec un préfixe spécifique
    private static void applyActionOnFiles(File repertoire, String prefix, FileAction action) {
        FilenameFilter startsWithFilter = null;
        if (prefix != null) {
            startsWithFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith(prefix);
                }
            };
        }

        // Liste les fichiers avec le filtre si un préfixe est spécifié, sinon liste tous les fichiers
        File[] fichiers = (startsWithFilter != null) ? repertoire.listFiles(startsWithFilter) : repertoire.listFiles();
        if (fichiers != null) {
            for (File fichier : fichiers) {
                action.perform(fichier);
            }
        }
    }
}

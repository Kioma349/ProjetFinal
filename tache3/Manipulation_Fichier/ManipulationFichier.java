package m1.finalee.tache3.Manipulation_Fichier;
import java.io.File;
import java.io.FilenameFilter;

public class ManipulationFichier {
    interface FileAction {
        void perform(File file);
    }

    public static void printFiles(File repertoire, String prefix) {
        applyActionOnFiles(repertoire, prefix, new FileAction() {
            @Override
            public void perform(File file) {
                System.out.println(file.getName());
            }
        });
    }

    public static long totalSizeOfFiles(File repertoire) {
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

    public static File mostRecentFile(File repertoire) {
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

        File[] fichiers = (startsWithFilter != null) ? repertoire.listFiles(startsWithFilter) : repertoire.listFiles();
        if (fichiers != null) {
            for (File fichier : fichiers) {
                action.perform(fichier);
            }
        }
    }

    public static void main(String[] args) {
        File repertoire = new File("C:\\Users\\pc\\Pictures");
        String prefix = "W";

        System.out.println("printFiles:");
        printFiles(repertoire, prefix);
        System.out.println("\ntotalSizeOfFiles: " + totalSizeOfFiles(repertoire));
        System.out.println("\nmostRecentFile: " + mostRecentFile(repertoire));
    }
}

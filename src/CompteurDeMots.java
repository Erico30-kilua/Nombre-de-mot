import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurDeMots {
    public static void main(String[] args) {
        // Vérifiez que le nom du fichier a été fourni
        if (args.length != 1) {
            System.out.println("Veuillez fournir le nom du fichier en argument.");
            return;
        }

        String nomFichier = args[0];
        int totalMots = 0;

        try {
            // Créez un objet File pour le fichier
            File fichier = new File(nomFichier);
            // Créez un Scanner pour lire le fichier
            Scanner scanner = new Scanner(fichier);

            // Lisez chaque ligne du fichier
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                // Séparez la ligne en utilisant l'espace comme délimiteur
                String[] mots = ligne.split(" ");
                // Comptez le nombre de mots dans la ligne
                totalMots += mots.length;
            }

            // Fermez le scanner
            scanner.close();

            // Affichez le nombre total de mots
            System.out.println("Nombre total de mots : " + totalMots);
         } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : " + nomFichier);
        }
    }
}

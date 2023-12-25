import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nombres = new int[10];

        // Demander à l'utilisateur d'introduire 10 nombres entiers
        System.out.println("Veuillez introduire 10 nombres entiers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextInt();
        }

        // Vérifier si le tableau est croissant, décroissant, constant ou quelconque
        boolean estCroissant = true;
        boolean estDecroissant = true;
        boolean estConstant = true;

        for (int i = 0; i < nombres.length - 1; i++) {
            if (nombres[i] < nombres[i + 1]) {
                estDecroissant = false;
                estConstant = false;
            } else if (nombres[i] > nombres[i + 1]) {
                estCroissant = false;
                estConstant = false;
            } else { // nombres[i] == nombres[i + 1]
                estCroissant = false;
                estDecroissant = false;
            }
        }

        // Afficher le résultat
        if (estConstant) {
            System.out.println("Le tableau est constant.");
        } else if (estCroissant) {
            System.out.println("Le tableau est croissant.");
        } else if (estDecroissant) {
            System.out.println("Le tableau est décroissant.");
        } else {
            System.out.println("Le tableau est quelconque.");
        }

        scanner.close();
    }
}

/*Ce programme fait ce qui suit :

Il demande à l'utilisateur de saisir 10 nombres entiers, qui sont stockés dans un tableau.
Il vérifie ensuite si le tableau est croissant, décroissant, constant ou quelconque. Pour ce faire, il utilise trois indicateurs (estCroissant, estDecroissant, estConstant) qui sont mis à jour en fonction des relations entre les éléments consécutifs du tableau.
Enfin, le programme affiche le résultat correspondant à l'état du tableau.
Pour exécuter ce programme, vous aurez besoin d'un environnement de développement Java, comme mentionné précédemment. */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int taille = saisie.nextInt();

        int[] tableau = new int[taille];

        remplirTableau(tableau, saisie);

        System.out.print("Entrez l'élément à rechercher : ");
        int elementRecherche = saisie.nextInt();

        int occurrences = compterOccurrences(tableau, elementRecherche);

        System.out.println("Le nombre d'occurrences de " + elementRecherche + " dans le tableau est : " + occurrences);
    }
    private static void remplirTableau(int[] tableau, Scanner scanner) {
        System.out.println("Remplissez le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Tableau[" + i + "] : ");
            tableau[i] = scanner.nextInt();
        }
    }
    private static int compterOccurrences(int[] tableau, int element) {
        int occurrences = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == element) {
                occurrences++;
            }
        }

        return occurrences;
    }
}
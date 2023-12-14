import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int taille = saisie.nextInt();

        int[] tableau = new int[taille];

        remplirTableau(tableau, saisie);

        int plusGrandeValeur = trouverPlusGrandeValeur(tableau);

        afficherTableau(tableau);
        System.out.println("La plus grande valeur dans le tableau est : " + plusGrandeValeur);
    }
    private static void remplirTableau(int[] tableau, Scanner scanner) {
        System.out.println("Remplissez le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Tableau[" + i + "] : ");
            tableau[i] = scanner.nextInt();
        }
    }
    private static int trouverPlusGrandeValeur(int[] tableau) {
        int plusGrandeValeur = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > plusGrandeValeur) {
                plusGrandeValeur = tableau[i];
            }
        }
        return plusGrandeValeur;
    }
    private static void afficherTableau(int[] tableau) {
        System.out.print("Tableau : [");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
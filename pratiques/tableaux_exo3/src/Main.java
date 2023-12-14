import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int taille = saisie.nextInt();

        int[] tableau = new int[taille];

        remplirTableau(tableau, saisie);

        trierTableauCroissant(tableau);

        afficherTableau(tableau);
    }
    private static void remplirTableau(int[] tableau, Scanner scanner) {
        System.out.println("Remplissez le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Tableau[" + i + "] : ");
            tableau[i] = scanner.nextInt();
        }
    }
    private static void trierTableauCroissant(int[] tableau) {
        int n = tableau.length;
        boolean echange;

        do {
            echange = false;
            for (int i = 0; i < n - 1; i++) {
                if (tableau[i] > tableau[i + 1]) {
                    int temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    echange = true;
                }
            }
            n--;
        } while (echange);
    }
    private static void afficherTableau(int[] tableau) {
        System.out.print("Tableau trié par ordre croissant : [");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
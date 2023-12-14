import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.print("Entrez la taille des tableaux : ");
        int taille = saisie.nextInt();

        int[] tableau1 = new int[taille];
        int[] tableau2 = new int[taille];
        int[] tableauResultat = new int[taille];

        remplirTableau(tableau1, "Premier tableau", saisie);
        remplirTableau(tableau2, "Deuxième tableau", saisie);

        additionnerTableaux(tableau1, tableau2, tableauResultat);

        afficherTableau(tableau1, "Premier tableau");
        afficherTableau(tableau2, "Deuxième tableau");
        afficherTableau(tableauResultat, "Résultat de l'addition");
    }
    private static void remplirTableau(int[] tableau, String nomTableau, Scanner scanner) {
        System.out.println("Remplissez le " + nomTableau + " :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(nomTableau + "[" + i + "] : ");
            tableau[i] = scanner.nextInt();
        }
    }
    private static void additionnerTableaux(int[] tableau1, int[] tableau2, int[] tableauResultat) {
        for (int i = 0; i < tableau1.length; i++) {
            tableauResultat[i] = tableau1[i] + tableau2[i];
        }
    }
    private static void afficherTableau(int[] tableau, String nomTableau) {
        System.out.print(nomTableau + " : [");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
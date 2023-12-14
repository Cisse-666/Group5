import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.print("Entrez la taille du premier tableau : ");
        int taille1 = saisie.nextInt();

        System.out.print("Entrez la taille du deuxième tableau : ");
        int taille2 = saisie.nextInt();

        int[] tableau1 = new int[taille1];
        int[] tableau2 = new int[taille2];

        System.out.println("Remplissez le premier tableau trié :");
        remplirTableau(tableau1, saisie);

        System.out.println("Remplissez le deuxième tableau trié :");
        remplirTableau(tableau2, saisie);

        int[] tableauFusionne = fusionnerTableauxTriés(tableau1, tableau2);

        afficherTableau(tableauFusionne, "Tableau fusionné trié");
    }
    private static void remplirTableau(int[] tableau, Scanner scanner) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Tableau[" + i + "] : ");
            tableau[i] = scanner.nextInt();
        }
    }
    private static int[] fusionnerTableauxTriés(int[] tableau1, int[] tableau2) {
        int taille1 = tableau1.length;
        int taille2 = tableau2.length;
        int tailleFusionne = taille1 + taille2;
        int[] tableauFusionne = new int[tailleFusionne];

        int i = 0, j = 0, k = 0;

        while (i < taille1 && j < taille2) {
            if (tableau1[i] <= tableau2[j]) {
                tableauFusionne[k] = tableau1[i];
                i++;
            } else {
                tableauFusionne[k] = tableau2[j];
                j++;
            }
            k++;
        }
        while (i < taille1) {
            tableauFusionne[k] = tableau1[i];
            i++;
            k++;
        }
        while (j < taille2) {
            tableauFusionne[k] = tableau2[j];
            j++;
            k++;
        }
        return tableauFusionne;
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
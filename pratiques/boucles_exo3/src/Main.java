import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.println("Entrez un nombre pour afficher sa table de multiplication : ");
        int nombre = saisie.nextInt();

        afficherTableMultiplication(nombre);

    }
    private static void afficherTableMultiplication(int nombre) {
        System.out.println("Table de multiplication pour " + nombre + " :");

        for (int i = 1; i <= 10; i++) {
            int resultat = nombre * i;
            System.out.println(nombre + " x " + i + " = " + resultat);
        }
    }
}
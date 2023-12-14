import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.println("Entrez un nombre pour calculer sa factorielle : ");
        int nombre = saisie.nextInt();

        long factorielle = calculerFactorielle(nombre);

        System.out.println("La factorielle de " + nombre + " est : " + factorielle);

    }
    private static long calculerFactorielle(int n) {
        long resultat = 1;
        int i = 1;

        do {
            resultat *= i;
            i++;
        } while (i <= n);

        return resultat;
    }
}
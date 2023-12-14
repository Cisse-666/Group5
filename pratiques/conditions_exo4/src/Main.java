import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.println("Entrez le poids du colis en kilogrammes : ");
        double poidsColis = saisie.nextDouble();

        double fraisExpedition = calculerFraisExpedition(poidsColis);

        System.out.println("Les frais d'expédition pour un colis de poids " + poidsColis + " kg sont : $" + fraisExpedition);

    }
    private static double calculerFraisExpedition(double poids) {
        double frais = 0;

        if (poids <= 1) {
            frais = 5.0;
        } else if (poids <= 5) {
            frais = 8.0;
        } else if (poids <= 10) {
            frais = 12.0;
        } else {
            frais = 15.0;
        }

        return frais;
    }
}
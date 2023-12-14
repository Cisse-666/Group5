import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.println("Choisissez le type de conversion :");
        System.out.println("1. Celsius vers Fahrenheit");
        System.out.println("2. Fahrenheit vers Celsius");

        int choix = saisie.nextInt();

        if (choix == 1) {
            System.out.print("Entrez la température en degrés Celsius : ");
            double celsius = saisie.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " degrés Celsius est égal à " + fahrenheit + " degrés Fahrenheit.");
        } else if (choix == 2) {
            System.out.print("Entrez la température en degrés Fahrenheit : ");
            double fahrenheit = saisie.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + " degrés Fahrenheit est égal à " + celsius + " degrés Celsius.");
        } else {
            System.out.println("Choix non valide. Veuillez choisir 1 ou 2.");
        }


    }
}
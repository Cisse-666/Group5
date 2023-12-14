import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre pour l'elevé au carré : ");
        double nombre = scanner.nextDouble();
        double carre = nombre * nombre;
        System.out.println("Le carré de " + nombre + " est : " + carre);

    }
}
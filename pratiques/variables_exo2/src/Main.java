import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Donnez la longeur du rectangle");
        Scanner saisie1 = new Scanner(System.in);
        double longueur = saisie1.nextDouble();
        System.out.println("Donnez la longeur du rectangle");
        Scanner saisie2 = new Scanner(System.in);
        double largeur = saisie2.nextDouble();

        double surface = longueur * largeur;

        System.out.println("Longueur du rectangle : " + longueur);
        System.out.println("Largeur du rectangle : " + largeur);
        System.out.println("Surface du rectangle : " + surface);
    }
}
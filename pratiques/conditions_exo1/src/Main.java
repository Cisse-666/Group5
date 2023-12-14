import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.println("Entrez un nombre : ");
        int nombre = saisie.nextInt();

        if (nombre % 2 == 0) {
            System.out.println(nombre + " est un nombre pair.");
        } else {
            System.out.println(nombre + " est un nombre impair.");
        }

    }

}
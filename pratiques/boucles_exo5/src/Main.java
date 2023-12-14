import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        int nombreSecret = (int) (Math.random() * 100) + 1;

        System.out.println("Bienvenue dans le jeu de devine le nombre !");
        System.out.println("Devinez un nombre entre 1 et 100.");

        int tentative = 0;
        int proposition;

        do {
            System.out.print("Entrez votre proposition : ");
            proposition = saisie.nextInt();
            tentative++;

            if (proposition < nombreSecret) {
                System.out.println("Le nombre est plus grand. Essayez à nouveau !");
            } else if (proposition > nombreSecret) {
                System.out.println("Le nombre est plus petit. Essayez à nouveau !");
            } else {
                System.out.println("Félicitations ! Vous avez trouvé le nombre en " + tentative + " tentatives.");
            }

        } while (proposition != nombreSecret);

    }
}
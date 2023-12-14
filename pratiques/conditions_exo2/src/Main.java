import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.println("Veuillez entrer votre âge : ");
        int age = saisie.nextInt();

        if (age > 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }

    }
}
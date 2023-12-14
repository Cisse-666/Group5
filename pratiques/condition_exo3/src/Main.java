import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        System.out.println("Entrez le premier nombre : ");
        double nombre1 = saisie.nextDouble();

        System.out.println("Entrez le deuxième nombre : ");
        double nombre2 = saisie.nextDouble();

        System.out.println("Entrez le troisième nombre : ");
        double nombre3 = saisie.nextDouble();
        double plusGrand;
        if (nombre1 >= nombre2 && nombre1 >= nombre3) {
            plusGrand = nombre1;
        } else if (nombre2 >= nombre1 && nombre2 >= nombre3) {
            plusGrand = nombre2;
        } else {
            plusGrand = nombre3;
        }

        System.out.println("Le plus grand nombre parmi les trois est : " + plusGrand);

    }


}
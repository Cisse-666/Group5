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

        double moyenne = calculerMoyenne(nombre1, nombre2, nombre3);

        System.out.println("La moyenne des trois nombres est saisis : " + moyenne);


    }
    private static double calculerMoyenne(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
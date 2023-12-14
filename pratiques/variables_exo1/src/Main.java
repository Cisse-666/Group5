public class Main {
    public static void main(String[] args) {
        int nb1 = 10;
        int nb2 = 20;

        System.out.println("Avant l'échange des valeurs :");
        System.out.println("nombre 1 = " + nb1);
        System.out.println("nombre 2 = " + nb2);

        nb1 = nb1 ^ nb2;
        nb2 = nb1 ^ nb2;
        nb1 = nb1 ^ nb2;

        System.out.println("\nAprès l'échange des valeurs :");
        System.out.println("nombre 1 = " + nb1);
        System.out.println("nombre 2 = " + nb2);
    }
}
public class Main {

    public static void main(String[] args) {
        int somme = 0;
        int nombre = 1;

        while (nombre <= 100) {
            somme += nombre;
            nombre++;
        }

        System.out.println("La somme des nombres de 1 à 100 est : " + somme);
    }
}
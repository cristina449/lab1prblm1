import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect Scanner pentru a citi date de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Citirea valorii lungimii
        System.out.print("Introduceți lungimea dreptunghiului: ");
        double lungime = scanner.nextDouble();

        // Citirea valorii lățimii
        System.out.print("Introduceți lățimea dreptunghiului: ");
        double latime = scanner.nextDouble();

        // Crearea unui obiect Dreptunghi
        Dreptunghi dreptunghi = new Dreptunghi(lungime, latime);

        // Calculul perimetrului și ariei folosind metodele din clasa Dreptunghi
        double perimetru = dreptunghi.calculeazaPerimetru();
        double arie = dreptunghi.calculeazaArie();

        // Afișarea rezultatelor
        System.out.println("Perimetrul dreptunghiului este: " + perimetru);
        System.out.println("Aria dreptunghiului este: " + arie);

        // Închide obiectul Scanner
        scanner.close();
    }
}

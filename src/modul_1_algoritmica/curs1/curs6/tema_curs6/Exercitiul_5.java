package modul_1_algoritmica.curs1.curs6.tema_curs6;

import java.util.Scanner;

public class Exercitiul_5 {
    public static void main(String[] args) {

        // Scrie un program citeste o ora de la consola
        // si sa determine daca in magaazin este deschis sau nu.

        // magazinul functioneaza intre ora 9:00 si 22:00

        // daca se introduce o ora in afara intervalului 00:00-24:00 sa se afiseze un mesaj de eroare.

        System.out.print("Introduceti ora aici: ");
        Scanner sc = new Scanner(System.in);
        int ora = sc.nextInt();
        if (ora >= 9 && ora < 22) {
            System.out.println("Magazinul este deschis.");
        } else if (ora >= 0 && ora < 9 || ora >= 22 && ora <= 24) {
            System.out.println("Magazinul este inchis !");
        } else {
            System.out.println(" Mesaj de eroare : Ati introdus o ora invalida !");
        }

    }
}

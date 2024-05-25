package modul_1_algoritmica.curs1.tema_7;

import java.util.Scanner;

public class Exercitiul_2 {
    public static void main(String[] args) {

        int numar_ascuns = 999;
        System.out.print("Introduceti namarul dumneavoastra aici: ");
        Scanner sc = new Scanner(System.in);

        int numarGhicit = sc.nextInt();
        if (numarGhicit == numar_ascuns) {
            System.out.println("Felicitari! Ai ghicit numarul ! ");
        } else if (numarGhicit < numar_ascuns) {
            System.out.println("Mai mult !");
        } else if (numarGhicit > numar_ascuns) {
            System.out.println("Mai putin !");
        } else {
            System.out.println("Acesta nu este un numar !");
        }

    }
}

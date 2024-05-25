package modul_1_algoritmica.curs1.curs10.temaTernar;

import java.util.Scanner;

public class Exercitiul_4 {
    public static void main(String[] args) {

        /*
        Ghiceste numarul
         */

        int numar_ascuns = 45;
        System.out.print("Introduceti namarul dumneavoastra aici: ");
        Scanner sc = new Scanner(System.in);
        int numarGhicit = sc.nextInt();
        String rezultat = numarGhicit == numar_ascuns ? "Felicitari , ai ghicit numarul." : numarGhicit < numar_ascuns ?
                " Mai mult ! " : "Mai putin! " ;
        System.out.println(rezultat);
        /*
        == ; > ; < ; >= ; <= .
         */
    }
}

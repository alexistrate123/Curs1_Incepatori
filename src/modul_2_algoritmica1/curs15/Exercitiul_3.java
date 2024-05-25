package modul_2_algoritmica1.curs15;

import java.util.Scanner;

public class Exercitiul_3 {
    public static void main(String[] args) {

        /*
        scrie un program care cere 3 cuvinte
        si le salveaza intr-un singur string cu , si spatiu intre ele

         */

        Scanner sc = new Scanner(System.in);
        String enumeratie = "";
        for (int i = 1; i <= 4 ; i++) {
            System.out.println("Introdu cuvantul: " );
            String cuvant = sc.nextLine();
            enumeratie += cuvant+","+" ";
        }
        System.out.println(enumeratie);
    }
}

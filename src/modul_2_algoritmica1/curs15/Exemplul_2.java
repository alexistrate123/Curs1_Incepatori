package modul_2_algoritmica1.curs15;

import java.util.Scanner;

public class Exemplul_2 {
    public static void main(String[] args) {

        /*
        scrie un program care citeste 6 cuvinte
         */

        Scanner sc = new Scanner(System.in);
       String propozitie = "";
        for (int i = 1; i <= 6 ; i++) {
            System.out.println("Introdu cuvantul : ");
            String cuvant = sc.next();
            propozitie += cuvant+" ";
        }
        System.out.println(propozitie);

    }
}

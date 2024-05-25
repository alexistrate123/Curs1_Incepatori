package modul_2_algoritmica1.curs15;

import java.util.Scanner;

public class Recapitulare_Exemplul_1 {
    public static void main(String[] args) {
        /*
        Scrie un program care cere de la user 4 litere
        pe care le salveaza intr-un singur cuvant

         */

        Scanner sc = new Scanner(System.in);
        StringBuilder cuvant = new StringBuilder();
        for (int i = 1; i <= 4 ; i++) {
            System.out.println("Introdu o litera: ");
            char litera = sc.next().charAt(0);
            cuvant.append(litera);
        }
        System.out.println(cuvant);
    }
}

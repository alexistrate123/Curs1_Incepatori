package modul_2_algoritmica1.curs21;

import java.util.Scanner;

public class ArraysExempleConsola1 {
    public static void main(String[] args) {

        // declara un array de string
        // afiseaza la consola
        // Formeaza o prop. ;
        String[] cuvinte = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cuvinte.length; i++) {
            System.out.println(" Introdu cuvantul aici ; ");
            cuvinte[i] = sc.nextLine();
        }
        for (String cuvant : cuvinte) {
            System.out.print(cuvant + " ");
        }
    }
}

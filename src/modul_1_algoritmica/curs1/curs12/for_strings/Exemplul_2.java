package modul_1_algoritmica.curs1.curs12.for_strings;

import java.util.Scanner;

public class Exemplul_2 {
    public static void main(String[] args) {

        /*
        Scrie un program care cere de la user un text
        si afiseaza " Am gasit un e "  de fiecare data ...
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un text aici: ");
        String text = sc.nextLine();
        text = text.toLowerCase();
        for (int i = 0; i < text.length() ; i++) {
            // text.charAt(i) = valoarea lui i a fiecarui caracter din textul nostru !!!!
            if (text.charAt(i) == 'e') {
                System.out.println("Am gasit un e");
                continue;
            }
            System.out.println(text.charAt(i));
        }

    }
}

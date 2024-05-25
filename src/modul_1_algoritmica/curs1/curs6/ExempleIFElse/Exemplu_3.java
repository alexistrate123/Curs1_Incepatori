package modul_1_algoritmica.curs1.curs6.ExempleIFElse;

import java.util.Scanner;

public class Exemplu_3 {
    public static void main(String[] args) {

        /*
        Scrie un program care cere de la user o varsta  si verifica daca este major sau minor

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu varsta ta: ");
        int varsta = sc.nextInt();
        if (varsta > 0 && varsta < 18) {
            System.out.println("Sunt minor.");
        } else if (varsta >= 18 && varsta <= 100) {
            System.out.println("Sunt major.");
        } else {
            System.out.println("Esti decedat");
        };
    }
}

package modul_1_algoritmica.curs1.curs10.ifTernar;

import java.util.Scanner;

public class Exemplu_1 {
    public static void main(String[] args) {

        /*
        2 NUMERE,
        CARE ESTE MAI MARE...
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu primul numar: ");
        int numar1 = sc.nextInt();
        System.out.print("Introdu al doilea numar: ");
        int numar2 = sc.nextInt();

        if (numar1 > numar2) {
            System.out.println(numar1+" este mai mare decat "+numar2);
        } else if ( numar2 > numar1 ) {
            System.out.println(numar2+" este mai mare decat "+numar1);
        } else {
            System.out.println("Numerele sunt egale!");
        }
        System.out.println("_________________________________________________________________________________________");
        System.out.println();
        System.out.print(numar1 > numar2 ? "Numar 1 este mai mare. " : numar2 > numar1 ? "Numar 2 este mai mare. "
                : "Numerele sunt egale.");

    }
}

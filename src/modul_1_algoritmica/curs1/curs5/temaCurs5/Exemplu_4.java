package modul_1_algoritmica.curs1.curs5.temaCurs5;

import java.util.Scanner;

public class Exemplu_4 {
    public static void main(String[] args) {

        /*
        Cere de la consola  nummar1, numar2, , numar3 , comparale si afiseaza la consola care este cel mai mare dintre
        ele:
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu primul numar aici: ");
        int numar1 = sc.nextInt();
        System.out.println("Introdu al doilea numar aici: ");
        int numar2 = sc.nextInt();
        System.out.println("Introdu al treilea numar aici: ");
        int numar3 = sc.nextInt();
        if (numar1 < numar2 && numar2 < numar3) {
            System.out.println(numar3 + " este cel mai mare numar.");
        } else if (numar1 > numar2 && numar1 > numar3) {
            System.out.println(numar1 + " este cel mai mare");
        } else if (numar2 > numar1 && numar2 > numar3) {
            System.out.println(numar2 + " este cel mai mare");
        } else {
            System.out.println(numar3 + " este cel mai mare.");
        }


    }
}

package modul_1_algoritmica.curs1.curs4;

import java.util.Scanner;

public class ExampleScanner_numere {
    public static void main(String[] args) {

        /*
        int numar = cititor.nextInt();
         */
        /* Creeaza un dialog si afiseaza la consola uramtoarele
        1. Salut, eu sunt consola ta Java si am 30 de ani, tu cati ani ai?
        2. Salut , eu sunt Alex si am varsta de : .... de ani
         */

        System.out.print("Salut, eu sunt consola ta Java si am 30 de ani, tu cati ani ai?");
        Scanner numarScanner = new Scanner(System.in);
        int varsta = numarScanner.nextInt();
        System.out.println("Salut, eu sunt Alex si am varsta de: "+varsta+" de ani");



    }
}

package modul_1_algoritmica.curs1.curs4;

import java.util.Scanner;

public class ExampleScanner_numere1 {
    public static void main(String[] args) {

        /*
        Scrie un program care cere doua numere de la consola si afiseaza adunarea lor:

         */
        System.out.println("Salut, astazi invatam adunarea!");
        System.out.print("Introdu primul numar: ");
        Scanner cititorSc = new Scanner(System.in);
        int numar1 = cititorSc.nextInt();
        System.out.print("Introdu al doilea numar: ");
        int numar2 = cititorSc.nextInt();
        int suma = numar1+numar2;
        System.out.println("Rezultatul adunarii celor doua numere este: "+(numar1+numar2));
        System.out.println("Rezultatul adunarii celor doua numere este: "+suma);
        System.out.println("Bravo, te-ai descurcat de minune!");




    }
}

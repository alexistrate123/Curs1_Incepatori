package modul_1_algoritmica.curs1.curs4;

import java.util.Scanner;

public class ExampleScanner2 {
    public static void main(String[] args) {

        /*
         scrie un program care cere 3 numere de la consola
         si afiseaza media lor
         */

        System.out.println("Salut, te rog sa imi spui urmatoarele 3 numere!");
        System.out.print("Primul numar dat, este : ");
        Scanner cititorSc = new Scanner(System.in);
        int numar1 = cititorSc.nextInt();
        System.out.print("Al doilea numar dat, este: ");
        int numar2 = cititorSc.nextInt();
        System.out.print("Al treilea numar dat este: ");
        int numar3 = cititorSc.nextInt();
        int mediaAritmetica = (numar1+numar2+numar3)/3;
        System.out.println("Acum te rog, afiseaza media lor aritmetica: "+ mediaAritmetica);
        System.out.println("Ma bucur ca ai inteles si ai dus la indeplinire exercitiul, felicitari !");
    }
}

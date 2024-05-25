package modul_1_algoritmica.curs1.curs5;

import java.util.Scanner;

public class Exercitii_scanner {
    public static void main(String[] args) {

        System.out.print("Introdu un caracter: ");
        Scanner cititorSc = new Scanner(System.in);
        char caracter1 = cititorSc.next().charAt(2);
        System.out.println("Ai introdus caracterul: "+caracter1);
        System.out.println();


    }
}

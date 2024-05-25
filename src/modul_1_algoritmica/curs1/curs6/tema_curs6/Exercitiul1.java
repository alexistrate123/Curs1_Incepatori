package modul_1_algoritmica.curs1.curs6.tema_curs6;

import java.util.Scanner;

public class Exercitiul1 {
    public static void main(String[] args) {


        System.out.println("Exercitiul 1 !");
        // scrie un program care cere 2 numere din consola si afiseaza daca sunt egale sau nu.
        System.out.print("Introdu primul numar aici: ");
        Scanner sc = new Scanner(System.in);
        int nr1 = sc.nextInt();
        System.out.print("Introdu al doilea numar aici: ");
        int nr2 = sc.nextInt();
        if (nr1 != nr2 ) {
            System.out.println("Numerele nu sunt egale. ");
        } else {
            System.out.println("Numerele sunt egale. ");
        }



    }
}

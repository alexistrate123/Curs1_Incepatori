package modul_1_algoritmica.curs1.curs6.tema_curs6;

import java.util.Scanner;

public class Exercitiul_4 {
    public static void main(String[] args) {
        // scrie un program care citeste varsta unei persoane si afiseaza daca aceasta poate sustine sau nu
        // examenul auto. / daca varsta nu corespunde cu realitatea sa se afiseze varsta invalida.
        // adica sub 0 ani si peste 100
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu varsta ta: ");
        int varsta = sc.nextInt();
        if (varsta >= 18 && varsta < 80) {
            System.out.println("Pot sustine examenul auto.");
        } else if (varsta >= 0 && varsta <= 17 || varsta >= 80 && varsta <= 100 ) {
            System.out.println("Nu pot sustine examenul auto.");
        } else {
            System.out.println("Varsta invalida.");
        }

    }
}

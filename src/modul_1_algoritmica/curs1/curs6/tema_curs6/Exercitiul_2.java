package modul_1_algoritmica.curs1.curs6.tema_curs6;

import java.util.Scanner;

public class Exercitiul_2 {
    public static void main(String[] args) {
        // scrie un program care citeste un numar din consola si afiseaza daca este par sau impar.
        System.out.print("Introdu numarul tau aici: ");
        Scanner sc = new Scanner(System.in);
        int numar1 = sc.nextInt();
        if (numar1 % 2 == 0) {
            System.out.println(numar1+" este par");
        } else {
            System.out.println(numar1+" este impar");
        }

    }
}

package modul_1_algoritmica.curs1.curs6.tema_curs6;

import java.util.Scanner;

public class Exercitiul_3 {
    public static void main(String[] args) {
        // scrie un program care sa citeasca din consola un numar si sa afiseze daca este pozitiv sau nu.
        // daca numarul este 0 , sa se afiseze : Numarul este o
        System.out.print("Introdu numarul tau aici: ");
        Scanner sc = new Scanner(System.in);
        int numar1 = sc.nextInt();
        if (numar1 < 0) {
            System.out.println(numar1+" este numar negativ.");
        } else if (numar1 == 0) {
            System.out.println("Numarul este 0. ");
        } else {
        System.out.println(numar1+" este numar pozitiv.");
        }

    }
}

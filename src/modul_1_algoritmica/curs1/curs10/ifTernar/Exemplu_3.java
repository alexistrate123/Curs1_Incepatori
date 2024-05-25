package modul_1_algoritmica.curs1.curs10.ifTernar;

import java.util.Scanner;

public class Exemplu_3 {
    public static void main(String[] args) {

        /*
        scrie un program care cere de la user un numar si afiseaza daca este impar sau par
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numarul aici: ");
         int numar = sc.nextInt();
         String rezultat = numar % 2 == 0 ? "Numarul este par! " : "Numarul este impar !";
        System.out.println(rezultat);
    }
}

package modul_1_algoritmica.curs1.curs8;

import java.util.Scanner;

public class Exemplu_2 {
    public static void main(String[] args) {

        /*
        FizzBuzz

        Scrie urmatoarele :
         cere un numar de la consola si verifica urmatoarele:
           daca numarul este divizibil cu 3 atunci afiseaza FIZZ
           daca ...... cu 5 afiseaza buzz
           daca este si cu 3 si cu 5 , = FizzBuzz
         */

        System.out.println("Introdu numarul tau aici: ");
        Scanner sc = new Scanner(System.in );
        int nr = sc.nextInt();
        if (nr % 3 == 0 && nr % 5 == 0 ) {
            System.out.println("FizzBuzz");
        } else if (nr % 3 == 0) {
            System.out.println("Fizz");
        } else if (nr % 5 == 0 ) {
            System.out.println("Buzz");
        } else {
            System.out.println("Numar invalid!");
        }

    }
}

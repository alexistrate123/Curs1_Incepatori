package modul_1_algoritmica.curs1.curs10.temaTernar;

import java.util.Scanner;

public class Exercitiul_2 {
    public static void main(String[] args) {

        /*
        FizzBuzz
         */
        System.out.print("Introdu numarul tau aici: ");
        Scanner sc = new Scanner(System.in );
        int nr = sc.nextInt();
        String FizzBuzz = nr % 3 == 0 && nr % 5 == 0 ? "FizzBuzz" : nr % 3 == 0 ? "Fizz" : nr % 5 == 0 ? "Buzz" :
                "Numar invalid !";
        System.out.println(FizzBuzz);
    }
}

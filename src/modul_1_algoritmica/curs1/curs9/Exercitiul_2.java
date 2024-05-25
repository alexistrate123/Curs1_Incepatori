package modul_1_algoritmica.curs1.curs9;

import java.util.Scanner;

public class Exercitiul_2 {
    public static void main(String[] args) {

        /*
        Scrie un program care cere anotimpul anului si afiseaza lunile corespunzator !
         */

        System.out.print("introdu anotimpul: ");
        Scanner sc = new Scanner(System.in);
        String anotimp = sc.next();
        if (anotimp.equalsIgnoreCase("Primavara")) {
            System.out.println("Martie , Aprilie, Mai ");
        } else if (anotimp.equalsIgnoreCase("Vara")) {
            System.out.println("Iunie, Iulie, August");
        } else if (anotimp.equalsIgnoreCase("Toamna")) {
            System.out.println("Septembrie, Octombrie, Noiembrie");
        } else if (anotimp.equalsIgnoreCase("Iarna")) {
            System.out.println("Decembrie ( Vine mosuuu !!), Ianuarie, Februarie");
        } else {
            System.out.println("Anotimp invalid !");
        }

    }
}

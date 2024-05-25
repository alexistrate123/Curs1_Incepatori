package modul_1_algoritmica.curs1.curs12.Tema;

import java.util.Scanner;

public class Exercitiul_12 {
    public static void main(String[] args) {

        /*
        Scrie un program care afiseaza cate caractere sunt intr-un string citit de la consola;
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu textul aici: ");
        String text = sc.next();
        int nrCaractere = text.length();
        System.out.println("Textul "+text+ " are "+nrCaractere+" caractere. ");

    }
}

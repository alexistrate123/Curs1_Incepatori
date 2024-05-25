package modul_1_algoritmica.curs1.tema_7;

import java.util.Scanner;

public class Exercitiul_1 {
    public static void main(String[] args) {

        /*
        Scrie un program care cere 2 numere
        si un caracter
        +, -, *, % ;
         */
        System.out.print("Introduceti primul numar: ");
        Scanner sc = new Scanner(System.in);
        int nr1 = sc.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int nr2 = sc.nextInt();
        System.out.print("Introduceti caracterul dumneavoastra aici: ");
        char char1 = sc.next().charAt(0);
        int suma = nr1 + nr2;
        int scadere = nr1 - nr2;
        int inmultire = nr1 * nr2;
        int impartire = nr1 / nr2;
        int modulo = nr1%nr2;
        if (char1 == '+') {
            System.out.println("Rezultatul adunarii este: "+suma);
        } else if (char1 == '-') {
            System.out.println("Rezultatul scaderii este: "+scadere);
        } else if (char1 == '*') {
            System.out.println("Rezultatul inmultirii este: "+inmultire);
        } else if (char1 == '/') {
            System.out.println("Rezultatul impartirii este: "+impartire);
        } else if (char1 == '%') {
            System.out.println("Modulo este egal cu: "+modulo);
        } else {
            System.out.println("Operatie invalida, reincercati !");
        }


    }
}

package modul_2_algoritmica1.curs21;

import java.util.Scanner;

public class ArraysExempleConsola {
    public static void main(String[] args) {
        // Declara un array gol cu 5 elemente ,
        // Citeste de la consola elementele,
        // introdu elementele in array;


        char[] caractere = new char[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < caractere.length; i++) {
            System.out.println(" Introdu un caracter : ");
            caractere[i] = sc.next().charAt(0);
        }
        System.out.println(caractere);

    }
}

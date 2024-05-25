package modul_1_algoritmica.curs1.curs10.ifTernar;

import java.util.Scanner;

public class Exemplu_2 {
    public static void main(String[] args) {

        /*
        scrie un program care cere de la user un numar si compara-l cu 50

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numarul aici: ");
        int numar = sc.nextInt();
        String rezultat = numar > 50 ? "Numarul ales este mai mare decat 50 " : numar < 50 ? "Numarul ales este mai mic" +
                " decat 50" : "Numarul ales este egal cu 50" ;

        /*
        System.out.println(numar > 50 ? "Numarul ales este mai mare decat 50 " : numar < 50 ? "Numarul ales este mai mic" +
                          " decat 50" : "Numarul ales este egal cu 50" );

         */
        System.out.println(rezultat);



    }
}

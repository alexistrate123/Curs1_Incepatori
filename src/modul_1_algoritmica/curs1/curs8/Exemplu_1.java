package modul_1_algoritmica.curs1.curs8;

import java.util.Scanner;

public class Exemplu_1 {
    public static void main(String[] args) {

        /*
       scrie un program care cere de la utilizator , temperatura corpului si afiseaza urmatoarele :
       daca temp corp. este intre 36.5 si 37, atunci temp. corp. normala
       daca temp corp. este intre 37.5 si 38 atunci temp. corp. mica
       daca este intre 38 si 38.5 ( ai temp, baga nurofen )
       38.5 40 ( temp mare , suni la salvare )
       daca temp este mai mica de 36,5 si mai mare de 40 = adio bye bye, struli bambuli

         */

        System.out.print("Termometrul arata temperatura de: ");
        Scanner sc = new Scanner(System.in);
        double temperatura = sc.nextDouble();
        if (temperatura >= 36.4 && temperatura <= 40.1 ) {
            if (temperatura >= 36.5 && temperatura <= 37) {
                System.out.println(" Temperatura este normala!");
            } else if (temperatura >= 37.5 && temperatura < 38) {
                System.out.println("Temperatura corpului este mica!");
            } else if (temperatura >= 38 && temperatura < 38.5) {
                System.out.println("Temperaturaaa ! Baga nurofen!");
            } else if (temperatura >= 38.5 && temperatura <= 40) {
                System.out.println("Baaa! Suna la salvare ca nu ti-e bine!");
            }
        } else {
            System.out.println("Adio byy bye, struli bambuli !");
        }


    }
}

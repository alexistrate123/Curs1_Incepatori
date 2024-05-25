package modul_1_algoritmica.curs1.tema_7;

import java.util.Scanner;

public class Exercitiul_3 {
    public static void main(String[] args) {

        System.out.print("Introduceti anul aici: ");
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        if ( an % 4 == 0 && an % 100 != 0 && an % 400 == 0 ) {
            System.out.println("Anul nu este bisect !");
        } else {
            System.out.println(" Anul este bisect !");
        }


    }
}

package modul_2_algoritmica1.curs15.Exemple_While;

import java.util.Scanner;

public class Exemplul_2 {
    public static void main(String[] args) {

        /*
        Scrie un program care cere de la user un numar la infinit
        si afiseaza acel numar X 10
        daca userul introduce 0 , sa se opreasca programul
         */


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introdu numarul tau aici : ");
            int numar = sc.nextInt();
            if (numar == 0) {
                System.out.println("Pogramul se opreste !");
                break;
            }
            System.out.println(numar * 10);
        }


    }
}

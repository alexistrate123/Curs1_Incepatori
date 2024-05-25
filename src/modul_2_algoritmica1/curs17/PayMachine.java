package modul_2_algoritmica1.curs17;

import java.util.Scanner;

public class PayMachine {
    public static void main(String[] args) {

        /*
        Scrie un program care da restul conform cerintelor de mai jos:
        a.) un mesaj de intampinare " Hello ! "
        b.) introdu valoare cumparaturi ( 113,57 );
        c.) Introdu banii: ( 500 ) ;
        d.) Restul dvs. este : ...
        e.) Ai primit urmatoarele bacnote : 200 , 100, 50 , 20, 5, 10, 1,  0,10 * 4, 0,01
         */
// 386.43 = 200, 100, 50,20,10 5,1  , 10 10 10 10 ,1 1 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Introdu valoare cumparaturi: ");
        double valoareCumparaturi = sc.nextDouble();
        System.out.println("Introdu banii : ");
        int sumaBani = sc.nextInt();
        double rest = sumaBani - valoareCumparaturi;
        System.out.println("Restul dumneavoastra este:  " + rest);
        while (rest > 200) {
            System.out.println("Ai primit 200 de lei. ");
         rest -=200;
        }
        while (rest > 100) {
            System.out.println("Ai primit 100 de lei. ");
            rest -= 100;
        }
        while (rest > 50) {
            System.out.println("Ai primit 50 de lei. ");
            rest -= 50;
        }
        while (rest > 20) {
            System.out.println("Ai primit 20 de lei. ");
            rest -= 20;
        }
        while (rest > 10) {
            System.out.println("Ai primit 10 de lei. ");
            rest -= 10;
        }
        while (rest > 5) {
            System.out.println("Ai primit 5 lei. ");
            rest -= 5;
        }
        while (rest > 1) {
            System.out.println("Ai primit 1 leu. ");
            rest -= 1;
        }
        while (rest > 0.50) {
            System.out.println("Ai primit 50 de bani. ");
            rest -= 0.50;
        }
        while (rest > 0.10) {
            System.out.println("Ai primit 10 bani. ");
            rest -= 0.10;
        }
        while (rest > 0.05) {
            System.out.println("Ai primit 5 bani. ");
            rest -= 0.05;
        }
        while (rest > 0.01) {
            System.out.println("Ai primit 1 ban. ");
            rest -= 0.01;
        }


    }
}

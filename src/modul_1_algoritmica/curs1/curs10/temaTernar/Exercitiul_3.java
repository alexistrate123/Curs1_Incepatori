package modul_1_algoritmica.curs1.curs10.temaTernar;

import java.util.Scanner;

public class Exercitiul_3 {
    public static void main(String[] args) {

      /*
      Semafoare ( culoarea )
       */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu culoarea semaforului: ");
        String culoare = sc.next();
        String rezultat = culoare.equalsIgnoreCase("Rosu") ? "Stop!" : culoare.equalsIgnoreCase
                ("Galben")
                ? "Incetiniti si opriti !" : culoare.equalsIgnoreCase("Verde") ? "Porniti !" :
                "Culoare invalida !" ;
        System.out.println(rezultat);

    }
}

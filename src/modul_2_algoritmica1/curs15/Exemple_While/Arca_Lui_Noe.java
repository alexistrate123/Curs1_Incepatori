package modul_2_algoritmica1.curs15.Exemple_While;

import java.util.Scanner;

public class Arca_Lui_Noe {
    public static void main(String[] args) {


        /*
        Scrie un program care cere de la user ( DUMNEZEU ) un animal la infinit
        si afiseaza tot timpul " ai introdus ..... in Arca "
        daca user = STOP atunci sa se afiseze cate animale au fost introduse
         */

        Scanner sc = new Scanner(System.in);
          int numarAnimale = 0;
        while (true) {
            System.out.println("Introdu un animal : ");
            String animal = sc.next();
            System.out.println("Ai introdus "+ animal + " in Arca.");
            numarAnimale++ ;
            if (animal.equalsIgnoreCase("STOP")) {
                System.out.println("In Arca lui Noe sunt " + numarAnimale+ " animale pana acum. ");
                break;

            }

        }

    }
}

package modul_2_algoritmica1.curs25;

import java.util.ArrayList;

public class Exercitiul8 {
    public static void main(String[] args) {

        // Scrie un program care sa separe o lista in alte liste cu elemnte pare si impare;

        ArrayList<Integer> numereIntregi = new ArrayList<>();

        numereIntregi.add(2);
        numereIntregi.add(1);
        numereIntregi.add(4);
        numereIntregi.add(3);
        numereIntregi.add(6);
        numereIntregi.add(5);
        numereIntregi.add(8);
        numereIntregi.add(7);

        ArrayList<Integer> numerePare = new ArrayList<>();
        ArrayList<Integer> numereImpare = new ArrayList<>();

        for (Integer numarIntreg : numereIntregi) {
            if (numarIntreg %2 == 0) {
                numerePare.add(numarIntreg);
            } else {
                numereImpare.add(numarIntreg);
            }
        }
        System.out.print("Lista initiala este :" + numereIntregi);
        System.out.println();
        System.out.print("Lista numerelor pare este: " + numerePare);
        System.out.println();
        System.out.print("Lista numerelor impare este : " + numereImpare);

    }
}

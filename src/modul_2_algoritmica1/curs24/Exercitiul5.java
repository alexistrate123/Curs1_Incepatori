package modul_2_algoritmica1.curs24;

import java.util.ArrayList;
import java.util.Collections;

public class Exercitiul5 {
    public static void main(String[] args) {
        // Scrie un program carfre sa afiseze al doilea cel mai mare numar dintr-o lista;
//    varianta I
        /* ArrayList<Integer> numereAfisate = new ArrayList<>();

        numereAfisate.add(10);
        numereAfisate.add(27);
        numereAfisate.add(89);
        numereAfisate.add(123);
        numereAfisate.add(56);
        numereAfisate.add(67);
        numereAfisate.add(1);

        for (Integer numarAfisat : numereAfisate) {
            System.out.print(numarAfisat + " ");
        }
        System.out.println();
        Collections.sort(numereAfisate);

        for (Integer numarAfisat : numereAfisate) {
            System.out.print(numarAfisat + " ");
        }
        System.out.println();

        System.out.print(numereAfisate.get(numereAfisate.size() - 2));

         */
        System.out.println("_____________________________________________________________________________");
        System.out.println();

        // Scrie un program care sa afiseze al doilea cel mai mare numar dintr-o lista;
//    varianta 2
        ArrayList<Integer> numere = new ArrayList<>();

        numere.add(10);
        numere.add(27);
        numere.add(89);
        numere.add(123);
        numere.add(56);
        numere.add(67);
        numere.add(1);
        // Declaram 2 variabile apeland clasa mama Integer.MIN_VALUE / .MAX_VALUE;\
        int celMaiMare = Integer.MIN_VALUE;
        int alDoileaCelMaiMare = 0;
        //System.out.println(numarCuCeaMaiMicaValoareCarePoateFiStocata);
        // Parcurgem lista pentru gasirea celui mai mare si al doilea cel mai mare element din lista;
        for (Integer numar : numere) {
            if (numar > celMaiMare) {
                alDoileaCelMaiMare = celMaiMare;
                celMaiMare = numar;
            } else if (numar > alDoileaCelMaiMare && numar != celMaiMare ) {
                alDoileaCelMaiMare = numar;
            }
        }
        System.out.println("Al doilea cel mai mare element este : " + alDoileaCelMaiMare);
    }
}

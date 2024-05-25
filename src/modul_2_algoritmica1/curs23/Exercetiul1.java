package modul_2_algoritmica1.curs23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercetiul1 {
    public static void main(String[] args) {

        /*
        Declara o lista de double, cu 6 elemente
        Sorteaza lista in ordine crescatoare si afiseaza elementele;
        inverseaza lista si afiseaza elemntele;
        adauga un numar nou pe pozitia 3
        sterge primele 2 elemente si afiseaza lista;
         */

        ArrayList<Double> listaNumere = new ArrayList<>(Arrays.asList(20.5, 10.6, 35.9, 3.90, 15.86, 99.50));
        Collections.sort(listaNumere);
        System.out.println(listaNumere);

        System.out.println();

        Collections.reverse(listaNumere);
        System.out.println(listaNumere);
        listaNumere.add(2, 18.22);
        System.out.println(listaNumere);
        listaNumere.remove((Object) 99.5);
        listaNumere.remove((Object) 35.9);
        System.out.println(listaNumere);
    }
}

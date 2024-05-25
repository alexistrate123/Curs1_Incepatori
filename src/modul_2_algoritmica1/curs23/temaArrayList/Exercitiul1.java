package modul_2_algoritmica1.curs23.temaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercitiul1 {
    public static void main(String[] args) {

        ArrayList<String> flori = new ArrayList<>();
        flori.add("Floarea-Soarelui");
        flori.add("Orhidee");
        flori.add("Muscata");
        flori.add("Ghiocel");
        flori.add("Trandafir");
        flori.add("Lalea");

        System.out.println(flori);

        flori.add(2, "Rosu");
        flori.add(0, "Albastru");

        System.out.println(flori);

        flori.remove((Object) "Ghiocel");
        flori.remove((Object) "Lalea");

        System.out.println(flori);

        Collections.sort(flori);
        System.out.println(flori);

        Collections.reverse(flori);
        System.out.println(flori);

    }
}

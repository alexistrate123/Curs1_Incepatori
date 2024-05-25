package modul_2_algoritmica1.curs25;

import java.util.ArrayList;

public class Exercitiul10 {
    public static void main(String[] args) {


        // Scrie un program care sa transforme o lista itr-un array;

        ArrayList<String> elementeNume = new ArrayList<>();


        elementeNume.add("Abcde");
        elementeNume.add("fghi");
        elementeNume.add("jklm");
        elementeNume.add("mnop");

        String[] litere = new String[elementeNume.size()];

        elementeNume.toArray(litere);

        for (String elementNume : elementeNume) {
            System.out.print(elementNume);
        }

    }
}
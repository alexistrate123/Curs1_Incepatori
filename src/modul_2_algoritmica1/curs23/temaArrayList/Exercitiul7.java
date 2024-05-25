package modul_2_algoritmica1.curs23.temaArrayList;

import java.util.ArrayList;

public class Exercitiul7 {
    public static void main(String[] args) {

        ArrayList<String> numeUnelte = new ArrayList<>();

        numeUnelte.add("ciocan");

        numeUnelte.add("grebla");

        numeUnelte.add("surubelnita");

        numeUnelte.add("matura");

        System.out.println(numeUnelte);

        numeUnelte.remove(3);

        System.out.println(numeUnelte);

    }
}

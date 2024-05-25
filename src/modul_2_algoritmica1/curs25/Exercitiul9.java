package modul_2_algoritmica1.curs25;

import java.util.ArrayList;

public class Exercitiul9 {
    public static void main(String[] args) {

        // Scrie un program care sa afiseze cate duplicate sunt intr-o lista;

        ArrayList<String> listaNume = new ArrayList<>();

        listaNume.add("Alex");
        listaNume.add("Marian");
        listaNume.add("Miruna");
        listaNume.add("Pamela");
        listaNume.add("Alex");
        listaNume.add("Robert");
        listaNume.add("Danut");
        listaNume.add("Miruna");

        ArrayList<String> listaDuplicat = new ArrayList<>();


        ArrayList<String> elementeParcurse = new ArrayList<>();

        for (String  listaUnNume: listaNume) {
            if (elementeParcurse.contains(listaUnNume)) {
                if (!listaDuplicat.contains(listaUnNume)) {
                    listaDuplicat.add(listaUnNume);
                }
            } else {
                elementeParcurse.add(listaUnNume);
            }
        }

        System.out.println("Lista noastra duplicat : " + listaDuplicat);
    }
}

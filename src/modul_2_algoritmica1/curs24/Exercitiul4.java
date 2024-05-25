package modul_2_algoritmica1.curs24;

import java.util.ArrayList;

public class Exercitiul4 {
    public static void main(String[] args) {

        // Declara un program care sa identifice si sa afiseze primul si ultimul element dintr-o lista;

        //Declar lista de tip String ;

        ArrayList<String> elemente = new ArrayList<>();

        // Am adaugat elemente in lista cu metoda .add;

        elemente.add("Alex");
        elemente.add("Cristian");
        elemente.add("Daniel");
        elemente.add("Marco");
        elemente.add("Polo");
        elemente.add("Roberto");

        // afisam lista cu foreach;

        for (String element : elemente) {
            System.out.print(element + " ");
        }
        System.out.println();

        // afisam primul element din lista;

        System.out.println(elemente.get(0));
        System.out.println(elemente.get(elemente.size()-1));



    }
}

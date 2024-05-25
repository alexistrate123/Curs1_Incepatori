package modul_2_algoritmica1.curs21;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExemplu {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("rosu");
        colors.add("galben");
        colors.add("albastru");
        colors.add("verde");
        colors.add("mov");

        System.out.println(colors);
        Collections.sort(colors);

        System.out.println(colors);




    }
}

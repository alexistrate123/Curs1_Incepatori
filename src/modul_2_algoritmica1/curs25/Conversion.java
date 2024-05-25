package modul_2_algoritmica1.curs25;

import java.util.Arrays;

public class Conversion {

    public static void main(String[] args) {
            // Afisarea array-ului folosind .toString()
        String[] nume = new String[4];

        nume[0] = "rosu";
        nume[1] = "albastru";
        nume[2] = "verde";
        nume[3] = "galben";

        for (String nume1 : nume) {
            System.out.println(nume1);
        }
        System.out.println();
        System.out.println("Array-ul nostru afisat in mod direct la consola este: " + Arrays.toString(nume));




        //  int to string conversion

    }



}

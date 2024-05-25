package modul_2_algoritmica1.curs19;

import java.util.Arrays;

public class UmplereaUnuiArrayGolCuFILL {
    public static void main(String[] args) {

        // Metoda FILL
           char[] arrayGol = new char[50];
        Arrays.fill(arrayGol , 'a');
        for (char element: arrayGol) {
            System.out.println(element);
        }
    }
}

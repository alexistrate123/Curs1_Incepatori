package modul_2_algoritmica1.curs19;

import java.util.Arrays;

public class SortareaUnuiArrayInOrdineDescrescatoare {
    public static void main(String[] args) {

        int[] numere = {-3, 2, -2, -70, 80, 99, -56, 22, 20, -100,};
        Arrays.sort(numere);
        for (int element : numere) {
            System.out.println(element);
        }
        System.out.println();
        System.out.println();
        for (int i = numere.length-1; i >= 0 ;  i--) {
            System.out.println(numere[i]);
        }

    }
}

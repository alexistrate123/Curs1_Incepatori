package modul_2_algoritmica1.curs19;

import java.util.Arrays;

public class SortareaUnuiArrayInOrdineCrescatoare {
    public static void main(String[] args) {
        
        // SORTARE

        int[] numere = {5, 10, 4, 2, 0, 7};
        for (int numar : numere) {
            System.out.print(numar + ", ");
        }
        System.out.println();
        // Sortarea unui array in ordine descrescatoare 
        Arrays.sort(numere);
        for (int numar : numere) {
            System.out.print(numar + ", ");
        } 
        //  
    }
}

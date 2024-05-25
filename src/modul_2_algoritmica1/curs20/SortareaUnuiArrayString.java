package modul_2_algoritmica1.curs20;

import java.util.Arrays;

public class SortareaUnuiArrayString {
    public static void main(String[] args) {

        String[] masini = {"Volvo", "Mercedes", "Opel", "Ford", "Dacia", "Porche"};
        Arrays.sort(masini);
        for (String masina:masini) {
            System.out.println(masina);
        }

    }
}

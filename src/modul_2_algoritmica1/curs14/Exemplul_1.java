package modul_2_algoritmica1.curs14;

import java.util.Scanner;

public class Exemplul_1 {
    public static void main(String[] args) {

        /*
        Scrie un program care afiseaza cate vocale, consoane , simboluri , cate saptii si cate cifre  are stringul citit
         de la consola;

         */


        Scanner sc = new Scanner(System.in);
         System.out.print("Introdu un text: ");
        String text = sc.nextLine().toLowerCase();
        int numarVocale = 0;
        int numarCifre = 0;
        int numarSPatii = 0;
        int numarSimboluri = 0;
        int numarConsoane = 0;
        for (int i = 0; i < text.length() ; i++) {
            if (Character.isLetter(text.charAt(i))){
                if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' ||
                        text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                    numarVocale++;
                } else {
                    numarConsoane++;
                }
            } else if (Character.isDigit(text.charAt(i))) {
                numarCifre++;
            } else if (Character.isSpaceChar(text.charAt(i))) {
                numarSPatii++;
            } else {
                numarSimboluri++;
            }
        }
        System.out.printf("Textul nostru de mai sus are : %d vocale, %d consoane, %d cifre, %d spatii, si %d simboluri",
                numarVocale, numarConsoane, numarCifre, numarSPatii, numarSimboluri);
    }
}

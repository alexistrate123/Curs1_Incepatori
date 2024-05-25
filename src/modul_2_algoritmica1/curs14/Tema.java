package modul_2_algoritmica1.curs14;

import java.util.Scanner;

public class Tema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu un text: ");
        String text = sc.nextLine();
        int numarMajuscule = 0;
        int numarMinuscule = 0;
        int numarCifre = 0;
        int numarSPatii = 0;
        int numarSimboluri = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (text.charAt(i) == 'A' || text.charAt(i) == 'B' || text.charAt(i) == 'C' || text.charAt(i) == 'D' ||
                        text.charAt(i) == 'E' || text.charAt(i) == 'F' || text.charAt(i) == 'G' || text.charAt(i) == 'H'
                        || text.charAt(i) == 'I' || text.charAt(i) == 'J' || text.charAt(i) == 'K' || text.charAt(i) == 'L'
                        || text.charAt(i) == 'M' || text.charAt(i) == 'N' || text.charAt(i) == 'O' || text.charAt(i) == 'P'
                        || text.charAt(i) == 'Q' || text.charAt(i) == 'R' || text.charAt(i) == 'S' || text.charAt(i) == 'T'
                        || text.charAt(i) == 'V' || text.charAt(i) == 'U' || text.charAt(i) == 'W' || text.charAt(i) == 'X'
                        || text.charAt(i) == 'Y' || text.charAt(i) == 'Z') {
                    numarMajuscule += 1;
                }else {
                    numarMinuscule++;
                }
            } else if (Character.isDigit(text.charAt(i))) {
                numarCifre++;
            } else if (Character.isSpaceChar(text.charAt(i))) {
                numarSPatii++;
            } else {
                numarSimboluri++;
            }

        }
        System.out.printf("Textul nostru de mai sus are : %d Majuscule, %d minuscule, %d cifre, %d spatii, si %d simboluri",
                numarMajuscule, numarMinuscule, numarCifre, numarSPatii, numarSimboluri);
    }

}


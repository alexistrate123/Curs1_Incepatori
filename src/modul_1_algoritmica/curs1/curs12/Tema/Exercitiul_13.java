package modul_1_algoritmica.curs1.curs12.Tema;

import java.util.Scanner;

public class Exercitiul_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu textul aici: ");
        String text = sc.nextLine();
        text = text.toLowerCase();
        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) == 'e') {
                System.out.print(" vocala ");
                continue;
            }
            if (text.charAt(i) == 'a') {
                System.out.print(" vocala ");
                continue;
            }
            if (text.charAt(i) == 'i') {
                System.out.print(" vocala ");
                continue;
            }
            if (text.charAt(i) == 'o') {
                System.out.print(" vocala ");
                continue;
            }
            if (text.charAt(i) == 'u'){
                System.out.print(" vocala ");
                continue;
            }
            System.out.print(text.charAt(i));
        }

    }

}

package modul_1_algoritmica.curs1.curs12.Tema;

import java.util.Scanner;

public class Exercitiul_14 {
    public static void main(String[] args) {
        /*
        Scrie un program care afiseaza
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu textul aici: ");
        String text = sc.next();
        text = text.toLowerCase();
        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) == 'b') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'c') {
                System.out.println("am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'd') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'f') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'h'){
                System.out.println("Am gasit o consoana.");
                continue;
            } if (text.charAt(i) == 'j') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'k') {
                System.out.println("am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'l') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'm') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'n'){
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'p') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'q') {
                System.out.println("am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'r') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 's') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 't'){
                System.out.println("Am gasit o consoana.");
                continue;
            } if (text.charAt(i) == 'v') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'w') {
                System.out.println("am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'x') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'y') {
                System.out.println("Am gasit o consoana.");
                continue;
            }
            if (text.charAt(i) == 'z'){
                System.out.println("Am gasit o consoana.");
                continue;
            }
             System.out.println(text.charAt(i));
        }
/*
'b','c','d','f','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
 */
    }
}

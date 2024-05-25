package modul_1_algoritmica.curs1.curs5.temaCurs5;

import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {

        System.out.println("Salut, te rog sa imi spui urmatoarele 3 numere!");
        System.out.print("Primul numar dat, este : ");
        Scanner cititorSc = new Scanner(System.in);
        int numar1 = cititorSc.nextInt();
        System.out.print("Al doilea numar dat, este: ");
        int numar2 = cititorSc.nextInt();
        System.out.print("Al treilea numar dat este: ");
        int numar3 = cititorSc.nextInt();
        int sumaNumere = numar1 + numar2 + numar3;
        int produsul = numar1 * numar2 + numar3;
        int impartire = numar1 / numar2 / numar3;
        int mediaAritmetica = sumaNumere / 3;
        System.out.println("Suma numerelor este : " + sumaNumere + "\n");
        System.out.println("Produsul numerolor este : " + produsul + "\n");
        System.out.println("Impartirea numerelor este : " + impartire + "\n");
        System.out.println("Media aritmetica a numerelor este : " + mediaAritmetica);

    }
}

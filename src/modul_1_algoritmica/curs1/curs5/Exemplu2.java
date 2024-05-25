package modul_1_algoritmica.curs1.curs5;

import java.util.Scanner;

public class Exemplu2 {
    public static void main(String[] args) {

        /*
        cere de la user 2 numere si un caracter si efectueaza operatia matematica
        Ex: 1 X 2 = 2
         */
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Introdu primul numar: ");
        Scanner sc = new Scanner(System.in);
        int numar1 = sc.nextInt();
        System.out.print("Introdu al doilea numar: ");
        int numar2 = sc.nextInt();
        System.out.print("Introdu un caracter pentru a efectua inmultirea: ");
        char caracter1 = sc1.next().charAt(0);
        int inmultire = numar1*numar2;
        System.out.println(inmultire);
        System.out.println(numar1+" "+caracter1+" "+numar2+" = "+inmultire);








    }
}

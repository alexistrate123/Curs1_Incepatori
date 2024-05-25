package modul_1_algoritmica.curs1.curs4.Tema_curs4;

import java.util.Scanner;

public class Exercitiu3 {
    public static void main(String[] args) {

        System.out.print("Primul numar ales, este : ");
        Scanner cititorSc = new Scanner(System.in);
        double numar1 = cititorSc.nextDouble();
        System.out.print("Al doilea numar ales, este: ");
        double numar2 = cititorSc.nextDouble();
        System.out.print("Al treilea numar ales este: ");
        double  numar3 = cititorSc.nextDouble();
        double mediaAritmetica = (numar1+numar2+numar3)/3;
        System.out.println("Media aritmetica a celor 3 numere este: "+mediaAritmetica);
        double adunareNumere = numar1+numar2+numar3;
        double scadereNumere = numar1-numar2-numar3;
        double impartireNumere = numar1/numar2/numar3;
        System.out.println("Adunarea numerelor este: "+adunareNumere);
        System.out.println("Scaderea numerelor este : "+scadereNumere);
        System.out.println("Impartirea numerelor: "+impartireNumere);
    }
}

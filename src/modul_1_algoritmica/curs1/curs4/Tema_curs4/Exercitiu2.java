package modul_1_algoritmica.curs1.curs4.Tema_curs4;

import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {

        Scanner cititorSc = new Scanner(System.in);
        Scanner cititorSc1 = new Scanner(System.in);
        System.out.println("Salut, eu sunt Java, consola ta, te rog sa imi spui urmatoarele: ");
        System.out.print("Introdu numele tau: ");
        String nume = cititorSc.nextLine();
        System.out.println("Numele meu este: "+nume);
        System.out.print("Introdu varsta ta: ");
        int varsta = cititorSc1.nextInt();
        System.out.println("Am varsta de "+varsta+" de ani.");
        System.out.print("Introdu orasul de domiciliu: ");
        String oras = cititorSc.nextLine();
        System.out.println("Sunt din orasul: "+oras);
        System.out.println("Salut, ma numesc "+nume+" am "+varsta+" si locuiesc in orasul "+oras);




    }
}

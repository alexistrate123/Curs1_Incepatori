package modul_1_algoritmica.curs1.curs4;

import java.util.Scanner;

public class ExempleScanner {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Salut, numele meu este Marian si eu reprezint consola ta!");
        System.out.print("Pe tine cum te cheama?");
        String nume = cititor.next();
        System.out.println("Pe mine ma cheama: "+nume);
        System.out.println("Oh ! wow, ce nume de New Folder ai !");
        /*
        String nume = cititor.next();
        String nume = cititor.nextLine();


         */

    }
}

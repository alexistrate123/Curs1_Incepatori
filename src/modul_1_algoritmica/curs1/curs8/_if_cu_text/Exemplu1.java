package modul_1_algoritmica.curs1.curs8._if_cu_text;

import java.util.Scanner;

public class Exemplu1 {
    public static void main(String[] args) {

        /*
        Program semafor
        Introdu la consola , culoarea semaforului si afla ce semnificatie are culoarea respectiva

         */

        System.out.print("Introdu culoarea ce se va afisa pe semafor: ");
        Scanner sc = new Scanner(System.in);
        String culoareSemafor = sc.nextLine();
        if (culoareSemafor.equalsIgnoreCase("rosu")) {
            System.out.println("STOP!");

        } else if (culoareSemafor.equalsIgnoreCase("galben")) {
            System.out.println("Incetineste, si pregateste-te sa opresti !");
        } else if (culoareSemafor.equalsIgnoreCase("verde")) {
            System.out.println("Poti trece !");
        } else {
            System.out.println(" Invataa baaa legislatia !!");
        }

    }
}

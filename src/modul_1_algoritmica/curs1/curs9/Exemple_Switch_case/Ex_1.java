package modul_1_algoritmica.curs1.curs9.Exemple_Switch_case;

import java.util.Scanner;

public class Ex_1 {

    public static void main(String[] args) {

        /*
        Program semafor
        Introdu la consola , culoarea semaforului si afla ce semnificatie are culoarea respectiva
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu culoarea semaforului: ");
        String culoare = sc.next();
        culoare = culoare.toLowerCase();
        switch (culoare ) {
            case "rosu":
                System.out.println("Stop !");
                break;
            case "galben":
                System.out.println("Incetiniti si opriti !");
                break;
            case "verde":
                System.out.println("Porniti !");
                break;
            default:
                System.out.println("Culoare invalida !");
        }

    }

}

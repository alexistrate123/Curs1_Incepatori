package modul_1_algoritmica.curs1.curs9.Exemple_Switch_case;

import java.util.Scanner;

public class ex_2 {

   public static void main(String[] args) {

        /*
        scrie un program care cere de la user o luna is afiseaza anotimpul corespunzator;
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu luna:");
        String luna = sc.next();
        switch (luna) {
            case "Decembrie", "Ianuarie", "Februarie":
                System.out.println("Iarna");
                break;
            case "Martie", "Aprilie", "Mai":
                System.out.println("Primavara");
                break;
            case "Iunie", "Iulie", "August":
                System.out.println("Vara");
                break;
            case "Septembrie", "Octombrie", "Noiembrie":
                System.out.println("Toamna");
            default:
                System.out.println("Luna invalida!");
        }
    }

}

package modul_2_algoritmica1.curs15.Exemple_While;

import java.util.Scanner;

public class Exemplul_1 {
    public static void main(String[] args) {

        //while (true) {
        //System.out.println("I love Java !");

        //}
             /*
             Scrie un program care cere de la user o culoare la infinit si afiseaza la infinit culoarea este :
             daca userul introduce STOP atunci se opreste programul

             - UPDATE : Salveaza toate culorile intr-o variabila
              */

        Scanner sc = new Scanner(System.in);
        String enumeratie = " ";
        while (true) {
            System.out.println("Introdu culoare ta aici : ");
            String culoare = sc.next();
            System.out.println("Culoarea introdusa este: "+ culoare);
            if (culoare.equalsIgnoreCase("STOP")) {
                System.out.println("Programul se va opri !");
                break;
            }
            enumeratie += culoare+ "," + " " ;


        }
        System.out.println(enumeratie);
    }

}

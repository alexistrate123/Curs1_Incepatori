package modul_1_algoritmica.curs1.curs9;

import java.util.Scanner;

public class Exemplu_1 {
    public static void main(String[] args) {

        /*
        Scire un program care iti cere o zi a saptamanii si afiseaza
        daca introduci luni - prima zi a doua sapatamanii

         */

        System.out.print("Introdu ziua saptamani aici: ");
        Scanner sc = new Scanner(System.in);
        String ziSaptamana = sc.next();
        if (ziSaptamana.equalsIgnoreCase("Luni")) {
            System.out.println("Prima zi a saptamanii!");
        } else if (ziSaptamana.equalsIgnoreCase("Marti")) {
            System.out.println("A doua zi a saptamanii.");
        } else if (ziSaptamana.equalsIgnoreCase("Miercuri")) {
            System.out.println("A treia zi a saptamanii");
        } else if (ziSaptamana.equalsIgnoreCase("Joi")) {
            System.out.println("A patra zi a saptamanii");
        } else if (ziSaptamana.equalsIgnoreCase("Vineri")) {
            System.out.println("A cincea zi a saptamnii");
        } else if (ziSaptamana.equalsIgnoreCase("Sambata")) {
            System.out.println("A sasea zi a saptamanii");
        } else if (ziSaptamana.equalsIgnoreCase("Duminica")) {
            System.out.println("Ziua in care Dumnezeu s-a odihnit !");
        } else {
            System.out.println("Introdu zi  !!");
        }

    }
}

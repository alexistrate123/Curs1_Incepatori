package modul_2_algoritmica1.curs15;

import java.util.Scanner;

public class Exemplu_StringBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder propozitie = new StringBuilder();
        for (int i = 1; i <= 6 ; i++) {
            System.out.println("Introdu cuvantul : ");
            String cuvant = sc.next();
            propozitie.append(cuvant).append(",").append(" ");
        }
        System.out.println(propozitie);

    }
}

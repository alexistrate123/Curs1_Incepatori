package modul_1_algoritmica.curs1.curs5;

import java.util.Scanner;

public class Exemplu3 {
    public static void main(String[] args) {

        System.out.println("Calculeaza aria cercului:");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Intrdu aici , raza = ");
        int raza = sc.nextInt();
        System.out.print(" Introdu aici, numarul Pi = ");
        double PiNumber = sc1.nextDouble();
        double RezultatArie = PiNumber*(raza*raza);
        System.out.print("Aria cercului este egala cu = "+RezultatArie);

    }
}

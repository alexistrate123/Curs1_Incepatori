package modul_2_algoritmica1.curs23.temaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercitiul3 {
    public static void main(String[] args) {

        ArrayList<Double> numereCuZecimale = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introdu numarul tau aici : ");
            double c = sc.nextDouble();
            if (numereCuZecimale.size() >= 7) {
                System.out.println("System is shuting dowm! \n 3 \n 2 \n 1 ");
                break;
            }
            numereCuZecimale.add(c);
        }
        System.out.println(numereCuZecimale.size());
        double suma = 0;
        double produs = 1;
        for (Double element : numereCuZecimale) {
            suma = suma + element;
            produs *= element;
        }
        System.out.println("Suma numerelor din lista este " + suma + "\nProdusul numerelor din lista este " + produs);


    }
}

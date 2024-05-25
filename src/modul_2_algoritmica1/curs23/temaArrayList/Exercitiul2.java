package modul_2_algoritmica1.curs23.temaArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
//   Aici decalr un array gol
        ArrayList<String> masiniService = new ArrayList<>();

//   Aici declar un obiect de tip Scanner
        Scanner sc = new Scanner(System.in);

        //  Aici folosesc bucla while pentru a introduce masinile scrise la consola , in lista
        while (true) {
            System.out.println("Introdu masina aici: ");
            String c = sc.nextLine();
            if (c.equalsIgnoreCase("Stop")) {
                break;
            }
            masiniService.add(c);
        }
        for (String masina : masiniService) {
            System.out.print(masina + " ");
        }
        Collections.sort(masiniService);

        for (String masina : masiniService) {
            System.out.print(masina + " ");
        }


    }
}

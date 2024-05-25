package modul_2_algoritmica1.curs18;

public class Exemplul2 {
    public static void main(String[] args) {

        //Scrie un program care stocheaza intr-o variabila cateva numere si afiseala la consola;

        int[] numere = {2, 15, 24, 35, 8};

        for (int element: numere ) {
            System.out.println(element);
        }

        // Afisarea unui singur element din array-ul numere ;
        System.out.println(numere[3]);
        System.out.println(numere[1]);

    }
}

package modul_2_algoritmica1.curs19;

public class ExempluArray {
    public static void main(String[] args) {

        int[] numere = {1, 2, 3, 6, 10, 56};
        String[] nume = {"Alex", "Mariana", "Elena", "Marius"};
        // Un array nu se afisaza intr-un mod direct
        //System.out.println(numere);
        // System.out.println(nume);
        for (int i = 0; i <= numere.length - 1; i++) {
            System.out.println(numere[i]);
        }
        System.out.println();
        System.out.println("__________________________________________________________________________");
        System.out.println();
        for (int numar : numere) {
            System.out.println(numar);
        }
        System.out.println();
        System.out.println("__________________________________________________________________________");
        System.out.println();
        for (int i = 0; i < nume.length; i++) {
            System.out.print(nume[i] + ", ");
        }
        System.out.println();
        System.out.println("__________________________________________________________________________");
        System.out.println();
        for (String element : nume) {
            System.out.print(element + ", ");
        }

    }
}

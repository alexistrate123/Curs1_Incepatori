package modul_2_algoritmica1.curs20;

public class MediaNumerelorDinArray {
    public static void main(String[] args) {
        double[] numereCuZecimale = {23.5, 8.99, 61.11, 0.33, -4.2};

        double suma = 0 ;

        for (double numar:numereCuZecimale) {
            suma += numar;
        }
        System.out.print(suma);
        System.out.println();
        System.out.println(suma/numereCuZecimale.length);
    }
}

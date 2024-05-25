package modul_1_algoritmica.curs1.curs12;

public class Exemplul_1 {
    public static void main(String[] args) {

        /*
        Parcurge toate numerele de la 1 la 100 si in loc de numerele multiple cu 3 afiseaza fizz, multiple cu 5 buzz,
        si multiple cu 3 si 5 , fizzbuzz
         */

        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

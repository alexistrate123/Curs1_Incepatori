package modul_1_algoritmica.curs1.curs6;

public class Incrementare {
    public static void main(String[] args) {

        /*
        Incrementarea si decremenatarea numerelor :
         */

        int numar1 = 5;

        System.out.println(numar1);
        numar1++;
        System.out.println(numar1);

        /*
        Creaza o variabila cu numele age = 18 , incrementeaza varsta pana ajungi la 23 de ani ;

         */

        int age = 18;
        System.out.println(age);
        age++;
        System.out.println(age);
        age++;
        age++;
        age++;
        age++;
        System.out.println(age);
        System.out.println("_________________________________________________________________________________________");
        System.out.println();

        /*
        Creeaz o variabila data nasterii = 1988 si afiseaza anii din 5 in 5 ani pana in 20
         */

        int dataNasterii = 1988;
        System.out.println(dataNasterii);
        dataNasterii += 5;
        System.out.println("Dupa cinci ani later... " + dataNasterii);
        dataNasterii += 5;
        System.out.println("Dupa alti cnici ani... " + dataNasterii);
        dataNasterii -= 8;
        System.out.println("In urma cu 8 ani era anul... " + dataNasterii);
        System.out.println();

        int portofel = 400;
        portofel *= 5;
        System.out.println(portofel);

    }
}

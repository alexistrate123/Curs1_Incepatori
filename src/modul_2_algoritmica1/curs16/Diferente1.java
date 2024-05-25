package modul_2_algoritmica1.curs16;

public class Diferente1 {
    public static void main(String[] args) {

        // scrie un program care calculeaza si afiseaza media tuturor numerelor de la 10 la 20

        System.out.println("For------------------------------------------------------------");

        int suma = 0;

        for (int i = 10; i <= 20 ; i++) {
//            System.out.println("Valoarea lui i la fiecare ciclu executat " + i);
            suma+= i;
//            System.out.print("Valoarea cutiei noastre pe nume \"Suma\" la fiecare ciclu executat " + suma + " \n");
        }
        System.out.println("Media tuturor numerelor de la 10 la 20 este " + suma/10);


        System.out.println("While-------------------------------------------------");
        //while

        int i = 10;
        int sumaWhile = 0;
        while (i <= 20) {
            sumaWhile += i;
            i++;
        }

        System.out.println("Media tuturor numerelor de la 10 la 20 este " + sumaWhile/10);

    }
}

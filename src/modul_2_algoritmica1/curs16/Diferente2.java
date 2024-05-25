package modul_2_algoritmica1.curs16;

public class Diferente2 {
    public static void main(String[] args) {

        System.out.println("Scrie un program care afiseaza toate numerele impare de la 66 la 23: ");

        for (int i = 66; i >=23 ; i--) {
           if (i % 2 != 0){
               System.out.println(i + " ");
           }
        }

        System.out.println("While------------------------------------");
       // While

        int i = 66;
        while (i >= 23) {
            if (i % 2 != 0){
                System.out.println(i + " ");
            }
            i--;
        }



    }
}

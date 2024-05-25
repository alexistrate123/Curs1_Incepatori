package modul_1_algoritmica.curs1.curs11;

public class Exemplul_7 {
    public static void main(String[] args) {

        // afiseaza toate numele pare de la 50 la 100;
        // 2 metode de afisare

        for (int i = 50; i <= 100 ; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        for (int i = 50; i <= 100; i++) {
            if ( i % 2  == 0 ) {
                System.out.print(i+" ");
            }
        }


    }


}

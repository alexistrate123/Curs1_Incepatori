package modul_1_algoritmica.curs1.curs12;

public class Joculete {
    public static void main(String[] args) throws InterruptedException {

        /*
        Rocket Launcher
        Scrie un program care afiseaza lansarea inversa a rachetei
        la 5 - Engage !
         */

        for (int i = 10; i >= 0 ; i--) {
            if (i == 5) {
                System.out.println("Engage !");
                Thread.sleep(1000);
                continue;
            }
            if (i == 0) {
                System.out.println("Rocket is launched! ");
                continue;
            }
            System.out.println(i);
            Thread.sleep(1000);

        }


    }
}

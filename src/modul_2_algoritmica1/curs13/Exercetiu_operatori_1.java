package modul_2_algoritmica1.curs13;

import java.util.Random;
import java.util.Scanner;

public class Exercetiu_operatori_1 {
    public static void main(String[] args) {

        /*
        Se cere de la consola un numar de la 1 la 100 si
        daca numarul introdus la consola este mai mic, atunci sa se afiseze , Mai mult
        si invers ( daca este mai mic , atunci = Mai putin )
        daca ghicesti numarul = Good job !
        UPDATE :
        1.) dupa fiecare raspuns gresit , se scade cate o viata; ( jocul se opreste cand ramai fara ( vieti = 0 ) ;
        2.) Dupa ghicirea numarului , sa se afiseze Felicitari , ai ghicit numarul din .... incercari , vieti ramase...\
        3.) Daca ghiceste din 10 in 10 ii adaugam 2 vieti
        */
        // WHILE == la infinit pana oprim programul
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int nrAscuns = rnd.nextInt(100);
        int nrVieti = 5;
        int nrIncercari = 0;
        while (true) {
            System.out.print("Introdu numarul aici: ");
            int nrCerutLaConsola = sc.nextInt();
            if ( nrCerutLaConsola % 10 == 0 ) {
                System.out.println("Bun, ai castigat 2 vieti");
                nrVieti += 2;

            }
            if (nrCerutLaConsola > nrAscuns) {
                System.out.println("Mai putin!");
                nrIncercari += 1;
                System.out.println("Ai incercat de: "+nrIncercari);
                nrVieti -= 1;
                System.out.println("Ai ramas cu "+nrVieti+" vieti !");
            } else if (nrCerutLaConsola < nrAscuns) {
                System.out.println("Mai mult!");
                nrIncercari += 1;
                System.out.println("Ai incercat de: "+nrIncercari);
                nrVieti -= 1;
                System.out.println("Ai ramas cu "+nrVieti+" vieti !");
            } else {
                System.out.println("Felicitari ! ! \n Ai ghicit din " + nrIncercari + " incercari."+
                        " \n " + "Vieti ramase : "+ nrVieti);
                break;
            }
            if (nrVieti == 0 ) {
                System.out.println("Game over! ");
                break;

            }
        }






    }
}

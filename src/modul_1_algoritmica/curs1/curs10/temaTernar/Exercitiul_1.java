package modul_1_algoritmica.curs1.curs10.temaTernar;

import java.util.Scanner;

public class Exercitiul_1 {
    public static void main(String[] args) {

        System.out.print("Introdu ziua saptamani aici: ");
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();
        String zile = numar == 1 ? "Prima zi a saptamnii este Luni." : numar == 2 ? "A doua zi a saptamanii este Marti."
                : numar == 3 ? "A treia zi a saptamanii este Miercuri." : numar == 4 ? "A patra zi a saptamanii este" +
                " Joi." : numar == 5 ? "A cincea zi a sapatamanii este Vineri. " : numar == 6 ? "A sasea zi a saptamanii" +
                " este Sambata. " : numar == 7 ? "A saptea zi a saptamanii este Duminica." : "Zi invalida !";
        System.out.println(zile);

    }
}

package modul_1_algoritmica.curs1.curs5.temaCurs5;

import java.util.Scanner;

public class Exercitiul3 {
    public static void main(String[] args) {

       // F = (°C × 1,8) + 32
        // 1C = 1.8 F

        System.out.println("Salut , as dori sa imi transformi din Celsius in Fahrenheit! ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        int Celsius = sc.nextInt();
        System.out.println("Fahrenheit:?");
        double calcul = (Celsius*1.8)+32;
        System.out.println("Folosind formula de mai sus, F = (C X 1,8 (F)) +32 , rezultatul calculului este: "+calcul);

    }
}

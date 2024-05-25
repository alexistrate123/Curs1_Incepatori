package modul_1_algoritmica.curs1.curs9;

import java.util.Scanner;

public class Exercitiul_3 {
    public static void main(String[] args) {

        /*
        Scrie un program care cere de le user , o luna a anului si o zi a luni respective
Stan Adrian
Berbec: 21 martie – 20 aprilie
Taur: 21 aprilie – 20 mai
Gemeni: 21 mai – 21 iunie
Rac: 22 iunie – 22 iulie
Leu: 23 iulie – 22 august
Fecioara: 23 august – 22 septembrie
Balanta: 23 septembrie – 22 octombrie
Scorprion: 23 octombrie – 21 noiembrie
Sagetator: 22 noiembrie – 20 decembrie
Capricorn: 21 decembrie – 19 ianuarie
Varsator: 20 ianuarie – 18 februarie
Pesti: 19 februarie – 20 martie

         */

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Introdu luna: ");
        String luna = sc.next();
        System.out.print("Introdu ziua: ");
        int zi = sc1.nextInt();
        if (luna.equalsIgnoreCase("ianuarie")) {
            if (zi >= 1 && zi <= 19) {
                System.out.println("Capricorn");
            } else if (zi >= 20 && zi <= 31) {
                System.out.println("Varsator");
            } else {
                System.out.println(" Zi invalida !");
            }

        } else if (luna.equalsIgnoreCase("Februarie")) {
            if (zi >= 1 && zi <= 18) {
                System.out.println("Varsator");
            } else if (zi >= 19 && zi <= 28) {
                System.out.println("Pesti");
            } else {
                System.out.println(" Zi Invalida !");
            }

        } else if (luna.equalsIgnoreCase("Martie")) {
            if (zi >= 1 && zi <= 20) {
                System.out.println("Pesti");
            } else if (zi >= 21 && zi <= 31) {
                System.out.println("Berbec");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("Aprilie")) {
            if (zi >= 1 && zi <= 20) {
                System.out.println("Berbec");
            } else if (zi >= 21 && zi <= 30) {
                System.out.println("Taur");
            } else {
                System.out.println(" Zi Invalida !");
            }

        } else if (luna.equalsIgnoreCase("Mai")) {
            if (zi >= 1 && zi <= 20) {
                System.out.println("Taur");
            } else if (zi >= 21 && zi <= 31) {
                System.out.println("Gemeni");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("Iunie")) {
            if (zi >= 1 && zi <= 21) {
                System.out.println("Gemeni");
            } else if (zi >= 22 && zi <= 30) {
                System.out.println("Rac");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("Iulie")) {
            if (zi >= 1 && zi <= 22) {
                System.out.println("Rac");
            } else if (zi >= 23 && zi <= 31) {
                System.out.println("Leu");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("August")) {
            if (zi >= 1 && zi <= 22) {
                System.out.println("Leu");
            } else if (zi >= 23 && zi <= 31) {
                System.out.println("Fecioara");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("Spetembrie")) {
            if (zi >= 1 && zi <= 22) {
                System.out.println("Fecioara");
            } else if (zi >= 23 && zi <= 30) {
                System.out.println("Balanta");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("Octombrie")) {
            if (zi >= 1 && zi <= 22) {
                System.out.println("Balanta");
            } else if (zi >= 23 && zi <= 31) {
                System.out.println("Scorpion");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("Noiembrie")) {
            if (zi >= 1 && zi <= 21) {
                System.out.println("Scorpion");
            } else if (zi >= 22 && zi <= 30) {
                System.out.println("Sagetator");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else if (luna.equalsIgnoreCase("Decembrie")) {
            if (zi >= 1 && zi <= 20) {
                System.out.println("Sagetator");
            } else if (zi >= 21 && zi <= 31) {
                System.out.println("Capricorn");
            } else {
                System.out.println(" Zi Invalida !");
            }
        } else {
            System.out.println("Luna invalida !");
        }
    }
}

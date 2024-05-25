package modul_1_algoritmica.curs1.curs5.temaCurs5;

import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {

        /*
        arie cerc = Pi x (raza*raza)
        perimetru = 2 X Pi x raza
        raza = P / 2 x Pi
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Sa se calculeze perimetrul:"+"\n");
        System.out.print("Raza: ");
        int raza = sc.nextInt();
        System.out.print("Numarul Pi este: ");
        double PI = sc.nextDouble();
        double calculP = 2*PI*raza;
        System.out.println("Perimetrul este egal cu: "+calculP);
        double calculArie = PI*(raza*raza);
        System.out.println("Aria cercului este : "+calculArie);
        double calculRaza = calculP/(2*PI);
        System.out.println("Raza cercului , fara sa stim cat este raza, este egal cu : "+calculRaza);

    }
}

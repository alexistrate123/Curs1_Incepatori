package modul_2_algoritmica1.curs23;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRecap {
    public static void main(String[] args) {
         // Listele sunt asemanatoare cu Array, dar mult mai prietenoase
        //  Pe lista nu o intereseaza numarul de elemente si poti aduaga si sterge oricate elemente vrei !

        // Declararea unei liste goale
        ArrayList<String> service = new ArrayList<>();

        service.add("Mazda");
        service.add("Toyota");
        service.add("Yamaha");

        System.out.println(service);
        // declararea unei liste cu cateva elemente:

        ArrayList<String> service1 = new ArrayList<>(Arrays.asList("Matiz", " Mercedes", "Audi"));
        System.out.println(service1);

        System.out.println("Lista este goala?"+ "  " + service1.isEmpty());

        System.out.println("Lista nu este goala "+ !service1.isEmpty());

        System.out.println("Lista contine Volvo " + service1.contains("Volvo"));
        System.out.println("Lista contine Matiz " + service1.contains("Matiz"));



    }
}

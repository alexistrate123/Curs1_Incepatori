package modul_2_algoritmica1.curs21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayVsArrayList {
    public static void main(String[] args) {


        int[] numberArray = {26, 10, 68, 32, 91};
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(45, 23, 89, 15, 98));

        // Afiseaza elementul de pe pozitia 1 ;


        System.out.println(numberArray[1]);
        System.out.println(numberList.get(1));

        // Afiseaza numarul de elemente ;

        System.out.println("Numarul de elementele al array-ului este de : " + numberArray.length);
        System.out.println("Numarul de elementele al array-ului este de : " + numberList.size()  );

        // Adauga numarul 55 in fiecare ;
        // In array nu se mai pot aduaga elemente !
        // in array list , se pot adauga fara probleme elemente in felul urmator ! ;

        numberList.add(55);
        System.out.println(numberList);

        // adauga intre 89 si 15 cifra 100 ;

        numberList.add(3, 100);
        System.out.println(numberList);

        // adauga inca 5 numere in lista ta;

        numberList.addAll(Arrays.asList(1, 17, 26, 4, 7));
        System.out.println(numberList);

        // adauga inca 3 numere cu - in lista noastra , dupa 100 ;
        numberList.addAll(4, Arrays.asList(-16, -45, -5));
        System.out.println(numberList);

        // Sterge nr 15 ;
        // intr-u array nu se pot scoate  elemente

        numberList.remove((Object)15);
        System.out.println(numberList);

        // Sterge primele 3 elemente din lista ;

        numberList.removeAll(Arrays.asList(45, 23, 89));
        System.out.println(numberList);

        // Sortare
        // Sorteaza si inverseaza;
        Arrays.sort(numberArray);
        // Array nu are metoda de inversare, dar se poate afisa invers (for)


        Collections.sort(numberList);
        System.out.println(numberList);


        Collections.reverse(numberList);
        System.out.println(numberList);


        //A sterge o lista

        numberList.clear();
        System.out.println(numberList);

    }


}

package modul_2_algoritmica1.curs13;

public class Operatori_de_atribuire {
    public static void main(String[] args) {

        int a = 5; // a va avea valoare 5
        System.out.println("a va avea valorea: "+a);
        int b = 10;
        b += 3;
        System.out.println("Operatia de mai sus este echivalenta cu: b = b + 3 ; ( b devine 13 )" );
        // tot ce este in dreapta egalului , se salveaza in stanga egalului !!
        int c = 7;
        System.out.println("C are valoarea: "+c);
        c++; // sau C += 1 ( c = c + 1 ) ;
        System.out.println("Dupa incrementare, C a luat valoare: "+c);
        c += 7 ; // C = C + 7 ;



    }
}

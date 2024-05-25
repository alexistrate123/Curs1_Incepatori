package modul_1_algoritmica.curs1.curs11;

public class Exemplul_8 {
    public static void main(String[] args) {

        /*
        Scrie un program care aduna toate numerele de la 1-10
         */
         int suma = 0 ;
        for (int i = 1; i <= 10 ; i++) {
            suma += i;
            System.out.println("I are valoarea : "+ i );
            System.out.println("Im variabila noastra suma s-a mai adaugat I-ul de mai sus si rezultatul este:  "+suma);
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int produs = 1;
        for (int i = 1; i <= 10 ; i++) {
            produs *= i;
            System.out.println("I are valoare de: " + i);
            System.out.println("In variabila noastra produs s-a inmultit I-ul de mai sus si rezultatul este: " + produs);
            System.out.println();
        }
    }
}

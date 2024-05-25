package modul_1_algoritmica.curs1.curs5;

import java.util.Scanner;

public class Exemplu4 {
    public static void main(String[] args) {
        /*
        Creeaza un progam numit ING Bank
        1. Bine ai venit la  bancomatul ING Bank
        2. Va rog introduceti pin-ul dumneavoastra
        3. Pinul este corect? = true/false
        ( daca este true, care este umatoarea opreatiune pe care doriti sa o efectuati? )
        ( false, reintroduceti pin-ul dumneavoastra )
        4.Afisare sold ( int sold = 5739; )
        5. Doriti sa retrageti numerar?
        6. Raspuns = True/false
        7. Care este suma pe care doriti sa o retrageti ?
        8. 2999
        9. Verificare. Doriti sa retrageti suma de 2999 lei ? ( true )
        10. Suma a fost retrasa cu succes, sold ramas de = 5739-2999.
         */
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bine ai venit la bancomatul ING Bank! ");
        System.out.print("Va rog introduceti pin-ul dumneavoastra: ");
        int pin = sc.nextInt();

        System.out.println("Ati introdus pin-ul "+pin);
        int sold = 5739;
        System.out.println("Afisare sold = "+sold);
        System.out.print("Doriti sa retrageti numerar? ");
        boolean val1 = sc1.nextBoolean();
        System.out.print("Care este suma pe care doriti sa o retrageti? ");
        int suma = sc.nextInt();
        System.out.print("Doriti sa retrageti suma de "+ suma);
        boolean val2 = sc1.nextBoolean();
        System.out.print("Suma a fost retrasa cu succes ! ");
        int soldRamas = sold-suma;
        System.out.println("Sold disponibil = "+ soldRamas);



    }
}

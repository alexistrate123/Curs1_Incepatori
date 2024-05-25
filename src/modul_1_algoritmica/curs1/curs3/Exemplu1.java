package modul_1_algoritmica.curs1.curs3;

public class Exemplu1 {
    public static void main(String[] args) {

        // exemple : printf
        /*
        Declara variabilele : nume, prenume, varsta , oras si afiseaza mesajul ( Salut ma numesc ,... , am ... ani ,
        locuiesc in ....
         */

        String nume = "Istrate-Munteanu";
        String prenume = "Marian Alexandru";

        int varsta = 23;

        String oras = "Tulcea";

        System.out.printf("Salut , ma numesc %s %s si am %d de ani si sunt din orasul %s", nume, prenume, varsta, oras);

        /*
        Masina pe care vreau sa o cumpar este marca ... , model..., anul fabricatiei..., nr. km...., pretul ...(double)

         */
        System.out.println();
        System.out.println();
        String marca = "Mercedes";
        String model = "A class";
        int anulFabricatiei = 2016;
        double nrKm = 59.678;
        double pret = 45.000;
        System.out.printf("Masina pe care vreau sa o cumpar este marca %s %s anul fabricatiei este %d , are %.3f de km , " +
                "iar pretul sau de vanzare este %.3f de euro.", marca, model, anulFabricatiei, nrKm, pret);

        /*
        Pentru a elimina numarul de zecimale , adaugam intre % si litera ce defineste variabila , (.1 / .2 / .3 , etc.)

         */

        /*
        Scrie un program care iti afiseaza tabla inmultirii cu 5
        Ex: tabla inmultirii cu este urmatoarea :
        0 X 5 = 0 ;
         5 care se repeta scris intr-o variabila
         */

        System.out.println();
        int nrN = 5, nr1 = 0, nr2 = 1, nr3 = 2, nr4 = 3, nr5 = 4, nr6 = 5, nr7 = 6, nr8 = 7, nr9 = 8, nr10 = 9,
                nr11 = 10;

        System.out.printf("Tabla inmultirii cu 5 este urmatoarea: " +
                "\n %d X %d = 0  " +
                "\n %d X %d = 5  " +
                "\n %d X %d = 10 " +
                "\n %d X %d = 15 " +
                "\n %d X %d = 20 " +
                "\n %d X %d = 25 " +
                "\n %d X %d = 30 " +
                "\n %d X %d = 35 " +
                "\n %d X %d = 40 " +
                "\n %d X %d = 45 " +
                "\n %d X %d = 50", nr1, nrN, nr2, nrN, nr3, nrN, nr4, nrN, nr5, nrN, nr6, nrN,nr7, nrN, nr8, nrN, nr9,
                nrN, nr10, nrN, nr11, nrN);

        /*
           Scrie un program care calculeaza aria cercului
           A = pi X R (patrat)
           Formula arieri cercului este : A = pi (3.14)  X (raza X raza )
         */
        System.out.println();
        double pi = 3.14;
         int raza = 2;
         int razaLaPatrat = raza*raza;
         double ariaCercului = pi*razaLaPatrat;

        System.out.println("Formula ariei cercului este: A = Pi (3.14) X ( raza (2) X raza (2) )= " + pi*razaLaPatrat );

        System.out.println();

       System.out.printf("Formula ariei cercului este: A = Pi (3.14) X ( raza (2) X raza (2) )= %.2f", ariaCercului);

        System.out.println();
        System.out.println("__________________________________________________________________________________________");
        System.out.println();
        System.out.println("Ne folosim de clasa MATH");
        System.out.println();

        /*
           Scrie un program care calculeaza aria cercului
           A = pi X R (patrat)
           Formula arieri cercului este : A = pi (3.14)  X (raza X raza )
         */

        int raza1 = 2;
        double aria = 3.14*(2*2);
        double aria1 = Math.PI*(2*2);
        double aria2 = Math.PI*Math.pow(raza1, raza1 );

        System.out.println("Aria = "+ aria);
        System.out.println();
        System.out.println("Aria1 = "+ aria1);
        System.out.println();
        System.out.println("Aria2 = "+ aria2);

        double aria3 = Math.sqrt(25);
        System.out.println();
        System.out.printf("Radical din 25 este : %.0f", aria3);








    }
}

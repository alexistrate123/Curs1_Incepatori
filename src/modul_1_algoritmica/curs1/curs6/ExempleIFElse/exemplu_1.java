package modul_1_algoritmica.curs1.curs6.ExempleIFElse;

public class exemplu_1 {
    public static void main(String[] args) {

        /*
        declara o variabila varsta =.. si daca varsta se afla in intervalul { 18-35 } ani
        atunci afiseaza urmatoarele : Numele tau =.. , ai fost recrutat pentru serviciul militar.
        Dca nu ( else ), = Numele tau , felicitari ai scapat de armata.
         */

        String nume = "Alex Munteanu";
        int age = 24;
        if (age >= 18 && age <= 35) {
            System.out.println(nume+" ai fost recrutat pentru serviciul militar.");
        } else {
            System.out.println(nume+" feicitari , ai scapat de armata.");
        }





    }
}

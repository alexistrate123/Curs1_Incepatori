package modul_1_algoritmica.curs1.tema1;

public class Exercitii {
    public static void main(String[] args) {

        // 1.)

        System.out.println("Declara 3 Curs1.variabile de tip int si pune-le valorile 15, 2005, -77");
        System.out.println();

        int numar1 = 15;
        int numar2 = 2005;
        int numar3 = -77;

        System.out.println(numar1+" = prima valoare");
        System.out.println(numar2+" = a doua valoare");
        System.out.println(numar3+" = a treia valoare");
        System.out.println();

        // 2.)

        System.out.println("Declara 3 Curs1.variabile de tip String si pune-le valorile Ana ; are ; mere;");
        System.out.println();

        String nume = "Ana";
        String verb = "are";
        String fructe = "mere";

        System.out.println(nume+" = prima valoare");
        System.out.println(verb+" = a doua valoare");
        System.out.println(fructe+" = a treia valoare");
        System.out.println();


        // 3.)

        System.out.println("Declara 3 Curs1.variabile de tip double si pune-le valorile 0.3 ; 54.99 ; -3.15;");
        System.out.println();

        double numarCuZecimale1 = 0.3;
        double numarCuZecimale2 = 54.99;
        double numarCuZecimale3 = -3.15;

        System.out.println(numarCuZecimale1+" = prima valoare");
        System.out.println(numarCuZecimale2+" = a doua valoare");
        System.out.println(numarCuZecimale3+" = a treia valoare");
        System.out.println();


        // 5.)

        // Sa se afiseze textul: "Salut ( numele tau ) , bine ai venit in sistem!", folosind un String nume;

        String nume1 = "Alex";

        System.out.println("Salut " + nume1 + " , bine ai venit in sistem!");
        System.out.println();

        // 6.) / 7.)

        // Sa se declare 2 Curs1.variabile de tip int num1 / num2 cu valori la alegere
        // - Afiseaza la consola suma si produsul lor;

        int num1 = 4;
        int num2 = 6;

        System.out.println(num1 + num2);
        System.out.println();
        System.out.println(num1 * num2);
        System.out.println();
        System.out.println((num1 + num2) + (num1 * num2) + (num2 * num2) + num1 * (num2 + num1));
        System.out.println();

        // 8.)

        // Declara 5 Curs1.variabile de tip double si apoi afiseaza medila lor;

        double numarZec1 = 1.3;
        double numarZec2 = 1.10;
        double numarZec3 = 2.23;
        double numarZec4 = 3.7;
        double numarZec5 = 3.75;
        double mediaNumerelor = (numarZec1+numarZec2+numarZec3+numarZec4+numarZec5)/5;
        System.out.println("Media numerelor de mai sus este: "+mediaNumerelor);
        System.out.println(mediaNumerelor);
        System.out.println();

        System.out.println((numarZec1+numarZec2+numarZec3+numarZec4+numarZec5)/5);
        System.out.println();


        // 4.)
        // Declara 2 Curs1.variabile de tip boolean si pune-le valorile true si false ;

        boolean myBoolean = true;
        boolean myBoolean1 = false;

        System.out.println(myBoolean);
        System.out.println();
        System.out.println(myBoolean1);
        System.out.println();
        System.out.println();

        // 9.)

        // Declara urmatoarele Curs1.variabile :

        // numeFilm, numeActor1 , numeActor2, dataLansarii , pretBilet, pune-le valori si apoi formeaza o fraza cu ele
        // pe care o vei afisa in consola;

        String numeFilm = "Avatar";
        String numeActor1 = "Charles Monroe";
        String numeActor2 = "Angelina Hostman";
        int dataLansarii = 10;
        int dataLansarii1 = 5;
        int dataLansarii2 = 2024;
        int pretBilet = 64;
        String pretBilet1 =" de lei";

        System.out.println("Astazi "+dataLansarii+"."+dataLansarii1+"."+dataLansarii2+" va avea loc lansarea filmului "
                +numeFilm+" cu actorii principali "+ numeActor1+" si "+numeActor2+" , iar pretul biletului va fi de "
                +pretBilet+pretBilet1+".");
        System.out.println();

        // 10.)
        // Declara urmatoarele Curs1.variabile : numeTara, numeContinent, anotimp, numarPrieteni.
        // Formeaza o fraza cu aceste Curs1.variabile si afiseaza in consola ce ai obtinut;

        String numeTara ="Grecia";
        String numeContinent = "Europa";
        String anotimp = "Vara";
        int numarPrieteni = 3;

        System.out.println(anotimp+" aceasta am ales sa merg cu "+numarPrieteni+" prieteni intr-o vacanta in "
                +numeContinent+" mai exact in "+numeTara+" pentru ca am auzit ca este super buna apa in luna August.");

        // II.)

        // Scrieti un program care afiseaza in consola un brad de Craciun;
         // Bradul trebuie sa aiba - h = 5 randuri ; l = 9 caractere;
         // Bonus* = trunchi cu h = 2 randuri folosind ( | );

        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println("   | |");
        System.out.println("   | |");
        System.out.println();
        System.out.println();

        System.out.println("Sper sa fie bine ce am lucrat");
        System.out.println("Si sper sa fii mandru de munca mea.");
        System.out.println();
        System.out.println();
        System.out.println("Semnat : Alex , invatacelul tau! ");
        System.out.println("                                                 data : 11.11.2023");

    }
}

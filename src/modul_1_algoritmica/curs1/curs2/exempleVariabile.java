package modul_1_algoritmica.curs1.curs2;

public class exempleVariabile {

    public static void main(String[] args) {

        // Exemplu variabila String
        String nume = "Istrate-Munteanu";
        String prenume = "Alexandru Marian";

        System.out.println("Numele meu este "+nume+" "+prenume);

        //Exemplu variabila char ;

        char caracter1 = 'X';
        char caracter2 = '+';

        System.out.println("Concatenarea a doua variabile char : "+" "+caracter1+" "+caracter2);
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(caracter1+caracter2);
        System.out.println("___________________________________________________________________________________________");
        // 4 linii de cod cu numele tau : Alex

        System.out.print('A');
        System.out.print('l');
        System.out.print('e');
        System.out.print('x');
        System.out.println();
        System.out.println();

        // Exemplu variabila boolean;

        boolean imiEsteFoame = true;
        boolean maineESambata = false;

        System.out.println("Imi este foamne : "+imiEsteFoame);
        System.out.println("Oare este maine Sambata? :"+maineESambata);

        // Exemplu variabila int

        int varsta = 23;
        int ziNastere = 15;
        int lunaNastere = 5;
        int anNastere = 2000;

        System.out.println("Salut, sunt nascut la data de "+ziNastere+"."+lunaNastere+"."+anNastere+" si am "+varsta
                +" de ani.");
        System.out.println();
        System.out.println(varsta+anNastere+ziNastere+lunaNastere);

        // Exemplu variabila double

        double numar1 = 1.5;
        double numar2 = 3.5;

        System.out.println("Rezultatul numerelor de mai sus este : "+(numar1+numar2));

        // Exemplu variabila float;

        float numar3 = 3.45123123231313F;
        float numar4 = 2.34123123213123F;

        System.out.println(numar3+numar4);

        // Exemplu variabila long ;

        long numar5 = 4L;
        long numr6 = 2L;

        System.out.println(numar5+numr6);

        // Exemplu variabila byte ;

        byte numar7 = -128;
        byte numar8 = 127;
        System.out.println(numar7+numar8);



    }

}

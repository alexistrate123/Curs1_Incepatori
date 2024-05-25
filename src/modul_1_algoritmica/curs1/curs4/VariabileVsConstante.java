package modul_1_algoritmica.curs1.curs4;

public class VariabileVsConstante {
    public static void main(String[] args) {

        /*
         Variabila:
                    -se poate modifica rezultatul;
                    -
         */


         /*
         Constanta :
                   - Math.PI = nu se poate modifica rezultatul sau ( valoarea );
          */
        double ora;
        String nume = "Marian.";

        System.out.println("Maine ma duc la cursuri cu "+nume);
        System.out.println();
        nume = "Marcel.";
        System.out.println("Poimaine ma duc la curs cu "+nume);
        System.out.println();

        ora = 22.50;
        System.out.printf("Maine la ora %.2f ma duc la curs cu %s", ora, nume);


    }
}

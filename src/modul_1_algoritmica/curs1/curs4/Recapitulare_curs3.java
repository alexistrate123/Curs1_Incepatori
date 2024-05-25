package modul_1_algoritmica.curs1.curs4;

public class Recapitulare_curs3 {
    public static void main(String[] args) {

        /*
        Declara variabilele nume, prenume, varsta, caracterul M , oras, strada, nr casa,
        afiseaza la consola :
        ! cu printF
        Salut, ma nume ... .... am varsta de ... ani, sex ... , locuiesc in orasul ..., strada...., nr... .;

         */

        String nume = "Andrei";
        String prenume = "Jhonson";
        int varsta = 26;
        char sex = 'M';
        String oras = "New York";
        String strada = "Amurgului";
        int nrCasa = 127;

        System.out.printf("Salut, numele meu este %s %s, am varsta de %d de ani, sex %c, si locuiesc in orasul %s, " +
                "strada %s, " + "nr. %d .", nume, prenume, varsta, sex, oras, strada, nrCasa);

        System.out.println();
         double ex1 = 12.23;

        System.out.printf("%.2f", ex1);




    }
}

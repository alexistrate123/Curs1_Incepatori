package modul_1_algoritmica.curs1.curs12.for_strings;

public class Exemplul_1 {
    public static void main(String[] args) {

        String text = "Abracadabra";

        int nrCaractere = text.length();

        System.out.println("Textul "+text+ " are "+nrCaractere+" de caractere. ");

        System.out.println();
        int pozR = text.indexOf('c');
        System.out.println("R se afla pe pozitia "+pozR);
        System.out.println();
        /*
        Scrie un program care parcurge un string si afiseaza fiecare element pe linii diferite;
         */
          String newText = "Caleidoscop";
        for (int i = 0; i <= newText.length()-1 ; i++) {
            System.out.println(newText.charAt(i));
        }




    }
}

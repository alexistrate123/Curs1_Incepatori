package modul_1_algoritmica.curs1;

public class exempluConcatenare2 {
    public static void main(String[] args) {

        // Declara o variabila de tip String cu numele de limbaj de programare
        // Apoi afiseaza la consola : Imi place sa invat:

        String limbajDeProgramare = "Java";

        System.out.println("Imi place sa invat: " + limbajDeProgramare);

        // Declara o varibila de tip String cu nume la alegere
        // O variabila de tip ... numarDeMere
        // sa se afiseze la consola ... are ... mere !

        String nume = "Mario";
        int numarDeMere = 3;

        System.out.println(nume + " are" + " " + numarDeMere + " mere");
        nume = "Ana";
        numarDeMere = 4;
        System.out.println(nume + " are" + " " + numarDeMere + " mere");

        String numeProfesor = "Marius";
        String lucrare_de_control = "ihdoiqhdoqhdoiqhdoqodqoufhquofhuqwfhuqhfuibfuifbvuiqbibfuiegfidifyqbifbdifbvidvbibv" +
                "iqbvibqviqivbiwifbiwqbqdbfibvibvbviqbviwbifbwuifbwuifbuifuifiqwfiwufviwqfbiqwfvqiwwoenojqboqdoqh";
        System.out.println(numeProfesor+" , te rog corecteaza si tu lucrarea asta de control: "+ lucrare_de_control);
        numeProfesor = "Alina";
        System.out.println(numeProfesor+" te rog corecteaza tu lucrarea aceasta de control "+ lucrare_de_control+" pentru" +
                " ca Marius nu a avut timp.");
    }
}

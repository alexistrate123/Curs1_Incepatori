package modul_2_algoritmica1.curs18;

public class ArraysExemplul1 {
    public static void main(String[] args) {
        // Array-ul face parte din Colectii
        // String elev = "Alex";
        String[] elevi = {"Alex","Maria","David","Claudiu","Miruna"};


        //System.out.println(elev);

        // Afisarea unui array la consola
        System.out.println(elevi); // array-urile nu se afiseaza in mod direct la consola

        //Pentru a afisa un aray corect, acesta trebuie parcurs si afisat element cu element

        for (int i = 0; i < elevi.length ; i++) {
            System.out.print(elevi[i]+" ");
        }
        System.out.println();

        // Afisarea array-ului se face intotdeauna cu foreach
        for (String elev : elevi ) {
            System.out.println(elev);
        }
    }
}

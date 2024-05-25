package modul_2_algoritmica1.curs20;

public class CopiereaElementelorInAltArray {
    public static void main(String[] args) {
        // Definirea Array-ului sursa;
        int[] numereSursa = {0, 10, 25, 5, 12, 56, 16, 2};

        // Definirea Array-ului destinatie;
        int[] numereDestinatie = new int[15];

        // Copierea elementelor din array-ul sura in array-ul destinatie;
        for (int i = 0; i < numereSursa.length; i++) {
            //System.out.println(numereSursa[i]);
            numereDestinatie[i] = numereSursa[i];
        }
        // afisarea array-urilor initiale si a celor modificate;
        for (int numar:numereSursa) {
            System.out.print(numar + " ");
        }
        System.out.println();
        for (int numarDestinatie: numereDestinatie) {
            System.out.print(numarDestinatie + " ");
        }
    }
}

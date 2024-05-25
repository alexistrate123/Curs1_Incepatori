package modul_2_algoritmica1.curs20;

public class AfisareaLaConsolaAunuiArrayGol {
    public static void main(String[] args) {

        int[] numere = new int[5];
        numere[1] = 1;
        String[] fructe = new String[5];
        fructe[3] = "pere";
        double[] numereCuZecimale = new double[4];
        numereCuZecimale[3] = 2.15;
        char[] caractere = new char[4];
        caractere[2] = 'B';

        for (int numar : numere) {
            System.out.print(numar + " ");
        }
        System.out.println();
        for (String fruct : fructe) {
            System.out.print(fruct + " ");
        }
        System.out.println();
        for (double numarCuZecimale : numereCuZecimale) {
            System.out.print(numarCuZecimale + " ");
        }
        System.out.println();
        for (char caracter : caractere) {
            System.out.print(caracter + " ");
        }


    }
}

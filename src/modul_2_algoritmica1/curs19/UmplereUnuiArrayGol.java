package modul_2_algoritmica1.curs19;

public class UmplereUnuiArrayGol {
    public static void main(String[] args) {

        char[] nume = {'A', 'l', 'e', 'x' };
        for (char element:nume) {
            System.out.print(element);
        }
        System.out.println();
        // Afisarea unui element dintr-un array
        System.out.println(nume[3]);
        System.out.println();
        System.out.println("______________________________________________________________");
        System.out.println();

        char[] arrayGol = new char[4] ;
        arrayGol[0] = 'A';
        arrayGol[1] = 'l';
        arrayGol[2] = 'e';
        arrayGol[3] = 'x';
        for (char element1: arrayGol) {
            System.out.print(element1);
        }




    }
}

package modul_2_algoritmica1.curs23.temaArrayList;

import java.util.ArrayList;

public class exercitiul6 {
    public static void main(String[] args) {

        ArrayList<String> nume = new ArrayList<>();
        nume.add("Alex");
        nume.add("Gabriel");
        nume.add("Daniel");
        nume.add("Gabriela");
        nume.add("Robert");
        System.out.println(nume);
        nume.add(3, "Ciprian");
        System.out.println(nume);

    }


}


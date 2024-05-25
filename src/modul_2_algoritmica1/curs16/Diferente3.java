package modul_2_algoritmica1.curs16;

import java.util.Scanner;

public class Diferente3 {
    public static void main(String[] args) {

        //Arca lui Noe cu While
        System.out.println("While-------------------------------------------");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int animaleIntroduseInArca = 0;
        while (true) {
            System.out.print("Introdu un animal: ");
            String animal = sc.next();
            if (animal.equalsIgnoreCase("stop")) {
                System.out.println("Programul se va opri!");
                System.out.println("In arca au intrat " + animaleIntroduseInArca + " animale");
                break;
            }
            animaleIntroduseInArca++;
            System.out.println("Ai introdus " + animaleIntroduseInArca + " in arca");
        }

        System.out.println("For------------------------------------------------");

        int animaleIntroduseInArca1 = 0;
        for (;;) {
            System.out.print("Introdu un animal: ");
            String animal = sc.next();
            if (animal.equalsIgnoreCase("stop")) {
                System.out.println("Programul se va opri!");
                System.out.println("In arca au intrat " + animaleIntroduseInArca1 + " animale");
                break;
            }
            animaleIntroduseInArca1++;
            System.out.println("Ai introdus " + animaleIntroduseInArca1 + " in arca");
        }




    }
}

import java.util.Locale;
import java.util.Scanner;

public class NightOut {
    public static void main(String[] args) {
        int drinks = 0;
        final int glasAmount = 250;
        final int sip = 50;
        int currentAmount = 0;
        Scanner s = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Du gehst in eine Bar und der Kellner fragt ob du ein Bier haben möchtest? JA/NEIN");
            answer = s.nextLine();
            answer = answer.toUpperCase();
        }
        while (!(answer.equals("JA") || answer.equals("NEIN")));
        if (answer.equals("JA")) {
            System.out.println("Der Kellner gibt dir ein Bier");
            do {
                System.out.println("Nimmst du einen Schluck? JA/NEIN");
                answer = s.nextLine();
                answer = answer.toUpperCase();
                currentAmount += sip;
                if (currentAmount == 250){
                    drinks ++;
                    currentAmount = 0;
                }
            }
            while (!answer.equals("NEIN"));
            System.out.println("Du hast genug getrunken und gehst Bowling spielen, deine Anzahl an Bier beträgt " + drinks);
        }else {
            System.out.println("Du gehst direkt zur Bowlingbahn");
        }
    }
}

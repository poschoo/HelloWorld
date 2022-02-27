import java.util.Scanner;

public class Festival {
    public static void main(String[] args) {
        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wie alt sind Sie");
            int zahl = s.nextInt();
            boolean darfrein = false;

            if (zahl >= 18) {
                darfrein=true;
                System.out.println("Du bekommst ein grünes Armband");
            } else if (zahl >= 16 && zahl < 18) {
                darfrein=true;
                System.out.println("Du bekommst ein gelbes Armband");
            } else if (zahl >= 4 && zahl <= 15) {
                System.out.println("Hast du eine volljährige Begleitperson mit?");
                boolean yes = s.nextBoolean();
                if (yes == true) {
                    darfrein=true;
                    System.out.println("Du bekommst ein rotes Armband");
                } else {
                    System.out.println("Sie dürfen leider das Festival nicht betreten");
                }
            } else {
                System.out.println("Sie dürfen leider das Festival nicht betreten");
            }
            if (darfrein) {
                System.out.println("Haben Sie ein VIP-Ticket?");
                boolean yes2 = s.nextBoolean();
                if (yes2 == true) {
                    System.out.println("Du hast ein VIP-Ticket und bekommst ein goldenes Armband und Zutritt zum Backstage-Bereich");
                } else {
                    System.out.println("Geniesen Sie das Festival");
                }
            }
        }

    }
}

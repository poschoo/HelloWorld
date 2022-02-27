import java.sql.SQLOutput;
import java.util.Scanner;

public class Zahlentraeume {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte geben Sie hier eine Zahl ein");
        int zahl = s.nextInt();
        switch (zahl) {

            case 0:
                System.out.println("Die Zahl darf nicht 0 sein");
            case 1:
            System.out.println("Die Zahl liegt zwischen 1 und 5");
            case 2:
                System.out.println("Die Zahl liegt zwischen 1 und 5");
            case 3:
                System.out.println("Die Zahl liegt zwischen 1 und 5");
            case 4:
                System.out.println("Die Zahl liegt zwischen 1 und 5");
            case 5:
                System.out.println("Die Zahl liegt zwischen 1 und 5");
            case 6:
                System.out.println("Die Zahl liegt zwischen 6 und 9");
            case 7:
                System.out.println("Die Zahl liegt zwischen 6 und 9");
            case 8:
                System.out.println("Die Zahl liegt zwischen 6 und 9");
            case 9:
                System.out.println("Die Zahl liegt zwischen 6 und 9");
            case 10:
                System.out.println("Jackpot");
            default:
                System.out.println("Die Zahl ist zu groß oder klein");

        }


//        Scanner s = new Scanner(System.in);
//        System.out.println("Bitte geben Sie hier eine Zahl ein");
//        int zahl = s.nextInt();
//        if (zahl <= 5 && zahl >=1) {
//            System.out.println("Die Zahl liegt zwischen 1 und 5");
//        }
//        else if (zahl>=6 && zahl <=9){
//            System.out.println("Die Zahl liegt zwischen 6 und 9");
//        }
//        else if (zahl ==10){
//            System.out.println("Jackpot");
//        }
//        else if (zahl ==0){
//            System.out.println("Die Zahl darf nicht 0 sein");
//        }
//        else{
//            System.out.println("Die Zahl ist zu groß oder klein");
//        }
    }
}

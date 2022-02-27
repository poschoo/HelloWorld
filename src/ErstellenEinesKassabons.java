import javax.swing.*;

public class ErstellenEinesKassabons {
    public static void main(String[] args) {
        String ware1 = "Wurst";
        String ware2 = "Käse";
        String ware3 = "Brot";
        String ware4 = "DVD";
        int anzahlwurst = 3;
        int anzahlkäse = 1;
        int anzahlbrot = 2;
        int anzahldvd = 2;
        double preiswurst = 4.20;
        double preiskäse = 2.30;
        double preisbrot = 2.11;
        double preisdvd = 12.00;
        double gesamtpreis = anzahlwurst * preiswurst + anzahlkäse * preiskäse + anzahlbrot * preisbrot + anzahldvd * preisdvd;
        double brieftasche = 50.00;
        if (brieftasche >= gesamtpreis) {
            System.out.println(ware1 + " " + anzahlwurst + "x" + preiswurst + " " + "EUR");
            System.out.println(anzahlwurst * preiswurst + "EUR");
            System.out.println(ware2 + " " + anzahlkäse + "x" + preiskäse + " " + "EUR");
            System.out.println(anzahlkäse * preiskäse + "EUR");
            System.out.println(ware3 + " " + anzahlbrot + "x" + preisbrot + " " + "EUR");
            System.out.println(anzahlbrot * preisbrot + "EUR");
            System.out.println(ware4 + " " + anzahldvd + "x" + preisdvd + " " + "EUR");
            System.out.println(anzahldvd * preisdvd + "EUR");
            System.out.println("Gesamt " + gesamtpreis + "EUR");
            System.out.println("Gegeben " + brieftasche + "EUR");
            System.out.println("Zurück " + (brieftasche - gesamtpreis) + "EUR");
            System.out.printf("%35.2f EUR %n" ,gesamtpreis);
        }
        else {
            System.out.println("Leider haben Sie zu wenig Geld");
        }

    }
}

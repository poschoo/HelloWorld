public class Autofahren {
    public static void main(String[] args) {
        int car = 3;
        int driver = 4;
        int passenger =6;

        System.out.println("Anzahl Auto: " + car);
        System.out.println("Anzahl Fahrer: " + driver);
        System.out.println("Anzahl Mitfahrer: " + passenger);
        System.out.println("Insgesamt fahren " + (driver+passenger) + " Personen mit.");
        System.out.println("Es bleiben noch " + (driver-car) + " Fahrer übrig, die nicht selbst fahren müssen.");
        System.out.println("Es stehen " + (car*5) + " Gurte zur Verfügung.");
        float driver1 = driver;
        float average = (passenger+driver1)/car;
        System.out.println("Im Durchschnitt fahren pro Auto " + average + " Personen mit.");


    }
}

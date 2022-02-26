public class Strings {
    public static void main (String[] args){
        String test = "HelloWorld!";
        String test1 = "Goodbye!";
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test + " " + test1);

        test = test1;
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test1 + " " + test);

    }
}

package UdemyMasterclass.Section09Arrays.L125_VariableArguments;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello World again!");

        // Split the String
        String[] splitStrings = "Hello World Again!".split(" ");

        // call the method with an Array
        printText(splitStrings);

        System.out.println("»".repeat(25));
        // call the method with a single String
        printText("Hello");
        // call the method with multiple Strings
        printText("Hello ", "World ", "again! and again!");
    }

    /*
    private static void printText(String[] textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
    */

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}

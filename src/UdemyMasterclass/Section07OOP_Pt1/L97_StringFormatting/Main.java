package UdemyMasterclass.Section07OOP_Pt1.L97_StringFormatting;

public class Main {

    public static void main(String[] args) {

        // *************************
        // String Inspection methods
        // *************************

        printInformation("Hello World!");
        System.out.println(">>>>>>>>>");

        printInformation("Here's a lengthier test String");
        System.out.println(">>>>>>>>>");

        // Test an empty string
        printInformation("");
        System.out.println(">>>>>>>>>");

        // Test a string with a blank space
        printInformation("        ");
        System.out.println(">>>>>>>>>");

        // Search for a specific character in a String
        String helloWorld = "Hello World";
        System.out.println("String = " + helloWorld);
        System.out.printf("Index of r is %d %n", helloWorld.indexOf('r'));
        System.out.printf("Index of World is %d %n", helloWorld.indexOf("World"));
        System.out.printf("1st index of l is %d %n", helloWorld.indexOf('l'));
        System.out.printf("Last index of l is %d %n", helloWorld.lastIndexOf('l'));
        System.out.printf("Index of H is %d %n", helloWorld.indexOf('H'));
        System.out.printf("Index of h is %d %n", helloWorld.indexOf('h'));
        System.out.printf("Index of L is %d %n", helloWorld.indexOf('L'));

        // *************************
        // String Comparison methods
        // *************************

        String helloWorldLower = helloWorld.toLowerCase();
        System.out.println(">>>>>>>>>");
        System.out.println();
        System.out.println("1st String = " + helloWorld);
        System.out.println("2nd String = " + helloWorldLower);

        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        System.out.println(">>>>>>>>>");
        if (helloWorld.startsWith("Hello")) {
            System.out.println("1st String starts with \"Hello\"");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("1st String ends with \"World\"");
        }
        if (helloWorld.contains("World")) {
            System.out.println("1st String contains \"World\"");
        }
        if (helloWorld.contains("Hello World")) {
            System.out.println("1st String contains \"World\"");
        }

        System.out.println(">>>>>>>>>");
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Using method contentEquals() in the 1st String");
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.println("String = " + string);
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty!");
        } else if (string.isBlank()) {
            System.out.println("String with blank spaces!");
        } else {
            System.out.printf("First char = %c %n", string.charAt(0));
            System.out.printf("Last char = %c %n", string.charAt(length - 1));
        }
    }
}

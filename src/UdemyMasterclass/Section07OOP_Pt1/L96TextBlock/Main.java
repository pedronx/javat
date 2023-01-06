package UdemyMasterclass.Section07OOP_Pt1.L96TextBlock;

/**
 * Text Block - Introcuced in Java JDK 15
 * https://docs.oracle.com/en/java/javase/15/text-blocks/index.html
 * https://www.baeldung.com/java-text-blocks
 * https://unicode-table.com/en/blocks/general-punctuation/
 *
 * <p> <b>Escape sequences</b></p>
 *  * <pre>
 *     |-----------------|---------------------------------|
 *     | Escape Sequence | Descritpion                     |
 *     |-----------------|---------------------------------|
 *     | \t              | Insert a tab character          |
 *     | \n              | Insert a new line character     |
 *     | \"              | Insert a double quote character |
 *     | \\              | Insert a backslash character    |
 *     |-----------------|---------------------------------|
 */
public class Main {

    public static void main(String[] args) {

        // String literal
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u25E6 Sub Point\n" +
                "\t\t\u25CE Sub Point\n" +
                "\t\t\t\u2042 Extra Point 1\n" +
                "\t\t\t\u26E8 Extra Point 2\n" +
                "\t\t\t\u2720 Extra Point 3";

        System.out.println(bulletIt);
        System.out.println(">>>>>>");

        // Text Block
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u25E6 Sub Point
                        \u25CE Sub Point
                            \u2042 Extra Point 1
                            \u26E8 Extra Point 2
                            \u2720 Extra Point 3""";

        System.out.println(textBlock);
        System.out.println(">>>>>>");

        // Different method to print
        int age = 35;
        System.out.printf("Your age is %d !%n", age); // %n inserts a new line
        System.out.printf("Your age is %f !%n", (float) age); // cast to float
        System.out.printf("Your age is %.2f !%n", (double) age); // cast to double, set precision to 2 decimal points

        int yearOfBirth = 2023- age;
        System.out.printf("%nAge = %d; Birth year = %d !%n%n", age, yearOfBirth);

        for (int i = 1; i <= 10000; i*= 10) {
            System.out.printf("Printing %d %n", i);
        }

        System.out.println(">>>>>>");

        // Set the width of the number = 6 (it becomes right aligned)
        for (int i = 1; i <= 10000; i*= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        System.out.println(">>>>>>");

        // Different method to print
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d ".formatted(age);
        System.out.println(formattedString);
    }
}
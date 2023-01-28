package CodeGym.Level10.L06_WorkingWithStrings;

import java.sql.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Convenience classes for working with strings in Java
 * split()          Split a string into multiple parts. A regular expression that defines a special delimiting string must be passed as an argument.
 * ------------------------
 * StringTokenizer
 *      StringTokenizer name = new StringTokenizer(string, delimiters);
 * ------------------------
 * format()         specify a pattern for assembling a string with data. The general appearance of the command is as follows:
 *                  String name = String.format(pattern, parameters);
 * Specifiers
 * %s   String
 * %d   integer: byte, short, int, long
 * %f   real number: float, double
 * %b   boolean
 * %c   char
 * %t   Date
 * %%   % character
 * ------------------------
 * StringPool       special array for storing strings
 */
public class Main {

    public static void main (String[] args) {

        // split()
        String str = "Good news everyone!";
        String[] strings = str.split("ne");
        System.out.println(Arrays.toString(strings));
        System.out.println();

        // String tokenizer
        str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str,"ne");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
        System.out.println();

        // Task 01
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
        System.out.println();

        // String.format()
        int age = 23, width = 100, height = 30;
        String name = "Johnny";
        System.out.println(String.format("Age=%d, Name=%s", age, name));
        System.out.println(String.format("Width=%d, Height=%d", width, height));
        System.out.println(String.format("Fullname=%s", name));
        System.out.println();

        String s = String.format("a=%d, b=%d, c=%d", 1, 4, 3);
        System.out.println(s);

        // calling specifiers by their order number
        s = String.format("a=%3$d, b=%2$d, c=%d", 11, 12, 13);
        System.out.println(s);
        System.out.println();

        // Task 02
        System.out.println(format("Amigo", 5000));
        System.out.println();

        // Task 03
        String first = new String("CodeGym");
        String second = new String("CodeGym");
        String third = new String("codegym");
        System.out.println("equal(first, second) = " + equal(first, second));
        System.out.println("equal(second, third) = " + equal(second, third));
    }

    /**
     * StringTokenizer
     * Using a StringTokenizer, split the query variable into parts based on the delimiter variable.
     * The maximum possible number of tokens is 6.
     * Example:
     * getTokens("java.util.stream", "\\.") returns the string array {"java", "util", "stream"}
     * Requirements:
     *   . The getTokens(String, String) method needs to use a StringTokenizer.
     *   . The getTokens(String, String) method needs to return a String array filled in accordance with the task conditions.
     */
    public static String[] getTokens(String query, String delimiter) {

        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String array[] = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens() && i < 6)
        {
            String token = tokenizer.nextToken();
            array[i] = token;
            i++;
        }
        return array;
    }

    /**
     * String.format()
     * Make the format(String name, int salary) method return a string like this:
     * My name is <name>. I will earn $<salary> a month.
     * Use the String.format() method to do this.
     * Requirements:
     *   . You need the format(String, int) method to use the String.format() method.
     *   . You need the format(String, int) method to return a string in accordance with the task conditions.
     */
    public static String format(String name, int salary) {
        String phrase = String.format("My name is %s. I will earn $%d a month.", name, salary);

        return phrase;
    }

    /**
     * String pool
     * The equal(String, String) method compares strings by reference using the == operator.
     * You need to make the method return true if the values (contents) of the strings are the same, and false if they are different, without using the equals() method.
     * Requirements:
     *   . You need the equal(String, String) method to compare strings by value, but using the == operator.
     *   . You need the equal(String, String) method to return true if the strings are the same.
     *   . The equal(String, String) method needs to return false if the strings are different.
     *   . You must not use the equals() method.
     */
    public static boolean equal(String first, String second) {

        String[] pool = {first, second};
        if (pool[0].intern() == pool[1].intern()) {
            return true;
        } else {
            return false;
        }
    }

}

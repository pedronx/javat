package CodeGym.Level02;

import java.util.Scanner;

/**
 * Read three lines from the keyboard.
 * And then:
 *   . Display the third line unchanged.
 *   . Display the second line after first converting it to uppercase.
 *   . Display the first line after first converting it to lowercase.
 */
public class L08_T01_ReadingStrings {

    public static void main (String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Insert 3 lines of text, followed by 'Enter'");
        String l1 = console.nextLine();
        String l2 = console.nextLine();
        String l3 = console.nextLine();

        System.out.println(l3);
        System.out.println(l2.toUpperCase());
        System.out.println(l1.toLowerCase());
    }
}

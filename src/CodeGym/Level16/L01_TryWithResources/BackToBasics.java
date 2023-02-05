package CodeGym.Level16.TryWithResources;

import java.util.Scanner;

/**
 * Back to basics
 * The program reads a string from the console and displays it in all uppercase letters.
 * As it turns out, it doesn't work in older versions of Java (older than the 7th version).
 * Without changing the functionality of the program, rewrite the try-with-resources block as an ordinary try-catch statement.
 * Don't forget to call the close() method on objects that use external resources.
 * Requirements:
 *   . The program should read a string from the console and display it in all uppercase letters.
 *   . The program must use a try-catch statement (not try-with-resources) as outlined in the task conditions.
 *   . The close() method must be called in the finally block on objects that use external resources.
 */
public class BackToBasics {

    public static void main(String[] args) {
        /*try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }*/

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}
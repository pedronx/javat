package CodeGym.Level16.TryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Shortening try
 * The program reads a string from the console and displays it in all lowercase letters.
 * Without changing the functionality of the program, rewrite the code using a try-with-resources statement.
 * Put the creation of objects that use external resources inside the parentheses. Remember to remove the unnecessary calls to the close() method.
 * Requirements:
 *   . The program should read a string from the console and display it in all lowercase letters.
 *   . The program must use the try-with-resources statement as outlined in the task conditions.
 *   . The close() method must not be explicitly called on objects that use external resources.
 */
public class ShorteningTry {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

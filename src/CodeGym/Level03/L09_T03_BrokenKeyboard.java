package CodeGym.Level03;

import java.util.Scanner;

/**
 * Broken keyboard
 * Amigo created a secret word to access super secret information, but his keyboard broke and he is no longer able to type uppercase letters. Write a program that will perform a case-insensitive comparison of the input string with the string in the secret variable.
 * If the entered string is equal to the string in the secret variable, the program displays "Access granted". Otherwise, it displays "Access denied".
 * Requirements:
 *   . The program should read a string from the keyboard.
 *   . The Solution class must have a public static String secret variable.
 *   . If the entered string and the string in the secret variable are the same when you ignore the case, then the program should display "Access granted".
 *   . If the entered string and the string in the secret variable are different when you ignore the case, then the program should display "Access denied".
 */
public class L09_T03_BrokenKeyboard {

    public static String secret = "AmIGo";

    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.equalsIgnoreCase(secret)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        /*
        String result = string.equalsIgnoreCase(secret) ? "Access granted" : "Access denied";
        System.out.println(result);
        */
    }
}

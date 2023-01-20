package CodeGym.Level03;

import java.util.Scanner;

/**
 * Let's compare strings
 * Write a program that reads two strings from the keyboard and displays a message indicating whether the strings are the same or different.
 * Requirements:
 *   . The program should read two strings from the keyboard.
 *   . If the strings are the same, then the program should display "The strings are the same".
 *   . If the strings are different, then the program should display "The strings are different".
 */
public class L09_T01_LetsCompareStrings {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if (s1.equals(s2)) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are different");
        }
    }
}

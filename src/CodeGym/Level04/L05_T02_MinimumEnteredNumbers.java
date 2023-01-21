package CodeGym.Level04;

import java.util.Scanner;

/**
 * Minimum of entered numbers
 * The program must read integers from the keyboard until something else is entered, such as a string or a character. Display the minimum number entered. If several numbers are entered, you must display any of them.
 * Example input:
 * 8
 * 4
 * 9
 * 4
 * 5
 * e
 *
 * Example output:
 * 4
 * Requirements:
 *   . The program should read numbers from the keyboard.
 *   . The program should display a number on the screen.
 *   . The program should display the smallest integer entered.
 *   . If several minimum numbers are entered, then you need to display any one of them.
 *   . If only one non-numeric character is entered, then display the maximum possible value for an int.
 *   . You need to read data from the keyboard in a while loop.
 */
public class L05_T02_MinimumEnteredNumbers {

    public static void main (String[] arhgs) {

        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE, x = 0;

        while (console.hasNextInt()) {

            x = console.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}

package CodeGym.Level04;

import java.util.Scanner;

/**
 * Maximum of entered numbers
 * The program must read integers from the keyboard until something else is entered, such as a string or a character. Display the maximum even number entered. If several numbers are entered, you must display any of them.
 * Example input:
 * 8
 * 9
 * 8
 * 4
 * 5
 * e
 * Example output:
 * 8
 * Requirements:
 *   . The program should read numbers from the keyboard.
 *   . The program should display a number on the screen.
 *   . The program should display the maximum even number of the integers entered.
 *   . If several maximum even numbers are entered, then you need to display any one of them.
 *   . If there is no even number among the entered characters, or only one non-numeric character is entered, then display the minimum possible value for an int.
 *   . You need to read data from the keyboard in a while loop.
 */
public class L05_T01_MaximumEnteredNumbers {

    public static void main (String[] args) {

        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE, x = 0;

        while (console.hasNextInt()) {

            x = console.nextInt();
            if (x > max && x % 2 == 0) {
                max = x;
            }
        }
        System.out.println(max);
    }
}

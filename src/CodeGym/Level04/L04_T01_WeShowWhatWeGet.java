package CodeGym.Level04;

import java.util.Scanner;

/**
 * We show what we get
 * We enter data from the keyboard and immediately display it on the screen until the word "enough" is entered.
 * Do not output the word "enough".
 * To do this, you need to use an infinite loop (while(true)).
 * Hint: To terminate an infinite loop, use a break statement.
 * Requirements:
 *   . The program should read data from the keyboard.
 *   . The program must use a while loop.
 *   . To terminate an infinite loop, you need to use a break statement.
 *   . The program should display all the entered data, each read line on a new line, until the word "enough" is entered.
 */
public class L04_T01_WeShowWhatWeGet {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("enough")) {
                break;
            } else {
                System.out.println(userInput);
            }
        }
    }
}

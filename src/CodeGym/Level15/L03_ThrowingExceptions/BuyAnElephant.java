package CodeGym.Level15.L03_ThrowingExceptions;

import java.util.Scanner;

/**
 * Buy an elephant
 * Figure out what the program does.
 * In the catch block, display the answer variable and rethrow the caught exception.
 * Requirements:
 *   . After you enter "OK" from the keyboard, the program should end with a SecurityException.
 *   . In the catch block, the answer variable should be displayed such that all previously entered lines are displayed in reverse order after "OK" is entered on the keyboard.
 *   . The catch block should throw the caught exception, not a new one.
 */
public class BuyAnElephant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Buy an elephant");
        } else if (answer.toLowerCase().equals("OK")) {
            System.out.println("That's better :) List of your excuses: ");
            throw new SecurityException();
        } else {
            System.out.println("Everyone says \"" + answer + "\", but you say to buy an elephant");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            // throw e;
        }
    }
}

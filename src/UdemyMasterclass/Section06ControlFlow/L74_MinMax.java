package UdemyMasterclass.Section06ControlFlow;

import java.util.Scanner;

/**
 * Min and Max Challenge
 * Use an endless loop which:
 *    . Prompts the user to enter a number, or a character to quit.
 *    . Validates if the user-enetered data really is a number (you can choose integer od double validation).
 *    . If the user-enetered data is not a number, quit the loop.
 *    . Keep track of the minimum number entered.
 *    . Keep track of the maximum number entered.
 * If the user has previously enetered a set of numbers (or even just one),
 * display the minimum and maximum number, which the user entered.
 */
public class L74_MinMax {

    public static void main(String[] args) {

        minAndMAx();
    }

    public static void minAndMAx() {

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        boolean validData = false;
        int min = 0, max = 0, count = 1, validNumber = 0;
        String number;

        do {
            // catch the exceptions if user enters invalid input
            try {
                System.out.print("Please enter a valid number (or character to exit): ");
                number = scanner.nextLine();
                validNumber = Integer.parseInt(number);

                /* 1st implementation / validation
                if (count == 1) {
                    min = validNumber;
                    max= validNumber;
                } else if (validNumber < min) {
                    min = validNumber;
                } else if (validNumber > max) {
                    max = validNumber;
                } */

                // Optimized validation
                if (count == 1 || validNumber < min) {
                    min = validNumber;
                }
                if (count == 1 || validNumber > max) {
                    max = validNumber;
                }

                validData = true;
                count++;
            } catch (NumberFormatException badUserData) {
                validData = false;
            }
        } while (validData);

        if (count != 1) {
            System.out.println("\nThe minimum number entered was: " + min);
            System.out.println("The maximum number entered was: " + max);
        }
        System.out.println("\nThank you for using the application. Goodbye!");
    }
}

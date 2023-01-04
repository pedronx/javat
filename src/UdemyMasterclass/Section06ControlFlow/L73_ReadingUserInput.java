package UdemyMasterclass.Section06ControlFlow;

import java.util.Scanner;

/**
 * Reading User Input Challenge
 * Read 5 valid numbers from the console, entered by the user, and print the sum of those 5 numbers
 * Check that the numbers entered are valid integers.
 * If not, print out the message "Invalid number" to the console, and countinue looping, util you have the 5 valid numbers.
 * Before the user enters each number, prompt them with the message, "Ente number #x: ", where x represents the count 1, 2, 3, etc.
 */
public class L73_ReadingUserInput {
    public static void main (String[] args) {

        fiveValidNumbers();
    }

    public static void fiveValidNumbers() {

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);
        int count = 1, sum = 0, validNumber = 0;

        do {
            System.out.print("Enter number #" + count + ": "); // positive integers only
            String number = scanner.nextLine();

            validNumber = checkData(number);

            if (validNumber < 0) {
                System.out.println("Invalid Value! PLease try again.");
            } else {
                count += 1;
                sum += validNumber;
            }
        } while (count < 6);


        System.out.println("\nThe sum of the 5 numbers is = " + sum);
    }

    // Validate data entered by user
    public static int checkData(String number) {

        // catch the exceptions if user enters invalid input
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException badUserData) {
            return -1;
        }
    }

}

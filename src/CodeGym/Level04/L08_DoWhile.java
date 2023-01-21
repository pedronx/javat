package CodeGym.Level04;

import java.util.Scanner;

/**
 * do-while loop
 */
public class L08_DoWhile {

    public static void main (String[] args) {

        neverTooMuch(); // Task 01
    }

    /**
     * There's never too much of a good thing
     * In this task, you need to:
     *   . Use the keyboard to read a string and a number (number variable) that is greater than 0 and less than 5.
     *   . Display the string number times using a do-while loop. Display each value on a new line.
     * If the value read in for the number variable is less than or equal to 0 or greater than or equal to 5,
     * then the entered string must be displayed once.
     * Example input:
     * abc
     * 2
     * Example output:
     * abc
     * abc
     * Requirements:
     *   . The program should read data from the keyboard.
     *   . The program should display data on the screen.
     *   . The program should display the string number times.
     *   . The program should display the string once if number is less than or equal to 0 or greater than or equal to 5.
     *   . The program must use a do-while loop.
     */
    public static void neverTooMuch() {

        Scanner console = new Scanner(System.in);

        String userString = console.nextLine();
        int userNumber = console.nextInt();
        int start= 0;

        if (userNumber > 0 && userNumber < 5) {
            do {
                System.out.println(userString);
                start++;
            } while(start < userNumber);
        } else {
            System.out.println(userString);
        }
    }
}

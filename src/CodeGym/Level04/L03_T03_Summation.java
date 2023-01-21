package CodeGym.Level04;

import java.util.Scanner;

/**
 * Summation
 * Let's write a program that reads integers from the keyboard and calculates their sum until the user enters the word "ENTER".
 * Display the sum and terminate the program.
 * Requirements:
 *   . The program should read data from the keyboard.
 *   . You need to calculate the sum of the entered integers and display it on the screen, if the user enters the stop word.
 *   . The program must use a while loop.
 */
public class L03_T03_Summation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        String userInput;

        while(!isExit) {
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("ENTER")) {
                isExit = true;
            } else {
                sum += Integer.parseInt(userInput);
            }
        }
        System.out.println(sum);
    }
}

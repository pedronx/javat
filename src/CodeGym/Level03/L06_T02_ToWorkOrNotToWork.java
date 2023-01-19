package CodeGym.Level03;

import java.util.Scanner;

/**
 * Let's write a program that will read an age from the keyboard. If the age is in the range from 20 to 60 (inclusive), then don't display anything. Otherwise, display the phrase "You don't have to work". You can (and must!) do this with only one if statement (without an else block).
 * Hint: use the || (OR) boolean operator.
 * Requirements:
 *   . The program should read one number from the keyboard.
 *   . If the age is less than 20 or more than 60, then you need to display the phrase "You don't have to work".
 *   . If the age is in the range from 20 to 60 (inclusive), then don't display anything.
 *   . The program must use a single if statement without an else block and must use the || logical operator.
 */
public class L06_T02_ToWorkOrNotToWork {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        int age = s.nextInt();

        if (age < 20 || age > 60) {
            System.out.println("You don't have to work");
        }
    }
}

package CodeGym.Level03;

import java.util.Scanner;

/**
 * There is a program that takes an age as input and determines whether you need to head to school or to college. But it doesn't work correctly. For example, a five-year-old child is sent off to college! It isn't difficult to fix the program: just put curly braces in the right place.
 * >>>
 * Requirements:
 *   . The program should read a number from the keyboard.
 *   . The program must use the System.out.println() or System.out.print() command.
 *   . If the age is less than 18 and greater than or equal to 6, you should display only "Off to school with you, my child".
 *   . If the age is greater than or equal to 18, you should display only "Your college class starts soon".
 *   . If the age is less than 6, then don't display anything.
 */
public class L04_T01_SchoolOrCollege {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age < 18) {
            if (age >= 6) {
                System.out.println("Off to school with you, my child");
            }
        } else {
                System.out.println("Your college class starts soon");
        }
    }
}

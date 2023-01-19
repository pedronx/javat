package CodeGym.Level03;

import java.util.Scanner;

/**
 * Use the keyboard to enter the outside temperature.
 * If the temperature is less than 0, display "It's cold outside".
 * Otherwise, display "It's warm outside".
 * Requirements:
 *   • The program should read the temperature from the keyboard.
 *   • The program must use the System.out.println() or System.out.print() command.
 *   • If the temperature is less than 0, display only "It's cold outside".
 *   • If the temperature is greater than or equal to 0, display only "It's warm outside".
 */
public class L03_T01_WarmOrCold {

    public static void main (String[] args) {

        String cold = "It's cold outside";
        String warm = "It's warm outside";

        Scanner s = new Scanner(System.in);

        System.out.print("Please type the current outside temperature: ");
        int temp = s.nextInt();

        if (temp < 0) {
            System.out.println("It's cold outside");
        } else {
            System.out.println("It's warm outside");
        }
    }
}

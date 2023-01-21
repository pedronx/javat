package CodeGym.Level03;

import java.util.Scanner;

/**
 * High accuracy
 * Write a program that reads two real numbers from the keyboard and reports whether these numbers are equal to within one one-millionth.
 * Requirements:
 *   . The program should read two number from the keyboard.
 *   . If the numbers are equal, then the program should display "The numbers are equal".
 *   . If the numbers are not equal, then the program should display "The numbers are not equal".
 *   . The comparison should be accurate to one one-millionth (0.000001).
 */
public class L07_T03_HighAccuracy {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();

        if (Math.abs(d2 - d1) < 0.000001) {
            System.out.println("The numbers are equal");

        } else {
            System.out.println("The numbers are not equal");
        }
    }
}

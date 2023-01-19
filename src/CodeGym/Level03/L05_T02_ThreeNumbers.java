package CodeGym.Level03;

import java.util.Scanner;

/**
 * Use the keyboard to enter three integers. Determine whether there is at least one pair of equal numbers among them.
 * If such a pair exists, display the numbers separated by spaces. If all three numbers are equal, then display all three.
 * >>>
 * Examples:
 * a) if we enter the numbers 1 2 2, then the output we get is 2 2
 * b) if we enter the numbers 2 2 2, then the output we get is 2 2 2
 * >>>
 * Requirements:
 *   . The program should read three number from the keyboard.
 *   . The program must contain System.out.println() or System.out.print().
 *   . If two numbers are equal, you need to display them on the screen.
 *   . If all three numbers are equal, you need to display all three.
 *   . If none of the numbers are equal, then display nothing.
 */
public class L05_T02_ThreeNumbers {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        if (n1 == n2 && n1 == n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 == n2) {
            System.out.println(n1 + " " + n2);
        } else if (n2 == n3) {
            System.out.println(n2 + " " + n3);
        } else if (n1 == n3) {
            System.out.println(n1 + " " + n3);
        }
    }
}

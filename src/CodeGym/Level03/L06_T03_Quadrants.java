package CodeGym.Level03;

import java.util.Scanner;

/**
 * Enter two integers from the keyboard that will be the coordinates of a point. The first number is the x coordinate, and the second is the y coordinate). The point must not lie on the X or Y axes.
 * Display the number of the quadrant that contains the given point.
 * Hint:
 * Point (x, y) belongs to a quadrant if the following conditions are true:
 *     for the first quadrant — x > 0 and y > 0;
 *     for the second quadrant — x < 0 and y > 0;
 *     for the third quadrant — x < 0 and y < 0;
 *     for the fourth quadrant — x > 0 and y < 0.
 * >>>
 * Example for the numbers 4 6:
 * 1
 * Example for the numbers -6 -6:
 * 3
 * >>>
 * Requirements:
 *   . The program should read two number from the keyboard.
 *   . The program must use the System.out.println() or System.out.print() command.
 *   . If the point is in the first quadrant, display "1".
 *   . If the point is in the second quadrant, display "2".
 *   . If the point is in the third quadrant, display "3".
 *   . If the point is in the fourth quadrant, display "4".
 */
public class L06_T03_Quadrants {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }
    }
}

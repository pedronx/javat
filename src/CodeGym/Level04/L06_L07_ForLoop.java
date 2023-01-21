package CodeGym.Level04;

import java.util.Scanner;

public class L06_L07_ForLoop {

    public static void main (String[] args) {

        // evennumbers(); // Task 01
        // sumEvenNumbers(); // Task 02
        drawTriangle(); // Task 03
    }

    /**
     * Task 1: Even numbers
     * Write a program that uses a for loop to display the even numbers in the range from 1 to 15.
     * Each value should be displayed on a new line.
     * Requirements:
     *   . The program should display text on the screen.
     *   . The program should display even numbers from 1 to 15. Display each value on a new line.
     *   . The program must use a for loop.
     */
    public static void evennumbers() {

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Sum of even numbers
     * The main method reads 3 integers from the keyboard: start, end, and multiple.
     * Update the program so that the screen displays the sum of multiples of multiple variable in the range from start (inclusive) to end (not inclusive).
     * Use a for loop to do this.
     * Requirements:
     *   . The program should display the sum of multiples of the multiple variable in the range from start (inclusive) to end (not inclusive).
     *   . The program must use a for loop.
     */
    public static void sumEvenNumbers() {

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        System.out.println("Multiples of " + multiple + ":");
        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("\nSum: " + sum);
    }

    /**
     * Drawing a triangle
     * Let's use a for loop to display a right triangle comprised of numeral eights with sides (legs) of 10 and 10.
     * In other words, the first line should contain one 8, forming the left side. The second line should have two 8s, etc.
     * Example screen output:
     * 8
     * 88
     * 888
     * 8888
     * 88888
     * 888888
     * 8888888
     * 88888888
     * 888888888
     * 8888888888
     * Requirements:
     *   . The program should display numbers on the screen.
     *   . The program should display a right triangle comprised of numeral eights with sides 10 and 10.
     *   . The program must use a for loop.
     *   . The screen output should happen in a for loop.
     */
    public static void drawTriangle() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= i) {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}

package CodeGym.Level04;

import java.util.Scanner;

/**
 * Math.round() method rounds a number to the nearest integer.
 * Math.ceil() method rounds a number up to an integer.
 * Math.floor() method rounds a number down to an integer.
 *
 */
public class L09_10_RealNumbers {

    public static void main (String[] args) {

        // areaCircle(); // Task 01
        // shareCoke(); // Task 02
        // windSpeed(); // Task 03
        glass(); // Task 04
    }

    /**
     * Area of a circle
     * To solve this task, you need to:
     *   . Read a positive radius integer from the keyboard. This represents the radius of a circle.
     *   . Display the area of the circle, calculated using this formula: Area = pi * radius * radius.
     * The result should be an integer (int type). To do this, you need to cast the multiplication result to an int (discard the fractional part, rounding down to an integer).
     * Use 3.14 as the value for pi.
     * Clarification:
     * If a negative number was entered, then don't display anything on the screen.
     * Example input:
     * 5
     * Example output:
     * 78
     * Requirements:
     *   . The program should read an integer from the keyboard.
     *   . The program should display a number on the screen.
     *   . The program should display the area of the circle with a radius equal to the radius variable. The area must be converted to an integer.
     */
    public static void areaCircle() {

        Scanner console = new Scanner(System.in);

        int radius = console.nextInt();
        if (radius > 0) {
            double pi = 3.14;
            int area = (int) (pi * radius * radius);
            System.out.println(area);
        }
    }

    /**
     * Share a Coke
     * Let's share a case of icy cola at the office. To do this, we will write a program with these requirements:
     *   . You need to read two integers from the keyboard.
     *   . The first number is the number of cola cans in a case.
     *     The second is the number of people at the office.
     *   . Display the result of dividing the first number by the second.
     * The result should be a real number.
     * Example input:
     * 3
     * 2
     * Example output:
     * 1.5
     * Requirements:
     *   . The program should read integers from the keyboard.
     *   . The program should display a number on the screen.
     *   . The program should display a real number — the result of dividing the first integer entered by the second.
     */
    public static void shareCoke() {

        Scanner console = new Scanner(System.in);
        int numberOfCans = console.nextInt();
        int numberOfPeople = console.nextInt();

        double sharedCoke = (numberOfCans * 1.0) / numberOfPeople;
        System.out.println(sharedCoke);
    }

    /**
     * Wind speed
     * Scientists express wind speed in m/s, but that figure doesn't always adequately convey its strength to laypersons.
     * For the untrained, it's easier to understand it when measured in km/h, like a car, bicycle or other form of transportation.
     * So let's convert speed values from m/s to km/h.
     * To get the initial wind speed value in m/s, you need to read it as an integer from the keyboard.
     * The ratio for converting speeds is: 1 m/s = 3.6 km/h.
     * Display wind speed in km/h rounded to the nearest integer.
     * For rounding, use the Math.round() method.
     * Requirements:
     *   . The program should read integers from the keyboard.
     *   . The program should display a number on the screen.
     *   . The program should display an integer — the result of rounding the product of multiplying the entered integer and 3.6.
     *   . The program must use the Math.round() method.
     */
    public static void windSpeed() {

        Scanner console = new Scanner(System.in);
        int speed = console.nextInt();

        // 1m/s = 3.6 Km/h
        System.out.println(Math.round(speed * 3.6));
    }

    /**
     * Is the glass half empty or half full?
     * The main() method has a double glass variable equal to 0.5, which symbolizes a half-filled glass. For the pessimist, it is half empty. For the optimist, it is half full.
     * You need to read a boolean from the keyboard using the nextBoolean() method on a Scanner object. Depending on the input data, round the glass variable: down (to 0) if we're dealing with a pessimist (false) or up (to 1) if we're dealing with an optimist (true).
     * Display the result on the screen.
     * Example input:
     * true
     * Example output:
     * 1
     * Hint:
     * To round a real number down, use the Math.floor() method. To round up, use the Math.ceil() method.
     * Requirements:
     *   . The program must read a boolean from the keyboard.
     *   . The program should display an integer number on the screen according to the task conditions.
     *   . The program must use the Math.floor() method.
     *   . The program must use the Math.ceil() method.
     */
    public static void glass() {

        double glass = 0.5;

        Scanner console = new Scanner(System.in);
        boolean isHalf = console.nextBoolean();

        if (isHalf) {
           System.out.println((int)Math.ceil(glass));
        } else {
            System.out.println((int)Math.floor(glass));
        }
    }
}

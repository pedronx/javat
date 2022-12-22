package UdemyMasterclass.Section05ExpressionsStatements;
import static java.lang.Math.PI;

/**
 * Area Calculator
 * 1. Write a method named area with one double parameter named radius.
 *    The method needs to return a double value that represents the area of a circle.
 *    If the parameter radius is negative then return 1.0 to represent an invalid value.
 * 2. Write another overloaded method with 2 parameters x and y (both doubles),
 *    where x and y represent the sides of a rectangle.
 *    The method needs to return an area of a rectangle.
 *    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
 * >>>
 * TIP: The formula for calculating the area of a rectangle is x * y.
 * TIP: The formula for calculating a circle area is radius * radius * PI.
 * TIP: For PI use a constant from Math class e.g. Math.PI
 * >>>
 * Examples of input/output:
 *    . area(5.0); should return 78.53975
 *    . area(-1); should return -1 since the parameter is negative
 *    . area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
 *    . area(-1.0, 4.0); should return -1 since first the parameter is negative
 * >>>
 * NOTE: The method isLeapYear needs to be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a main method to solution code.
 */
public class L54_Ex09_AreaCalculator {

    public static void main (String[] args) {

        System.out.println("area(5.0) = " + area(5.0));
        System.out.println("area(-1) = " + area(-1));
        System.out.println("area(5.0, 4.0) = " + area(5.0, 4.0));
        System.out.println("area(-1.0, 4.0) = " + area(-1.0, 4.0));
    }

    /**
     * Area Circle
     * The method needs to return a double value that represents the area of a circle.
     * If the parameter radius is negative then return 1.0 to represent an invalid value.
     */
    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }

        return (radius * radius * PI);
    }

    /**
     * Area Rectangle
     * Overloaded method where x and y represent the sides of a rectangle.
     * The method needs to return an area of a rectangle.
     * If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
     */
    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;
        }

        return (x * y);
    }
}

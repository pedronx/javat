package CodeGym.Level09;

import java.util.Scanner;

import static java.lang.Math.toRadians;

/**
 * Method 	              | Description
 * -----------------------|--------------
 * double sin(double d)   | Returns the sine of the angle d, in radians
 * double cos(double d)   | Returns the cosine of the angle d, in radians
 * double tan(double d)   | Returns the tangent of the angle d, in radians
 * double asin(double d)  | Returns the arcsine
 * double acos(double d)  | Returns the arccosine
 * double atan(double d)  | Returns the arctangent
 * double sinh(double d)  | Returns the hyperbolic sine
 * double cosh(double d)  | Returns the hyperbolic cosine
 * double tanh(double d)  | Returns the hyperbolic tangent
 * -----------------------------------------------
 * Math.sin(), Math.cos() and Math.tan() methods take an angle expressed in radians.
 * To convert an angle from degrees to radians and vice versa, the Math class offers two special methods:
 * double toRadians(double angdeg)  | Converts an angle from degrees to radians
 * double toDegrees(double angrad)  | Converts an angle from radians to degrees
 * -----------------------------------------------
 * Math class also has two constant variables (static fields of the class):
 * double Math.PI   | The "Pi" constant is equal to 3.141592653589793
 * double Math.E    | The "E" constant is equal to 2.718281828459045
 * -----------------------------------------------
 * Algebraic Functions
 * Method 	                | Description
 * -------------------------|--------------
 * double sqrt(double a)    | square root of a
 * double cbrt(double a) 	| cubic root of a
 * double exp(double a)		| exponential (Euler's number raised to a power): ea
 * double log(double a)		| natural logarithm of a: ln(a)
 * double log10(double a)	| base-10 logarithm of a: log10(a)
 * double log1p(double x)	| natural logarithm of x + 1: ln(x + 1)
 * double expm1(double x)	| ex-1
 * double pow(double a, double b)	| exponentiation: ab
 * -----------------------------------------------
 * min(a, b)    | returns the minimum of two numbers
 * max(a, b)    | returns the maximum of two numbers
 * Ex. Math.min(Math.min(a, b), Math.min(c, d)) //minimum of several numbers
 */
public class L01_MathClass {

    /*--- Lesson 01 | Task 00 ---*/
    public static int N = 10;

    public static void main(String[] args) {

        // Lesson 01 | Task 00
//        for (int i = 0; i < 10 * N; i++)
//        {
//            double x = i * 1.0 / N;
//            double y = Math.sin(x);
//            drawValue(y);
//        }


        // Lesson 01 | Task 01
//        System.out.println(sin(5.0));
//        System.out.println(cos(10.5));
//        System.out.println(tan(20.0));

        // Lesson 01 | Task 02
//        System.out.println(sqrt(25));
//        System.out.println(cbrt(27));
//        System.out.println(pow(10, 10));

        // Lesson 01 | Task 03
        smallestElementArray();
    }

    /**
     * Draw Value
     * Example method in lesson 01
     */
    public static void drawValue(double y)
    {
        int value = (int) (y * N) + N;
        for (int i = 0; i < 2 * N; i++)
        {
            char c = i == N ? '|': '.';
            if (i == value)
                c = '*';
            System.out.print(c);
        }
        System.out.println();
    }

    /**
     * Utility class: part 1
     * Implement sin(double), cos(double), and tan(double) methods that respectively return the sine, cosine, and tangent of the angle passed as an argument. The angle is given in degrees.
     * The corresponding methods of the Math class, which take an angle specified in radians, will help you accomplish this task.
     * Requirements:
     *   . Implement the sin(double) method in accordance with the task conditions.
     *   . Implement the con(double) method in accordance with the task conditions.
     *   . Implement the tan(double) method in accordance with the task conditions.
     */
    public static double sin(double a) {

        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {

        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {

         return Math.tan(Math.toRadians(a));
    }

    /**
     * Utility class: part 2
     * Use methods of the Math class to correct the methods of the Solution class:
     *   . sqrt(double) should return the square root of the input parameter.
     *   . cbrt(double) should return the cube root of the input parameter.
     *   . pow(int, int) should return the value of the first parameter raised to the power of the second parameter.
     * Requirements:
     *   . Implement the sqrt(double) method in accordance with the task conditions.
     *   . Implement the cbrt(double) method in accordance with the task conditions.
     *   . Implement the pow(int, int) method in accordance with the task conditions.
     */
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {

        return Math.pow(number, power);
    }

    /**
     * Smallest element of an array
     * In this task, you need to:
     *   . Read 10 numbers from the console and use them to populate an array using the getArrayOfTenElements() method.
     *   . Find and return the smallest element of an array using the min(int[]) method.
     * The min(int[]) method must use the Math.min(int, int) method.
     * Requirements:
     *   . The program should read numbers from the keyboard.
     *   . The Solution class should have only three methods.
     *   . The getArrayOfTenElements() method should read 10 numbers from the keyboard and then return an array of 10 elements, populated with the read numbers.
     *   . The min(int[]) method should use the Math class's min(int, int) method to return the smallest element of the array.
     *   . The main() method should call the getArrayOfTenElements() method.
     *   . The main() method should call the min(int[]) method.
     */
    public static void smallestElementArray() {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {

        return Math.min(Math.min(Math.min(Math.min(Math.min(ints[0], ints[1]),
                Math.min(ints[2],ints[3])), Math.min(Math.min(ints[4], ints[5]),
                Math.min(ints[6],ints[7]))), ints[8]), ints[9]);
    }

    public static int[] getArrayOfTenElements() {

        Scanner console = new Scanner(System.in);
        int [] elements = new int[10];
        for (int i = 0; i < 10; i ++) {
            elements[i] = console.nextInt();
        }

        return elements;
    }
}

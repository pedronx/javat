package CodeGym.Level12.L04_StaticClasses;

/**
 * Calculator utility
 * Let's refactor the code and separate out the utility methods.
 * To do this, create an static nested Calculator class and move the add, subtract, multiply and divide methods into it.
 * Don't forget to correct the calls to these methods.
 * Requirements:
 *   . Create a static nested Calculator class in the Solution class.
 *   . The add, subtract, multiply and divide methods need to be moved to the Calculator class.
 *   . The add, subtract, multiply and divide methods of the Calculator class should be called in the main method.
 */
public class MainCalculator {

    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    public static class Calculator {

        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}

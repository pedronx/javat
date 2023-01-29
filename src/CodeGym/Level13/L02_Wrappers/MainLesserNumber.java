package CodeGym.Level13.L02_Wrappers;

/**
 * The lesser number
 * This program compares two numbers. If the first number is less than the second number, then the following message is displayed on the console: The first number is less than the second number.
 * If the first number is greater than or equal to the second number, then the following message is displayed on the console: The first number is greater than or equal to the second number.
 * But at the moment the program terminates with an error. Find out what is wrong and fix the error.
 * The main() method is not involved in testing.
 * Requirements:
 *   . If the first number is greater than the second, then the isLess(int, int) method should return false.
 *   . If the first number is less than the second, then the isLess(int, int) method should return true.
 */
public class MainLesserNumber {

    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The first number is greater than or equal to the second number.");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second ? true : false;
    }
}

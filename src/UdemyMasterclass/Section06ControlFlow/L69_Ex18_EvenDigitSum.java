package UdemyMasterclass.Section06ControlFlow;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * >>>
 * EXAMPLE INPUT/OUTPUT:
 *     getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 *     getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 *     getEvenDigitSum(-22); → should return -1 since the number is negative
 * >>>
 * NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a main method to the solution code.
 */
public class L69_Ex18_EvenDigitSum {

    public static void main(String[] args) {
        System.out.println("getEvenDigitSum(0) = " + getEvenDigitSum(0));
        System.out.println("getEvenDigitSum(123456789) = " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252) = " + getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(5) = " + getEvenDigitSum(5));
        System.out.println("getEvenDigitSum(-22) = " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int lastDigit = 0, sum = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            lastDigit = number % 10;

            if (isEven(lastDigit)) {
                sum += lastDigit;
            }

            number = number / 10;
        }
        return sum;
    }

    public static boolean isEven(int number) {
        if (number == 0){
            return false;
        }
        return number % 2 == 0;
    }
}

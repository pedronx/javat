package UdemyMasterclass.Section06ControlFlow;

/**
 * Digit Sum Challenge
 * Write a method named sumDigits, that has a single parameter named number,
 * of type int, and it should return an int.
 * The method should only take a number that is a positive number.
 * If a negative number is passed, it should return -1, meaning an invalid value was passed.
 * The method shouldparse out each digit from the number, and sum the digits up.
 * Ex. if the value is 125, the code should sum each digit, 1 + 2 + 5, and return 8 as a value.
 * if the value is 1000, the code should sum each digit, 1 + 0 + 0 + 0, and return 1 as a value.
 * if the number is a single digit number, simply return the number itself as the result.
 * TIP: To extract the least significant digit (right most digit), use n % 10
 * TIP: Use n = n/10 to drop the last digit while looping
 */
public class L66_ChallengeDigitSum {

    public static void main (String[] args) {

        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(50));
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(995));
        System.out.println(sumDigits(8657));
    }

    public static int sumDigits(int number) {

        int sumOfDigits = 0;

        if (number < 0) {
            return -1;
        }

        while (number != 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }

        return sumOfDigits;
    }
}

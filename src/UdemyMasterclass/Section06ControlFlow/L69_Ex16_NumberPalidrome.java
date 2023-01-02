package UdemyMasterclass.Section06ControlFlow;

/**
 * Number Palindrome
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * >>
 * Example Input/Output
 *     isPalindrome(-1221); → should return true
 *     isPalindrome(707); → should return true
 *     isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
 * >>
 * Tip: What is a Palindrome number?
 *      A palindrome number is a number which when reversed is equal to the original number.
 *      For example: 121, 12321, 1001 etc.
 * Tip: Logic to check a palindrome number
 *      . Find the the reverse of the given number. Store it in some variable say reverse.
 *      . Compare the number with reverse.
 *      . If both are the the same then the number is a palindrome otherwise it is not.
 * Tip: Logic to reverse a number
 *      . Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
 *      . Extract the last digit of the given number by performing the modulo division (remainder).
 *      . Store the last digit to some variable say lastDigit = num % 10.
 *      . Increase the place value of reverse by one.
 *      . To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
 *      . Add lastDigit to reverse.
 *      . Since the last digit of the number is processed, remove the last digit of num.
 *      . To remove the last digit divide number by 10.
 *      . Repeat steps until number is not equal to (or greater than) zero.
 * >>
 * A while loop would be good for this coding exercise.
 * >>
 * Tip: Be careful with negative numbers. They can also be palindrome numbers.
 * Tip: Be careful with reversing a number, you will need a parameter for comparing a
 *      reversed number with the starting number (parameter).
 * NOTE: The method isPalindrome needs to be defined as public static like we have been doing
 */
public class L69_Ex16_NumberPalidrome {

    public static void main(String[] args) {

        System.out.println("Number " + 8 + " Reverse = " + findReverse(8));
        System.out.println("Number " + 85 + " Reverse = " + findReverse(85));
        System.out.println("Number " + 88 + " Reverse = " + findReverse(88));
        System.out.println("Number " + 105 + " Reverse = " + findReverse(105));
        System.out.println("Number " + 707 + " Reverse = " + findReverse(707));
        System.out.println("Number " + -1221 + " Reverse = " + findReverse(-1221));
        System.out.println("Number " + 11212 + " Reverse = " + findReverse(11212));
        System.out.println(">>>");
        System.out.println("Number " + -1221 + " is a Palindrome = " + isPalindrome(-1221) + ".");
        System.out.println("Number " + 707 + " is a Palindrome = " + isPalindrome(707) + ".");
        System.out.println("Number " + 11212 + " is a Palindrome = " + isPalindrome(11212) + ".");
    }

    public static boolean isPalindrome(int number) {
        boolean isPalindrome = false;

        if ((findReverse(number)) == number) {
            isPalindrome = true;
        }

        return isPalindrome;
    }

    public static int findReverse (int number) {
        int reverse = 0, lastDigit = 0;
        boolean isNegative = false;

        if (number < 0) {
            number = number * -1;
            isNegative = true;
        }

        while (number > 0) {
            lastDigit = number % 10; // extract the last digit of num
            reverse = (reverse * 10) + lastDigit;
            number = number / 10; // remove the last digit of num
        }

        if (isNegative) {
            reverse = reverse * -1;
        }

        return reverse;
    }
}

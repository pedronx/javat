package UdemyMasterclass.Section06ControlFlow;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23; otherwise, the method should return false.
 * >>>
 * EXAMPLE INPUT/OUTPUT:
 *     hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 *     hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 *     hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * >>>
 * NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a main method to the solution code.
 */
public class L69_Ex19_SharedDigit {

    public static void main (String[] args) {
        System.out.println("hasSharedDigit(9, 100) = " + hasSharedDigit(9, 100));
        System.out.println("hasSharedDigit(9, 99) = " + hasSharedDigit(9, 99));
        System.out.println("hasSharedDigit(9, 9) = " + hasSharedDigit(9, 9));
        System.out.println("hasSharedDigit(10, 100) = " + hasSharedDigit(10, 100));
        System.out.println("hasSharedDigit(10, 100) = " + hasSharedDigit(10, 20));
        System.out.println("hasSharedDigit(12, 23) = " + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(15, 55) = " + hasSharedDigit(15, 55));
        System.out.println("hasSharedDigit(23, 56) = " + hasSharedDigit(23, 56));
    }

    public static boolean hasSharedDigit (int numberOne, int numberTwo) {
        boolean hasShared = false;
        int lastDigitOne = 0, lastDigitTwo = 0;

        if ((numberOne < 10 || numberOne > 99) || (numberTwo < 10 || numberTwo > 99)) {
            return hasShared;
        } else if (numberOne == numberTwo) {
            return true;
        }

       int myNumberTwo = numberTwo;
        for (int i = 0; i < 2; i++) {
            lastDigitOne = numberOne % 10;
            numberOne = numberOne / 10;
            lastDigitTwo = myNumberTwo % 10;
            myNumberTwo = myNumberTwo / 10;

            if ((lastDigitOne == lastDigitTwo || lastDigitOne == myNumberTwo)) {
                return true;
            }
            myNumberTwo = numberTwo;
        }

        return hasShared;
    }
}

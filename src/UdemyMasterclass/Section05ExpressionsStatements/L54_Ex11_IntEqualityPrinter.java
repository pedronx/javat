package UdemyMasterclass.Section05ExpressionsStatements;

/**
 * Equality Printer
 * Write a method printEqual with 3 parameters of type int.
 * The method should not return anything (void).
 * If one of the parameters is less than 0, print text "Invalid Value".
 * If all numbers are equal print text"All numbers are equal"
 * If all numbers are different print text "All numbers are different".
 * Otherwise, print "Neither all are equal or different".
 * >>>
 * EXAMPLES OF INPUT/OUTPUT:
 *    . printEqual(1, 1, 1); should print text "All numbers are equal"
 *    . printEqual(1, 1, 2); should print text "Neither all are equal or different"
 *    . printEqual(-1, -1, -1); should print text "Invalid Value"
 *    . printEqual(1, 2, 3); should print text "All numbers are different"
 */
public class L54_Ex11_IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    /**
     * If one of the parameters is less than 0, print text "Invalid Value".
     * If all numbers are equal print text"All numbers are equal"
     * If all numbers are different print text "All numbers are different".
     * Otherwise, print "Neither all are equal or different".
     */
    public static void printEqual(int numberOne, int numberTwo, int numberThree) {

        if (numberOne < 0 || numberTwo < 0 || numberThree < 0) {
            System.out.println("Invalid Value");
        } else if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne == numberTwo || numberOne == numberThree || numberTwo == numberThree) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}

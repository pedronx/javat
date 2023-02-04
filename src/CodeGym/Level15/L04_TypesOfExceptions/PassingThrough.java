package CodeGym.Level15.L04_TypesOfExceptions;

/**
 * Passing through ourselves
 * Make the program compile without using a try-catch block.
 * Requirements:
 *   . The main method should not have a try-catch block.
 *   . The main method should throw an exception.
 *   . The main method should call the generateLuckyNumber() method.
 *   . Don't change the generateLuckyNumber method.
 */
public class PassingThrough {

    public static void main(String[] args) throws Exception {
            generateLuckyNumber();
    }

    public static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("Unlucky!");
        }
        System.out.println("Your lucky number: " + luckyNumber);
    }
}

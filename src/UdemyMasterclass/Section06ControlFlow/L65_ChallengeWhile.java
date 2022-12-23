package UdemyMasterclass.Section06ControlFlow;

/**
 * The While loop challenge - Step 1
 * Step 1 - Create a method called isEvenNumber, that takes a parameter of type int.
 * Its purpose is to determine if the argument passed to the method is an even number or not.
 * Return true from the method, if it's an even number, otherwise return false.
 * Next, use a while loop to test a range of numbers, from 5 up to and including 20,
 * but printing out only the even numbers, determined by the call to the isEvenNumber method.
 * >>>
 * The While loop challenge - Step 2
 * Record the total number of even numbers found.
 * Break out of the loop, once 5 even numbers are found.
 * Display the total number of odd and even numbers found.
 */
public class L65_ChallengeWhile {

    public static void main (String[] args) {

        /* Step 1
        int i = 5;
        while (i < 21) {
            if (isEvenNumber(i)) {
                System.out.println(i);
            }
            i++;
        } */

        // Step 2
        int i = 5, counterEven = 0, counterOdd = 0;
        while (i < 21 && counterEven < 5) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                counterEven++;
            } else {
                counterOdd++;
            }
            i++;
        }

        System.out.println("Total even numbers found = " + counterEven);
        System.out.println("Total odd numbers found = " + counterOdd);
    }

    /**
     * Method that ckechs if a given number is Even
     */
    public static boolean isEvenNumber(int number) {

        return (number % 2 == 0);
    }
}

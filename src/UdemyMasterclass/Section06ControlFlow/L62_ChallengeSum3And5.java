package UdemyMasterclass.Section06ControlFlow;

/**
 * Create a for loop using a range of numbers from 1 to 1000 inclusive.
 * Sum all the numbers that can be divided by both 3 and 5
 * Print out the numbers that have met the above conditions
 * Break out of the loop once you have found 5 numbers that meet the conditions.
 * After breaking out of the loop, print the sum of the numbers that met the conditions.
 * Note: Type all code in the main method
 */
public class L62_ChallengeSum3And5 {

    public static void main (String[] args) {
        divisibleBy3And5(52);
        divisibleBy3And5(687);
        divisibleBy3And5(232);
        divisibleBy3And5(972);
        divisibleBy3And5(91);
        divisibleBy3And5(3);
        divisibleBy3And5(573);
        divisibleBy3And5(832);
    }

    public static void divisibleBy3And5 (int wholeNumber) {

        int counter = 0, sum = 0;

        for (int i = wholeNumber; counter < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("The number " + i + " is divisible by 3 and 5.");
                sum += i;
                counter++;
            }
        }
        System.out.println("The total sum of numbers divisible by 3 and 5 is " + sum);
    }
}

package UdemyMasterclass.Section06ControlFlow;

/**
 * Largest Prime
 * Write a method named getLargestPrime with one parameter of type int named number.
 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
 * The method should calculate the largest prime factor of a given number and return it.
 * >>>
 * EXAMPLE INPUT/OUTPUT:
 *    . getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
 *    . getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
 *    . getLargestPrime (0); should return -1 since 0 does not have any prime numbers
 *    . getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
 *    . getLargestPrime (-1); should return -1 since the parameter is negative
 * >>>
 * HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
 * NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a main method to the solution code.
 */
public class L71_Ex26_LargestPrime {

    public static void main (String[] args) {

        System.out.println("getLargestPrime (21) = " + getLargestPrime (21));
        System.out.println("getLargestPrime (217) = " + getLargestPrime (217));
        System.out.println("getLargestPrime (8723465) = " + getLargestPrime (8723465));
        System.out.println("getLargestPrime (0) = " + getLargestPrime (0));
        System.out.println("getLargestPrime (9) = " + getLargestPrime (9));
        System.out.println("getLargestPrime (45) = " + getLargestPrime (45));
        System.out.println("getLargestPrime (7) = " + getLargestPrime (7));
        System.out.println("getLargestPrime (1) = " + getLargestPrime (1));
        System.out.println("getLargestPrime (-1) = " + getLargestPrime (-1));
    }

    public static int getLargestPrime(int number) {

        int largestPrime = -1;
        boolean isPrime = false;

        if (number < 2) {
            return largestPrime;
        }

        for (int i = number; i >= 1; i--){
            if (number % i == 0) { // it's a divisor

                isPrime = true; // // check if it's prime, assume yes until the contrary is verified
                for (int divisor = 2; divisor <= i / 2; divisor++) {
                    if (i % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) { // if a prime number, return since it's the largest number found (descendant order)
                    largestPrime = i;
                    break;
                }
            }
        }
        return largestPrime;
    }

    /**
     * Verifiy if a whole number is a Prime number
     * Tips & Math: https://www.mathsisfun.com/prime_numbers.html
     */
    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2); // returns true only if wholeNumber == 2
        }

        // Optimized loop
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}

package UdemyMasterclass.Section06ControlFlow;

public class L61_ChallengePrimeNumber {

    public static void main (String[] args) {

        // manually call the isPrime method without using lops
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number.");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number.");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number.");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number.");

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number.");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number.");

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        primeNumberCounter(34);
        primeNumberCounter(56);
        primeNumberCounter(301);
        primeNumberCounter(675);
        primeNumberCounter(745);
        primeNumberCounter(687);
        primeNumberCounter(43);

    }

    /**
     * Verifiy if a whole number is a Prime number
     * Tips & Math: https://www.mathsisfun.com/prime_numbers.html
     */
    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2); // returns true only if wholeNumber == 2
        }

        /* Regular loop
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        } */

        // Optimized loop
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * For Loop Challenge
     * Create a prime number counter variable, that will keep count of how many prime number were found.
     * Create a for statement, using any range of numbers, where the maximum number is <= 1000.
     * For each number in the range:
     *    . Check to see if it's a prime number, using the isPrime method.
     *    . If the number is prime, print out and increment the prime number counter variable.
     *    . Once the prime number counter equals three, exit the loop (Hint: use the break statement to exit)
     */
    public static void primeNumberCounter(int wholeNumber) {

        int primeNumberCounter = 0;

        for (int i = wholeNumber; i <= 1000; i++) {
            if (primeNumberCounter < 3 && isPrime(i)) {
                System.out.println("The number " + i + " is prime.");
                primeNumberCounter++;
            } else if (primeNumberCounter == 3) {
                System.out.println("Total number of prime numbers between " + wholeNumber + " and " + (i - 1) + " is " + primeNumberCounter);
                break;
            }
        }
    }
}

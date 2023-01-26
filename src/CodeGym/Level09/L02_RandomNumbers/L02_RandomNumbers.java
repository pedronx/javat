package CodeGym.Level09.L02_RandomNumbers;

/**
 * Math.random()        | method that returns a random number
 * double nextDouble()  | returns a random real number in the range [0.0-1.0]
 * float nextFloat()    | very similar to the nextDouble() method, but the returned random number is a float
 *   . As always in Java, the range does not include the number 1.0 itself.
 * int nextInt(int max) | returns a random integer in the range [0, max). 0 is included in the range, but max is not
 *    . Random r = new Random();
 *      int x = r.nextInt(6) + 1;
 * int nextInt()        | similar to the previous one. Range from -2147483648 to +2147483647
 * long nextLong()      | similar to the nextInt() method. Return value will fall somewhere in the entire possible range of longs.
 * boolean nextBoolean()        | returns a random boolean value: false or true
 * void nextBytes(byte[] data)  | fills the passed array with random values
 * double nextGaussian()        | returns a random real number in the range 0.0-1.0.
 *                                However, the numbers are not evenly distributed in this range.
 *                                Instead, they follow a normal distribution.
 *                                Values near the middle of the range (0.5) will occur more often
 *                                than values at the ends of the range.
 */
public class L02_RandomNumbers {

    public static void main (String[] args) {

        // Random numbers > example 01
        getRandomNumber();


        // Random numbers > example 02
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            int x = getRandomDieNumber();
            System.out.println(x);
        }

        // Lesson 02 | Task 01
        System.out.println();
        System.out.println(generateNumber());
    }

    // Get random number [0 .. 1]
    public static void getRandomNumber() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Math.random());
        }
    }

    // Get random number [1 .. 6]
    public static int getRandomDieNumber()
    {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * Randomizer
     * In this task, you need to implement a generateNumber() method that will return a random number between 0 and 99.
     * Have the generateNumber() method use the Math.random() method.
     * Requirements:
     *   . The Solution class should have a public static generateNumber() method that returns an int.
     *   . Implement the generateNumber() method in accordance with the task conditions.
     */
    public static int generateNumber() {

        return (int) (Math.random() * 10) ;
    }
}


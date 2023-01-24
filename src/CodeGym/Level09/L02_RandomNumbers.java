package CodeGym.Level09;

/**
 * Math.random()    | method that returns a random number
 */
public class L02_RandomNumbers {

    public static void main (String[] args) {

        // Random numbers > example 01
        getRandomNumber();

        System.out.println();

        // Random numbers > example 02
        for (int i = 0; i < 10; i++)
        {
            int x = getRandomDieNumber();
            System.out.println(x);
        }

        System.out.println();

        // Lesson 02 | Task 01
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

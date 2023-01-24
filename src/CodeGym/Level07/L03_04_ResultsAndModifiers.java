package CodeGym.Level07;

public class L03_04_ResultsAndModifiers {

    public static void main (String[] args) {

        // Lesson 03 | Task 01
//        signIn("PedroNx");
//        signIn("user");

        // Lesson 03 | Task 02
//        System.out.println(cube(56423));

        // Lesson 03 | Task 03
//        System.out.println(ninthDegree(56));

        // Lesson 04 | Task 02
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("In the array: ");
        printArray(array);
        System.out.println("Minimum: " + getMinValue(array));
        System.out.println("Maximum: " + getMaxValue(array));
    }

    /**
     * Welcome! But not everyone.
     * This is the signIn() method that greets website users. Currently, it greets all users, but it should only greet registered users. All unregistered users have the name "user".
     * Add username validation at the beginning of the signIn() method.
     * If the name is "user", use the return keyword to abort execution of the method.
     * Requirements:
     *   . If the username is "user", then the signIn() method should exit without printing anything on the console.
     *   . If the username is not "user", then the signIn() method should continue and print greetings on the console.
     *   . The return keyword must be used to interrupt the signIn() method.
     */
    public static void signIn(String username) {

        if ( username == "user") {
            return;
        }
        else {
            System.out.println("Welcome, " + username);
            System.out.println("We've really missed you, " + username);
        }
    }

    /**
     * A cube calculator
     * Let's implement a calculator that will compute the powers of numbers.
     * To do this, create a cube() method. It must take a long integer value as an argument.
     * The method should raise the passed value to the third power and return it as the method's result.
     * The numbers you have to work with may be large. Accordingly, the cube() method must return a long.
     * Requirements:
     *   . There must be a public static long cube(long) method.
     *   . The cube() method must return the result of raising the passed number to the power of three.
     */
    public static long cube(long number) {

        return number * number * number;
    }

    /**
     * A cubed cube calculator
     * You won't blow any minds by unveiling a calculator that can raise a number to the power of three.
     * But a calculator that can raise a number to the power of nine is another matter! So let's implement one!
     * >>>
     * To do this, create a public static long ninthDegree(long) method.
     * It must take a long integer value as an argument.
     * The method should raise the passed value to the ninth power and return it as the method's result.
     * You'll remember from your high school math class that you can get the ninth power of a number if you raise it to the third power and then raise the result to the third power. Let's use this rule in our program.
     * In the ninthDegree() method, raise the passed argument to the third power using the cube() method.
     * Then pass the result to the cube() method once again. The final result is the method's return value.
     * Requirements:
     *   . There must be a public static long ninthDegree(long a) method.
     *   . The ninthDegree() method must return the result of raising the passed number to the power of nine.
     *   . The ninthDegree() method must use the cube() method to successively cube the number.
     */
    public static long ninthDegree(long number) {

        return cube(cube(number));
    }

    /**
     * Analyzing arrays
     * This program should display information about the created array. But due to misplaced static modifiers, it won't compile.
     * Correct these mistakes. Add the static modifier where it is needed.
     * Requirements:
     *   . The code must compile.
     *   . Add the minimum required number of static modifiers.
     */
    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

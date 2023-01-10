package UdemyMasterclass.Section09Arrays.L122_ArraysChallenge;

import java.util.Arrays;
import java.util.Random;

/**
 * The Arrays Challenge
 * Create a program using arrays, that sorts a list of integers, in descending order.
 *   . First, create and array of randomly generated integers
 *   Print the array before you sort it
 *   And print the array after you sort it
 */
public class Main {

    public static void main(String[] args) {

        int length = 10;
        int[] array = getRandomArray(length);

        System.out.println("Array (unsorted) = " + Arrays.toString(array));
        Arrays.sort(array);

        int[] arrayCopy = Arrays.copyOf(array, length);
        for (int i = 0; i < length; i++) {
            arrayCopy[(length - 1) - i] = array [i];
        }

        System.out.println("Array (sorted -> descending) = " + Arrays.toString(arrayCopy));

    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100); // upper bound = 100 (max. random number)
        }
        return newInt;
    }
}

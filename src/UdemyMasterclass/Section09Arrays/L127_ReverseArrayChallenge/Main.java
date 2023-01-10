package UdemyMasterclass.Section09Arrays.L127_ReverseArrayChallenge;

import java.util.Arrays;
import java.util.Random;

/**
 * The Reverse Array Challenge
 * Write a method called reverse, that takes an int array as a parameter
 * In the main method, call the reverse method, and print the array
 * both before and after the reverse method is called.
 * To reverse the array, you need to swap the elements, so that the first element
 * is swapped with the last element, and so on
 */
public class Main {

    public static void main(String[] args) {

        int[] array = getRandomArray(11);

        System.out.println("Original Integer array:");

        for (int i = 0; i < array.length; i++ ) {
            System.out.printf("Array[%d] = %d%n", i, array[i]);
        }

        System.out.println("»".repeat(30));
        System.out.println("Reversed Integer array:");

        // int[] reversedArray = reverseArray(array);
        int[] reversedArray = reverseOptimizedArray(array);
        for (int i = 0; i < reversedArray.length; i++ ) {
            System.out.printf("Array[%d] = %d%n", i, reversedArray[i]);
        }
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100); // upper bound = 100 (max. random number)
        }
        return newInt;
    }

    // Original solution, iterates through the whole array
    private static int[] reverseArray (int[] array) {

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            arrayCopy[(array.length - 1) - i] = array [i];
        }
        return arrayCopy;
    }

    // Optimized solution, iterates only through half of the array
    private static int[] reverseOptimizedArray (int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < Math.round((double) array.length / 2); i++) {
            arrayCopy[i] = array[(array.length - 1) - i];
            arrayCopy[(array.length - 1) - i] = array [i];
        }
        return arrayCopy;
    }
}

package UdemyMasterclass.Section09Arrays.L126_MinimumElementChallenge;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Minimum Element Challenge
 * . Write a method called readIntegers, that reads a comma delimited list of numbers,
 *   entered by the user from the console, and returns an array, containing those numbers.
 * . Next, write a method called findMin, that takes the array as an argument,
 *   and returns the minimum value found in that array.
 * . In the main method
 *     . Call the method readIntegers, to get the array of integers from the user,
 *       and print these out, using a method found in java.utils.Arrays.
 *     . Next, call the findMin method, passing the array, returned from the call to the readIntegers method
 *     . Print the minimum element in the array, which should be returned from the findMin method.
 * Tip: Assume that the user will only enter numbers (no validation required)
 */
public class Main {

    public static void main (String[] args) {

        System.out.println("The minimum numer in the array is: " + findMin(readIntegers()));
    }

    public static int[] readIntegers() {

        // instantiate a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers, delimited by commas (,): ");
        String s = scanner.nextLine();

        // create an array
        String[] array = s.split(",");
        System.out.println("Original String array:");
        printText(array);

        int[] intArray = new int[array.length];

        System.out.println("»".repeat(30));
        System.out.println("Integer array:");

        for (int i = 0; i < array.length; i++ ) {
            intArray[i] = Integer.parseInt(array[i].trim()); // trim() = remove possible whithespaces
            System.out.printf("Array[%d] = %d%n", i, intArray[i]);
        }
        System.out.println("»".repeat(30));
        return intArray;
    }

    public static int findMin (int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static void printText(String[] textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}

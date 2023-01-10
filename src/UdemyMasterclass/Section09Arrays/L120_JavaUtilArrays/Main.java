package UdemyMasterclass.Section09Arrays.L120_JavaUtilArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getRandomArray(10)));

        // Arrays.sort() method
        int[] firstArray = getRandomArray(10);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        System.out.println();

        // Arrays.fill() method
        int[]secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        System.out.println();

        // Alternative - sort a copy of the original array (so not to lose information)
        int[] thirdArray = getRandomArray(10);
        System.out.printf("%18s %s%n", "Original array:", Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.printf("%18s %s%n", "Copy:",  Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.printf("%18s %s%n", "Sorted Copy:", Arrays.toString(fourthArray));

        // Copy to a smaller array
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println();
        System.out.printf("%18s %s%n", "Smaller Copy:", Arrays.toString(smallerArray));

        // Copy to a larger array
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println();
        System.out.printf("%18s %s%n", "Larger Copy:", Arrays.toString(largerArray));

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

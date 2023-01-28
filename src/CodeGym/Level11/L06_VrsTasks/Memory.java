package CodeGym.Level11.L06_VrsTasks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Memory defragmentation
 * Let's explore how an array of strings is like computer memory.
 * If we remove some elements, then we get "holes" in the array, that is, some elements are equal to null.
 * The executeDefragmentation(String []) method, which takes an array of strings and performs "defragmentation",
 * that is, eliminates the "holes" (cells storing null) by moving all the string objects to the beginning of the array
 * while maintaining the same order. In this task, you need to implement the executeDefragmentation(String[]) method.
 * You can use the main() method to check the result of the executeDefragmentation(String[]) method.
 * Requirements:
 *   . The Memory class must have a public static void executeDefragmentation(String[]) method.
 *   . Implement the executeDefragmentation() method in accordance with the task conditions.
 */
public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        System.out.println("Original array:\n" + Arrays.toString(memory));
        executeDefragmentation(memory);
        System.out.println("\nDefragmented array:\n" + Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {

        int indexNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                indexNewArray = i + 1;
                while (indexNewArray != array.length) {
                    if (array[indexNewArray] != null) {
                        array[i] = array[indexNewArray];
                        array[indexNewArray] = null;
                        break;
                    }
                    indexNewArray++;
                }
            }
        }

    }
}

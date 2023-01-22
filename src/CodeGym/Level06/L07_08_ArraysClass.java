package CodeGym.Level06;

import java.util.Arrays;

/**
 * Arrays — a helper class
 *   . Arrays.toString()
 *   . Arrays.deepToString()
 *   . Arrays.equals()
 *   . Arrays.deepEquals()
 *   . Arrays.fill()
 *   . Arrays.copyOf()
 *   . Arrays.copyOfRange()
 *   . Arrays.sort()
 *   . Arrays.binarySearch()
 *
 *   *** In some methods, in accordance with Java's good old tradition ***
 *   *** remember that the last element (index) is not included in the range ***
 *   Ex. Arrays.fill(array, firstIndex, lastIndex, value)
 *       Arrays.copyOfRange(name, firstIndex, lastIndex)
 *       Arrays.sort(name, firstIndex, lastIndex)
 */
public class L07_08_ArraysClass {

    /*--- Lesson 07 | Task 01 ---*/
    public static String[] someStrings = new String[]{"I", "love", "Java"};
    public static int[] someInts = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    /*--- Lesson 07 | Task 02 ---*/
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    /*--- Lesson 07 | Task 03 ---*/
    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    /*--- Lesson 08 | Task 01 ---*/
    public static int[] someArray = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;
    /*--- Lesson 08 | Task 02 ---*/
    public static int[][] result = new int[2][];
    public static int[] anotherArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    /*--- Lesson 08 | Task 03 ---*/
    public static int[] yetAnotherArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    /*--- Lesson 08 | Task 04 ---*/
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {

//        displayingArrays(); // L07 Task 01
//        displayingTwoDArays(); // L07 Task 02
//        comparingTwoDArrays(); // L07 Task 03
//        fillingArray(); // L08 Task 01
//        splittingArray(); // L08 Task 02
//        sortingArray(); // L08 Task 03
        isAnyoneThere(); // L08 Task 04
    }

    /**
     * Displaying arrays
     * Implement the main(String[]) method, which displays the strings and ints arrays on the console using the Arrays.toString() method.
     * Requirements:
     *   . The Solution class must have a public static String[] strings variable.
     *   . The Solution class must have a public static int[] ints variable.
     *   . In the main(String[]) method, display the strings array on the console using the Arrays.toString(Object[]) method.
     *   . In the main(String[]) method, display the ints array on the console using the Arrays.toString(int[]) method.
     */
    public static void displayingArrays() {

        System.out.println(Arrays.toString(someStrings));
        System.out.println(Arrays.toString(someInts));
    }

    /**
     * Displaying two-dimensional arrays
     * Implement the main(String[]) method, which displays the strings and ints arrays on the console using the Arrays.deepToString(Object[][]) method.
     * Requirements:
     *   . The Solution class must have a public static String[][] strings variable.
     *   . The Solution class must have a public static int[][] ints variable.
     *   . In the main(String[]) method, display the strings array on the console using the Arrays.deepToString(Object[][]) method.
     *   . In the main(String[]) method, display the ints array on the console using the Arrays.deepToString(Object[][]) method.
     */
    public static void displayingTwoDArays() {

        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }

    /**
     * Comparing two-dimensional arrays
     * Fix the logic of the main(String[]) method. It should display true if arrayFirst is the same as arraySecond. Otherwise, it should return false.
     * Requirements:
     *   . If arrayFirst is equal to arraySecond, then main(String[]) displays true on the console.
     *   . If arrayFirst is not equal to arraySecond, then main(String[]) displays false on the console.
     */
    public static void comparingTwoDArrays() {

        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }

    /**
     * Filling an array
     * Implement a static main(String[]) method that populates the array variable with the values valueStart and valueEnd.
     * If the length of the array is even, then its first half must be filled with valueStart values, and the second half with valueEnd.
     * If the length of the array is odd, then fill the larger part with valueStart, and the smaller one with valueEnd.
     * To fill the array with values, use the Arrays.fill(int [], int, int, int) method.
     * During testing, the values of the fields in the Solution class will be different. Take that into consideration.
     * Requirements:
     *   . Implement the main(String[]) method in accordance with the task conditions.
     */
    public static void fillingArray() {

        if (someArray.length % 2 == 0) {
            Arrays.fill(someArray,0,(someArray.length / 2), valueStart);
            Arrays.fill(someArray,(someArray.length / 2),someArray.length, valueEnd);
        } else {
            Arrays.fill(someArray,0,(someArray.length / 2) + 1, valueStart);
            Arrays.fill(someArray,(someArray.length / 2) + 1,someArray.length, valueEnd);
        }

        System.out.println(Arrays.toString(someArray));
    }

    /**
     * Splitting an array
     * Implement the main(String[]) method, which splits an array into two subarrays and fills a two-dimensional result array with them.
     * If the length of the array is odd, then the larger half should be copied into the first subarray.
     * Use the Arrays.copyOfRange(int[], int, int) method to split the array. Do not change the order of the elements.
     * During testing, the values of the fields in the Solution class will be different. Take that into consideration.
     * Requirements:
     *   . Implement the main(String[]) method in accordance with the task conditions.
     */
    public static void splittingArray() {

        if (anotherArray.length % 2 == 0) {
            result[0] = Arrays.copyOfRange(anotherArray, 0, (anotherArray.length / 2));
            result[1] = Arrays.copyOfRange(anotherArray, (anotherArray.length / 2), anotherArray.length);
        } else {
            result[0] = Arrays.copyOfRange(anotherArray, 0, (anotherArray.length / 2) + 1);
            result[1] = Arrays.copyOfRange(anotherArray, (anotherArray.length / 2) + 1, anotherArray.length);
        }

        System.out.println(Arrays.deepToString(result));
    }

    /**
     * Sorting an array
     * Implement the main(String[]) method, which sorts array in ascending order.
     * Use the Arrays.sort(int[]) method to sort the array.
     * Requirements:
     *   . Implement the main(String[]) method in accordance with the task conditions.
     */
    public static void sortingArray() {

        Arrays.sort(yetAnotherArray);
        System.out.println(Arrays.toString(yetAnotherArray));
    }

    /**
     * Is anyone there?
     * Implement the main(String[]) method, which displays true if the element is contained in the passed array, otherwise false.
     * The array variable should not change the position of its elements.
     * To search for an element in an array, you need a binary search.
     * To do this, use the static Arrays.binarySearch(int[], int) method of the Arrays class.
     * In the first argument, pass a sorted array to be searched. The second parameter is the element to be searched for.
     * The Arrays.binarySearch(int[], int) method returns the index of the query element, if such an element exists in the array.
     * You can use the Arrays.sort(int[]) method to sort the array.
     * During testing, the values of the variables in the Solution class will be different.
     * Requirements:
     *   . In the main(String[]) method, do not change the position of the elements in the array.
     *   . When the main(String[]) method is called, display true if the value of the element variable is contained in the array.
     *   . When the main(String[]) method is called, display false if the passed element is not contained in the array.
     *   . In the main(String[]) method, use a call to the Arrays.binarySearch(int[], int) method.
     */
    public static void isAnyoneThere() {

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        if (Arrays.binarySearch(arrayCopy, element) >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

package CodeGym.Level06;

import java.util.Scanner;

public class L05_06_MultiDimensionalArrays {

    /*--- Lesson 5 | Task 01 ---*/
    public static int[][] MULTIPLICATION_TABLE;
    /*--- Lesson 5 | Task 02 ---*/
    public static int[][] result = new int[10][];
    /*--- Lesson 5 | Task 03 ---*/
    public static int[][] multiDArray;
    /*--- Lesson 5 | Bonus Task 1 ---*/
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
    /*--- Lesson 5 | Bonus Task 1 ---*/
    public static int[][][] threeDArray;
    /*--- Lesson 5 | Bonus Task 2 ---*/
    public static int[][][][] fourDArray;

    public static void main (String[] args) {

//        multiplicationTable(); // Task 01
//        triangularArray(); // Task 02
//        twoDimensionalArray(); // Task 03
        threeDimensionalArray(); // Bonus task
    }

    /**
     * Multiplication table
     * Initialize the MULTIPLICATION_TABLE array as a new int[10][10], fill it with a multiplication table, and then display it on the console in the following form: 1 2 3 4 …
     * 2 4 6 8 …
     * 3 6 9 12 …
     * 4 8 12 16 …
     * …
     * The numbers in each line are separated by a space.
     * Requirements:
     *   . In the main method, the MULTIPLICATION_TABLE array must be filled with a multiplication table.
     *   . The displayed text should contain 10 lines.
     *   . Each displayed line should contain 10 numbers separated by a space.
     *   . The displayed numbers must form a multiplication table.
     */
    public static void multiplicationTable() {

        MULTIPLICATION_TABLE = new int[10][10];
        int multiplication = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplication = (i + 1) * (j + 1);
                MULTIPLICATION_TABLE [i][j] = multiplication;
                System.out.printf("%d ", multiplication);
            }
            System.out.println();
        }

    }

    /**
     * Triangular array
     * Create a triangular array where the value of each element is the sum of its indices.
     * For example:
     * array[7][3] = 7 + 3 = 10,
     * array[3][0] = 3 + 0 = 3.
     * Display the array in the following form:
     * 0
     * 1 2
     * 2 3 4
     * 3 4 5 6
     * 4 5 6 7 8
     * 5 6 7 8 9 10
     * ...
     * The numbers in each line are separated by a space.
     * You can define a triangular array as follows:
     * int[][] array = new int[10][];
     * array[0] = new int[1];
     * array[1] = new int[2];
     * array[2] = new int[3];
     * ...
     * Requirements:
     *   . In the main(String[]) method, fill the two-dimensional result array with numbers as outlined in the task conditions.
     *   . The displayed text should contain 10 lines.
     *   . The displayed numbers must match the task conditions.
     */
    public static void triangularArray() {

        for (int i = 0; i < 10; i++) {
                result[i] = new int[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.printf("%d ", result[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Creating a two-dimensional array
     * A two-dimensional array is an array of arrays. That is, an array where each cell holds a reference to an array.
     * But it is much easier to think of it as a table that has a number of rows (first dimension) and a number of columns (second dimension).
     * In this task, we will create such an array.
     * Implement the main(String[]) method, which:
     *     Reads from the console a number R — the number of rows in the array. The number must be greater than 0.
     *     Then it reads R numbers from the console (any numbers greater than 0).
     *     Then it initializes the two-dimensional multiArray array using:
     *         the number of rows R;
     *         row arrays whose size corresponds to the numbers entered in step 2 (in the order they are entered).
     * Example:
     *     The number 5 is entered.
     *     The numbers 1, 7, 5, 9, and 3 are entered.
     *     And we get an array like this:
     *     []
     *     [][][][][][][]
     *     [][][][][]
     *     [][][][][][][][][]
     *     [][][]
     * Requirements:
     *   . The Solution class should have an uninitialized public static int[][] multiArray variable.
     *   . The main(String[]) method must read N+1 numbers from the keyboard.
     *   . In the main(String[]) method, initialize and fill the two-dimensional array as outlined in the task conditions.
     */
    public static void twoDimensionalArray() {

        Scanner console = new Scanner(System.in);
        int numberRows = console.nextInt(); // ask user for number of rows
        int numberColumns = 0; // declare variable
        multiDArray = new int[numberRows][];

        if (numberRows > 0) {
            for (int i = 0; i < numberRows; i++) {
                numberColumns = console.nextInt(); // ask user for number of columns for 'i' row
                if (numberColumns > 0) {
                    multiDArray[i] = new int[numberColumns];
                } else {
                    multiDArray[i] = new int[1]; // create a default array of size 1
                }
            }
        }

        // display the array
        for (int i = 0; i < multiDArray.length; i++) {
            for (int j = 0; j < multiDArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }

    /**
     * Creating a three-dimensional array
     * Bonus task: write code that displays all the values in a three-dimensional array.
     */
    public static void threeDimensionalArray() {

        Scanner console = new Scanner(System.in);
        int numberRows = console.nextInt(); // ask user for number of rows
        int number2D = 0; // declare variable
        int number3D = 0; // declare variable

        if (numberRows > 0) {
            threeDArray = new int[numberRows][][];

            // initialize the array
            for (int i = 0; i < threeDArray.length; i++) {
                number2D = console.nextInt(); // ask user for number of 2D columns
                threeDArray[i] = new int[number2D][];

                for (int j = 0; j < threeDArray[i].length; j++) {
                    number3D = console.nextInt(); // ask user for number of 3D columns
                    threeDArray[i][j] = new int[number3D];
                }
            }
        }

        // display the array
        for (int i = 0; i < threeDArray.length; i++) {
            System.out.println("Page " + (i + 1));
            for (int j = 0; j < threeDArray[i].length; j++) {
                System.out.print("Row " + (j + 1) + ": ");
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print("[] ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

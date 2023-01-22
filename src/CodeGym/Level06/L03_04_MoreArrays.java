package CodeGym.Level06;

import java.util.Scanner;

public class L03_04_MoreArrays {

    /*--- Task 02 & 03 ---*/
    public static int[] array;
    /*--- Task 04 ---*/
    public static String[] strings;


    public static void main(String[] args) {

//        reverse(); // Task 01
//        minimumNumber(); // Task 02
//        maximumNumbers(); // Task 03
        removeDuplicateStrings(); // Task 04
    }

    /**
     * Reverse
     * You need to write a program that:
     *   . Reads an integer N from the console.
     *   . If the number N is greater than 0, then the program reads an additional N integers.
     *   . Print the numbers to the console. If N is odd, display them in the order in which there were entered. Otherwise, display them in reverse order.
     * Display each number on a new line. Do not display the number N.
     * Requirements:
     *   . The program should read a number N, followed by N numbers.
     *   . The class must have a public static void main (String[]) method.
     *   . Do not add new methods to the Solution class.
     *   . If N is even, then the program should display N numbers in reverse order.
     *   . If N is odd, then the program should display N numbers in the order in which they were entered.
     */
    public static void reverse() {

        Scanner console = new Scanner(System.in);
        int nRepetitions = console.nextInt();

        if (nRepetitions > 0) {
            int[] array = new int[nRepetitions];
            for (int i = 0; i < nRepetitions; i++) {
                array[i] = console.nextInt();
            }

            if (nRepetitions % 2 == 0) {
                for (int i = nRepetitions - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            } else {
                for (int i = 0; i < nRepetitions; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    /**
     * Minimum of N numbers
     * To complete this task, you need to:
     *   . Read a number N from the keyboard.
     *   . Read N integers and fill an array with them.
     *   . Find the minimum number in the elements of the array and display in on the console.
     * Requirements:
     *   . In the main(String[]) method, read a number N from the keyboard. Then initialize an array array of N elements and fill it in with the numbers read from the keyboard.
     *   . In the main(String[]) method, display the minimum number among the elements of the array.
     */
    public static void minimumNumber() {

        Scanner console = new Scanner(System.in);
        int nRepetitions = console.nextInt();

        if (nRepetitions > 0) {
            array = new int[nRepetitions];

            for (int i = 0; i < nRepetitions; i++) {
                array[i] = console.nextInt();
            }

            int minimum = array[0];
            for (int i = 1; i < nRepetitions; i++) {
                if (array[i] < minimum) {
                    minimum = array[i];
                }
            }
            System.out.println(minimum);
        }
    }

    /**
     * Maximum of N numbers
     * In this task, you need to:
     *   . Read a number N from the keyboard.
     *   . Read N integers and fill an array array with them.
     *   . Find the maximum number among the elements of the array.
     * Requirements:
     *   . In the main(String[]) method, read a number N from the keyboard. Then initialize an array array of N elements and fill it in with the numbers read from the keyboard.
     *   . In the main(String[]) method, display the maximum number among the elements of the array.
     */
    public static void maximumNumbers() {

        Scanner console = new Scanner(System.in);
        int nRepetitions = console.nextInt();

        if (nRepetitions > 0) {
            array = new int[nRepetitions];

            for (int i = 0; i < nRepetitions; i++) {
                array[i] = console.nextInt();
            }

            int maximum = array[0];
            for (int i = 1; i < nRepetitions; i++) {
                if (array[i] > maximum) {
                    maximum = array[i];
                }
            }
            System.out.println(maximum);
        }
    }

    /**
     * Remove duplicate strings
     * In this task, you need to:
     *   . Read 6 strings and fill the strings array with them.
     *   . Remove duplicate strings from the strings array, replacing them with null (null, not the string "null").
     * Examples:
     * The array after reading the strings:
     * {"Hello", "Hello", "World", "Java", "Tasks", "World"}
     * The array after removing duplicate strings:
     * {null, null, null, "Java", "Tasks", null}
     * Requirements:
     *   . In the main(String[]) method, read 6 strings from the keyboard and fill the strings array with them.
     *   . In the main(String[]) method, remove (meaning, overwrite with null) any duplicated elements in the strings array.
     */
    public static void removeDuplicateStrings() {

        strings = new String[6];
        Scanner console = new Scanner(System.in);
        String verification = "";

        for(int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }

        int duplicates = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (i != j && strings[i] != null && strings[j] != null) {
                    if (strings[i].equalsIgnoreCase(strings[j])) {
                        strings[j] = null;
                        duplicates += 1;
                    }
                }
            }

            if (duplicates > 0) {
                strings[i] = null;
            }
            duplicates = 0;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

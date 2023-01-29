package CodeGym.Level13.L03_ArrayList;

import java.util.ArrayList;

/**
 * Flipping data
 * Here you have a working program whose init() method populates the int[] numbers array with numbers. Then the reverse() method rearranges the numbers, putting them into reverse order.
 * Your task is to rewrite the code so that instead of an int[] numbers array it uses an ArrayList<Integer> numbers list.
 * Do not change the names of methods and variables.
 * The main() and print() methods are not involved in testing.
 * Requirements:
 *   . The numbers field should be an ArrayList<Integer>.
 *   . The init() method should populate the numbers list with numbers from 0 to 9.
 *   . The reverse() method should put the values of the numbers list into reverse order.
 */
public class MainFlippingData {

    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        System.out.println();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}

package CodeGym.Level14.L03_CollectionsHelperClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Order of the elements
 */
public class CollectionsHelperClass_Pt2 {

    public static void main(String[] args) {

        reverse();
        System.out.println("-".repeat(25));

        sort();
        System.out.println("-".repeat(25));

        rotate();
        System.out.println("-".repeat(25));

        shuffle();
        System.out.println("-".repeat(25));

    }

    // Collections.reverse(List<T> list) method
    public static void reverse() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        Collections.reverse(list);
        System.out.println("Reversed list:");
        for (int i: list)
            System.out.println(i);
    }


    // Collections.sort(List<T> list) method
    public static void sort() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 4, 15);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        Collections.sort(list);

        System.out.println("Sorted list:");
        for (int i: list)
            System.out.println(i);
    }


    // Collections.rotate(List<T> list, int distance) method
    // The rotate() method cyclically shifts the elements of the passed list by distance positions forward.
    public static void rotate() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        Collections.rotate(list, 3); // Shift by 3 positions

        System.out.println("Rotated list:");
        for (int i: list)
            System.out.println(i);
    }


    // Collections.shuffle(List<T> list) method
    // The shuffle() method randomly shuffles all the elements of the passed list. The result is different every time.
    public static void shuffle() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        Collections.shuffle(list); // Shuffle the elements

        System.out.println("Shuffled list 1:");
        for (int i: list)
            System.out.println(i);

        Collections.shuffle(list); // Shuffle the elements
        System.out.println("Shuffled list 2:");
        for (int i: list)
            System.out.println(i);

        Collections.shuffle(list); // Shuffle the elements
        System.out.println("Shuffled list 3:");
        for (int i: list)
            System.out.println(i);
    }
}

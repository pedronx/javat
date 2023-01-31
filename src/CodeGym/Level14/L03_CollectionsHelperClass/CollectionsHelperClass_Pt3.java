package CodeGym.Level14.L03_CollectionsHelperClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Finding elements in collections
 */
public class CollectionsHelperClass_Pt3 {

    public static void main(String[] args) {

        min();
        System.out.println("-".repeat(25));

        max();
        System.out.println("-".repeat(25));

        frequency();
        System.out.println("-".repeat(25));

        binarySearch();
        System.out.println("-".repeat(25));

        disjoint();
    }


    // Collections.min(Collection<T> colls) method
    public static void min() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 4, 15);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        System.out.println("Minimum:");
        int min = Collections.min(list);

        System.out.println(min);
    }


    // Collections.max(Collection<T> colls) method
    public static void max() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 4, 15);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        System.out.println("Maximum:");
        int max = Collections.max(list);

        System.out.println(max);
    }


    // Collections.frequency(Collection<T> colls, T obj) method
    // The frequency() method counts the number of times the obj element occurs in the colls collection
    public static void frequency() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 4, 15, 4, 2, 4);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        int count = Collections.frequency(list, 4);

        System.out.println("Frequency of nr. 4: " + count);
    }


    // Collections.binarySearch(Collection<T> colls, T obj) method
    // *Important* The collection must be sorted -> use Collections.sort()
    public static void binarySearch() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 5, 15, 4, 2, 4);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        Collections.sort(list);  // 2, 2, 4, 4, 5, 11, 15, 23

        int index = Collections.binarySearch(list, 5);    // 4
        System.out.println("Index of nr. 5: " + index);

        int index2 = Collections.binarySearch(list, 15);  // 6
        System.out.println("Index of nr. 15: " + index2);

        int index3 = Collections.binarySearch(list, 16); // The element doesn't exist, returns negative int
        System.out.println("Index of nr. 16: " + index3);
    }


    // Collections.disjoint(Collection<T> coll1, Collection<T> coll2) method
    // The disjoint() method returns true if the passed collections do not have any elements in common
    public static void disjoint() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);

        System.out.println("List 1:");
        for (int i: list)
            System.out.println(i);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 99, 98, 97);

        System.out.println("List 2:");
        for (int i: list2)
            System.out.println(i);

        boolean isDifferent = Collections.disjoint(list, list2);
        System.out.println("\nThe lists don't have any elements in common! -> " + isDifferent);
    }
}

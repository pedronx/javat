package CodeGym.Level14.L03_CollectionsHelperClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List of methods
 * addAll(colls, e1, e2, e3, ...)	Adds the elements e1, e2, e3, ... to the colls collection
 * fill(list, obj)					Replaces all the elements in the passed list with obj
 * nCopies(n, obj)					Returns a list of n copies of the obj object
 * replaceAll(list, oldVal, newVal) Replaces all instances of oldVal with newVal in the list list
 * copy(dest, src)					Copies all elements from the src list to the dest list
 * reverse(list)					Reverses the list.
 * sort(list)						Sorts the list in ascending order
 * rotate(list, n)					Cyclically shifts the elements of the list list by n elements
 * shuffle(list)					Randomly shuffles the elements in the list
 * min(colls)						Finds the minimum element in the colls collection
 * max(colls)						Finds the maximum element in the colls collection
 * frequency(colls, obj)			Determines how many times the obj element occurs in the colls collection
 * binarySearch(list, key)			Searches for key in a sorted list and returns the corresponding index.
 * disjoint(colls1, colls2)		    Returns true if the collections have no elements in common
 * -------------------------------------
 * *IMPORTANT*
 * Many of these methods don't use the ArrayList, HashSet and HashMap classes per se,
 * but with the corresponding interfaces: Collection<T>, List<T>, Map<K, V>.
 * This is not a problem: if a method accepts a List<T>, you can always pass it an ArrayList<Integer>,
 * but the assignment operator does not work in the opposite direction.
 */

/**
 * Creating and modifying collections
 */
public class CollectionsHelperClass_Pt1 {

    public static void main(String[] args) {

        addAll();
        System.out.println("-".repeat(25));

        fill();
        System.out.println("-".repeat(25));

        nCopies();
        System.out.println("-".repeat(25));

        replaceAll();
        System.out.println("-".repeat(25));

        copy();
        System.out.println("-".repeat(25));
    }


    // Collections.addAll(Collection<T> colls, T e1, T e2, T e3, ...) method
    public static void addAll() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        for (int i: list)
            System.out.println(i);
    }


    // Collections.fill(List<T> list, T obj) method
    public static void fill() {
        ArrayList<Integer> anotherList = new ArrayList<Integer>();
        anotherList.add(1);
        anotherList.add(2);
        anotherList.add(3);

        Collections.fill(anotherList, 10);

        for (int i: anotherList)
            System.out.println(i);
    }


    // Collections.nCopies(int n, T obj) method
    public static void nCopies() {
        List<String> immutableList = Collections.nCopies(5, "Hello");

        ArrayList<String> yetAnotherlist = new ArrayList<String>(immutableList);

        for(String s: yetAnotherlist)
            System.out.println(s);
    }


    // Collections.replaceAll (List<T> list, T oldValue, T newValue) method
    public static void replaceAll() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Original list:");
        for (int i: list)
            System.out.println(i);

        Collections.replaceAll(list, 2, 20);

        System.out.println("Updated list (replaced 2 with 20):");
        for (int i: list)
            System.out.println(i);
    }


    /**
     * Collections.copy (List<T> dest, List<T> src) method
     * The copy() method copies all the elements of the src collection into the dest collection.
     * *Important*
     * The dest collection must be at least as long as the src collection (otherwise, an IndexOutOfBoundsException will be thrown).
     * To prevent this, the dest collection must start out longer than the src collection
     * (to keep the remaining elements of the dest collection intact).
     */
    public static void copy() {
        ArrayList<Integer> srcList = new ArrayList<Integer>();
        Collections.addAll(srcList, 99, 98, 97);
        System.out.println("Source list:");
        for (int i: srcList)
            System.out.println(i);

        ArrayList<Integer> destList = new ArrayList<Integer>();
        Collections.addAll(destList, 1, 2, 3, 4, 5, 6, 7);
        System.out.println("Destiny list:");
        for (int i: destList)
            System.out.println(i);

        Collections.copy(destList, srcList);

        System.out.println("Destiny list after Source list copy:");
        for (int i: destList)
            System.out.println(i);
    }
}

package CodeGym.Level13.L04_05_MoreArrayList;

import java.util.ArrayList;

/**
 * Creating our own list
 * ArrayList is a list that stores a dynamically expanding array of elements.
 * We will now implement our own version of a list that stores strings. The CustomStringArrayList class has three fields:
 *     String[] elements is an array for storing elements (ArrayList stores values in a similar array).
 *     Initially, its size is 10 (capacity = 10).
 *     int size stores the number of elements currently stored in the list. Its initial value is 0.
 *     int capacity is the current capacity of the elements array. It increases as data is added.
 * To simplify the implementation, we will have only two methods:
 *     A public add(String) method that adds an element to the array.
 *     This method will help us track when the array needs to dynamically expand.
 *     When the array is full (size == capacity), the grow() method is called to expand the array.
 *     A private grow() method that sets the elements field equal to a new array with a capacity (capacity)
 *     that is one and a half times larger than that of the old array and copies the data from the old array
 *     to the new one in the same order. The capacity field should increase along with the size of the array.
 * Requirements:
 *   . The CustomStringArrayList class should have private non-static int size, int capacity, and String[] elements fields.
 *   . The CustomStringArrayList class should have a no-argument constructor that initializes the size field to 0, the capacity field to 10, and the elements field to a new array whose size is determined by the capacity variable.
 *   . The CustomStringArrayList class should have a public void add(String) method.
 *   . The CustomStringArrayList class should have a private void grow() method.
 *   . The grow() method must work in accordance with the task conditions.
 *   . Do not change the add(String) method.
 */
public class MainCustomStringArrayList {

   /* public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }*/

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 25; i++) {
            arrayList.add(i);
        }

        //method 1
        // Conventional way of printing arraylist
        for (int number : arrayList) {
            System.out.print(number);
        }
        System.out.println();

        //method 2
        // Lambda Expression to print arraylist
        arrayList.forEach((Integer value) -> System.out.print(value));
        System.out.println();

        //method 3
        // Lambda Expression to print arraylist
        arrayList.forEach(value -> System.out.print(value));
        System.out.println();


        //method 4
        // Lambda Expression (method reference) to print arraylist
        arrayList.forEach(System.out::print);
    }

}

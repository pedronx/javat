package CodeGym.Level13.L07_Generics;

import java.util.ArrayList;

/**
 * Displaying different types on the console
 * The Solution class has a printAnything(ArrayList) method, which should take a list and display its contents on the console.
 * Currently, only a list of strings is accepted as input.
 * Your task is to correct the method so that a list with any data type is accepted
 * (you will need to remove the corresponding generic type to do this).
 * The main method is not checked.
 * Requirements:
 *   . Correct the signature of the printAnything method so that it accepts a list of any data type.
 */
public class DisplayingDifferentTypes {

    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}

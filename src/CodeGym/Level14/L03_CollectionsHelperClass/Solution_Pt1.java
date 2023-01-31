package CodeGym.Level14.L03_CollectionsHelperClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Studying the methods of the Collections class. Part 1
 * The Solution class declares the following methods: copy(ArrayList<String>, ArrayList<String>), addAll(ArrayList<String>, String ...), and replaceAll(ArrayList<String>, String, String). You need to rewrite them using only the appropriate methods of the Collections class.
 * The String ... parameter means the same thing as String[], but you get pass the arguments in a comma-delimited list.
 * Requirements:
 *   . The Solution class must have a public static copy(ArrayList<String>, ArrayList<String>) method with a void return type.
 *   . The Solution class must have a public static addAll(ArrayList<String>, String ...) method with a void return type.
 *   . The Solution class must have a public static replaceAll(ArrayList<String>, String, String) method with a void return type.
 *   . The copy(ArrayList<String>, ArrayList<String>) method must be rewritten using the Collections class's copy method.
 *   . The addAll(ArrayList<String>, String ...) method must be rewritten using the Collections class's addAll method.
 *   . The replaceAll(ArrayList<String>, String, String) method must be rewritten using the Collections class's replaceAll method.
 */
public class Solution_Pt1 {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}

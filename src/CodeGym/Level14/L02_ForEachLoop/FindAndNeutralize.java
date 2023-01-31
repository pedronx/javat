package CodeGym.Level14.L02_ForEachLoop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Find and neutralize
 * The Solution declares the following methods, which you need to implement:
 *     removeBugWithFor(ArrayList<String>) should use a for loop and a counter to remove strings from the list if they contain the word bug.
 *     removeBugWithWhile(ArrayList<String>) should use a while loop and the iterator() method to remove strings from the list if they contain the word bug.
 *     removeBugWithCopy(ArrayList<String>) should use a for-each loop and copy of the list to remove strings from the list if they contain the word bug.
 *     The word bug may appear with different combinations of uppercase and lowercase letters (BUg, BuG, etc.).
 * The main method is implemented for you and is not checked.
 * Requirements:
 *   . The Solution class must have a public static removeBugWithFor(ArrayList<String>) method with a void return type.
 *   . The Solution class must have a public static removeBugWithWhile(ArrayList<String>) method with a void return type.
 *   . The Solution class must have a public static removeBugWithCopy(ArrayList<String>) method with a void return type.
 *   . The removeBugWithFor(ArrayList<String>) method must work in accordance with the task conditions.
 *   . The removeBugWithWhile(ArrayList<String>) method must work in accordance with the task conditions.
 *   . The removeBugWithCopy(ArrayList<String>) method must work in accordance with the task conditions.
 */
public class FindAndNeutralize {

    public static void main(String[] args) {

        String line = "_________________________";

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        words = removeBugWithFor(wordsFirstCopy);
        words.forEach(System.out::println);
        System.out.println(line);

        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        words = removeBugWithWhile(wordsSecondCopy);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);

        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);
        words = removeBugWithCopy(wordsThirdCopy);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);

    }

    public static ArrayList removeBugWithFor(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().equals("bug")) {
               list.remove(list.get(i));
               i -= 1; // after removing 1 element from the list, the list has decreased size by 1
            }
        }
        return list;
    }

    public static ArrayList removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("bug")) {
                it.remove();
            }
        }
        return list;
    }

    public static ArrayList removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listcopy = new ArrayList<>(list);
        for (String str : listcopy) {
            if (str.toLowerCase().equals("bug")) {
                list.remove(str);
            }
        }
        return list;
    }
}

package CodeGym.Level14.L02_ForEachLoop;

import java.util.*;

/**
 * Converting an iterator to a for-each loop
 * The Solution class has the printHashSet(HashSet<String>) and printList(ArrayList<String>) methods, which display each element of the passed collections (a set and list, respectively) on a new line. Your task is to rewrite the methods so that they use a for-each loop.
 * The main method is not checked.
 * Requirements:
 *   . The Solution class must have a public static printHashSet(HashSet<String>) method with a void return type.
 *   . The Solution class must have a public static printList(ArrayList<String>) method with a void return type.
 *   . The printHashSet(HashSet<String>) method should print all the elements using a for-each loop.
 *   . The printList(ArrayList<String>) method should print all the elements using a for-each loop.
 */
public class MainIteratorConversion {

    public static void printList(ArrayList<String> words) {
        for (String str : words) {
            System.out.println(str);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String str : words) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "I think this will be a new feature. Just don't tell anyone that it was an accident.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}

package CodeGym.Level14.L01_HashSetCollection;

import java.util.HashSet;
import java.util.Set;
import static java.util.Arrays.asList;

/**
 * Verifying existence
 * The Solution class has a checkWords(String) method that should check whether the passed word is present in the words set.
 * If the word is present, then we display the following on the console:
 * The word [passed word] is in the set
 * If not:
 * The word [passed word] is not in the set
 * The main method is not checked.
 * Example output:
 * The word Java is in the set
 * Requirements:
 *   . The Solution class must have a public static HashSet<String> words field.
 *   . The Solution class must have a public static checkWords(String) method with a void return type.
 *   . The checkWords(String) method must work in accordance with the task conditions.
 */
public class MainExistence_Set {
    public static Set<String> words = new HashSet<>(asList("If they asked me to choose a language to replace Java, I wouldn't choose".split(" ")));

    public static void main(String[] args) {

        checkWords("JavaScript");
        checkWords("Java"); // not in the Set, split() method added word "Java,"
    }

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("The word " + word + " is in the set");
        } else {
            System.out.println("The word " + word + " is not in the set");
        }
    }
}
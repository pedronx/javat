package CodeGym.Level14.L02_ForEachLoop;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Displaying the elements of a set
 * The Solution class has a print(HashSet<String>) method that should display all the elements using the iterator() method.
 * The main method is not checked.
 * Requirements:
 *   . The Solution class must have a public static print(HashSet<String>) method with a void return type.
 *   . The print(HashSet<String>) method must work in accordance with the task conditions.
 */
public class MainSetForEach {

    // *IMPORTAT!* You can't change a collection while you are traversing it with an iterator.
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Programming is usually taught using examples.".split(" ")));
        String aString = "";
        HashSet<String> wCopy = new HashSet<>(words); // create a copy of the Set

        for(String str : wCopy) {
            aString = str.replace(".", ""); // check if any word has punctuation
            if(!aString.equals(str)) {
                words.remove(str); // remove it in the original Set
                words.add(aString); // add the correct word in the original Set
            }
            wCopy.clear();
        }
        print(words);
    }

    public static void print(HashSet<String> words) {
        for(String str : words) {
            System.out.println(str);
        }
    }
}

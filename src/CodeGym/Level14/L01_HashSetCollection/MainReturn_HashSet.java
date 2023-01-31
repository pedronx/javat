package CodeGym.Level14.L01_HashSetCollection;

import java.util.HashSet;

/**
 * Processing a return
 * The Solution class has a arrayToHashSet(String[]) method that should return a HashSet<String> containing the same elements as the passed array.
 * The main method is not checked.
 * Requirements:
 *   . The Solution class must have a public static HashSet<String> arrayToHashSet(String[]) method.
 *   . The arrayToHashSet(String[]) method must be implemented in accordance with the task conditions.
 */
public class MainReturn_HashSet {

    public static void main(String[] args) {
        String[] array = {"In", "three", "years", "I", "will be a", "senior", "Java", "developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            set.add(strings[i]);
        }
        return set;
    }
}

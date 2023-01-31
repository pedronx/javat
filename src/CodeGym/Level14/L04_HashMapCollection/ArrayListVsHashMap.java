package CodeGym.Level14.L04_HashMapCollection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ArraThe Solution class has a getProgrammingLanguages method that returns a list of programming languages. You need to rewrite this method so that it return a HashMap<Integer, String>. For this collection, the key will be the index of the element in the ArrayList.
 * Requirements: *
 *   . The Solution class should have a public static getProgrammingLanguages method that returns a HashMap<Integer, String>.
 *   . The getProgrammingLanguages() method should return a HashMap filled with the values in the list.
 */
public class ArrayListVsHashMap {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //write your code here
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        HashMap<Integer, String> program = new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            program.put(i, programmingLanguages.get(i));
        }
        return program;
    }
}

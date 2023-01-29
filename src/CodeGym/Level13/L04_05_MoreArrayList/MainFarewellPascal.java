package CodeGym.Level13.L04_05_MoreArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Farewell, Pascal
 * In the main method, find and remove the Pascal programming language from the programmingLanguages list.
 * Requirements:
 *   . The main method should remove Pascal from the programmingLanguages list.
 */
public class MainFarewellPascal {

    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {

        System.out.println("Original list of programming languages:");
        print();
        removeProgrammingLanguage("Pascal");
        System.out.println("\"Pascal\" removed. Updated list:");
        print();
    }

    public static void print() {
        for (int i = 0; i < programmingLanguages.size(); i++) {
            System.out.printf("%s %n", programmingLanguages.get(i));
        }
        System.out.println();
    }

    public static void removeProgrammingLanguage(String programmingLanguage) {

        programmingLanguages.remove(programmingLanguages.indexOf(programmingLanguage));
    }
}

package CodeGym.Level14.L01_HashSetCollection;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Collection 	    | Class 	    | Description
 * -----------------|---------------|------------
 * List             | ArrayList     | List
 *                  | LinkedList    | Linked list
 *                  | Vector        | Vector
 *                  | Stack         | Stack
 * -----------------|---------------|------------
 * Set              | HashSet       | Set
 *                  | TreeSet       | ""
 *                  | LinkedHashSet | ""
 * -----------------|---------------|------------
 * Queue            | PriorityQueue | Queue
 *                  | ArrayQueue    | ""
 * -----------------|---------------|------------
 * Map              | HashMap       | Map/Dictionary
 *                  | TreeMap       | ""
 *                  | HashTable     | ""
 * -----------------|---------------|------------
 */

/**
 * HashSet()
 * void add(Type value)         Adds the value element to the collection
 * boolean remove(Type value)   Removes the value element from the collection.
 *                              Returns true if there was such an element
 * boolean contains(Type value) Checks whether the collection has a value element
 * void clear()                 Clears the collection, removing all the elements
 * int size()                   Returns the number of elements in the collection
 */
public class ContainersAndCollections {

    public static void main() {

        // HashSet
        hashSet();
    }

    public static void hashSet() {
        HashSet<String> set = new HashSet<String>();

        set.add("Olá");
        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Ciao");
        set.add("Namaste");

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (set.contains(str))
            System.out.println("Goodbye!");
    }
}

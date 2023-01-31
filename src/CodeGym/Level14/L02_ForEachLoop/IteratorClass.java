package CodeGym.Level14.L02_ForEachLoop;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Iterator for a collection
 *      Iterator<Type> it = name.iterator();
 * >>>
 * Type next()          Returns the next element in the collection
 * boolean hasNext()    Checks whether there are any elements that have not been traversed yet
 * void remove()        Removes the current element of the collection
 */
public class IteratorClass {

    public static void main(String[] args) {

        // HashSet
        HashSet<String> set = new HashSet<String>();

        set.add("Olá");
        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Ciao");
        set.add("Namaste");

        Iterator<String> it = set.iterator();
        while (it.hasNext())
        {
            String str = it.next();
            System.out.println(str);
        }
    }
}

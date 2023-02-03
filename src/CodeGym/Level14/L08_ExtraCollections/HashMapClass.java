package CodeGym.Level14.L08_ExtraCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map (Dictionary)
 * Data in a Map is stored as key-value pairs.
 * Anything can serve as keys and values: numbers, strings, or objects of other classes.
 */
public class HashMapClass {

    public static void main(String[] args) {

        // HashMap
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put (212133, "Bridget Logan");
        passportsAndNames.put (162348, "Ivan the Great");
        passportsAndNames.put(8082771, "Donald John Trump");
        System.out.println(passportsAndNames);

        System.out.println("-".repeat(15));

        // try adding a new element with a key that has already been used in the map
        passportsAndNames.put(162348, "Albert Kent");// This key has already been used
        System.out.println(passportsAndNames);

        System.out.println("-".repeat(15));

        // get() & remove()
        String lidiaName = passportsAndNames.get(212133);
        System.out.println("Get Name with Passport nº " + 212133);
        System.out.println(lidiaName);

        passportsAndNames.remove(162348);
        System.out.println("\nRemove Name with Passport nº " + 162348);
        System.out.println(passportsAndNames);

        System.out.println("-".repeat(15));
        passportsAndNames.put (162348, "Ivan the Great");

        // containsKey() & containsValue()
        System.out.println("containsKey() - Is there a Name with Passport nº " + 162348 + " " );
        System.out.println(passportsAndNames.containsKey(11111));

        System.out.println("\ncontainsValue() - Is there a Passport nº with Name Donald John Trump");
        System.out.println(passportsAndNames.containsValue("Donald John Trump"));

        System.out.println("-".repeat(15));

        // keySet() & values()
        Set keys = passportsAndNames.keySet();
        System.out.println("Keys: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Values: " + values);

        System.out.println("-".repeat(15));

        // size() & clear()
        System.out.print("size(): " + passportsAndNames.size());
        passportsAndNames.clear();
        System.out.println("\nclear(): " + passportsAndNames);

        System.out.println("-".repeat(15));

        // isEmpty()
        passportsAndNames.put (212133, "Bridget Logan");
        passportsAndNames.put (162348, "Ivan the Great");
        passportsAndNames.put(8082771, "Donald John Trump");

        if (!passportsAndNames.isEmpty()) {
            System.out.println(passportsAndNames);
        } else {
            System.out.println("The list is empty!");
        }

        System.out.println("-".repeat(15));

        // putAll()
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames2.put(917352, "Clifford Patrick");
        passportsAndNames2.put(925648, "Mitchell Salgado");

        passportsAndNames.putAll(passportsAndNames2);
        System.out.println("putAll() new elements (Clifford Patrick, Mitchell Salgado):");
        System.out.println(passportsAndNames);

        System.out.println("-".repeat(15));

        // iterating over a HasMap in a loop
        // The Map.Entry class denotes the key-value pair inside the dictionary
        // The entrySet() method returns a list of all pairs in our HashMap.
        // Because our map consists of these 'Map.Entry' pairs, we're iterating over pairs, not separate keys or values.
        for (Map.Entry<Integer, String> entry: passportsAndNames.entrySet()) {
            System.out.println(entry);
        }
    }
}

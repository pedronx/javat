package CodeGym.Level14.L04_HashMapCollection;

import java.util.HashMap;

/**
 * HashMap class
 * The HashMap class is the most popular kind of Map collection. On the one hand, it is very similar to HashSet and has all its methods.
 * On the other hand, it is like a list (ArrayList) that can use words (or anything else) as its indices.
 * You can create a HashMap using a statement like this:
 *      HashMap<KeyType, ValueType> name = new HashMap<KeyType, ValueType>();
 * Method 	                                        | Description
 * -------------------------------------------------|-------------
 * void put(KeyType key, ValueType value)           | Adds the (key, value) pair to the collection
 * ValueType get(KeyType key)                       | Returns the value associated with a key
 * boolean containsKey(KeyType key)                 | Checks whether a key exists in the collection
 * boolean containsValue(ValueType value)           | Checks for the existence of a value in the collection
 * ValueType remove(KeyType key)                    | Removes an element from the collection
 * void clear()                                     | Clears the collection, removing all the elements
 * int size()                                       | Returns the number of key-value pairs in the collection
 * Set<KeyType> keySet()                            | Returns the set of keys in the collection
 * Collection<ValueType> values()                   | Returns a set containing the elements of the collection
 * Set<Map.Entry<KeyType, ValueType>> entrySet()    | Returns a set (Set) of all pairs (Map.Entry) in the collection.
 */
public class HashMapClass {

    public static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {

        // Adding elements to a HashMap
        addElements();
        System.out.println(map);

        System.out.println("-".repeat(15));

        // Subsets of a HashMap: the set of keys
        subsets();
    }

    public static void addElements() {
        map.put("Elon", 21);
        map.put("Jeff", 22);
        map.put("Bill", 48);
        map.put("Warren", null);
    }

    public static void subsets() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Elon", 21);
        map.put("Jeff", 22);
        map.put("Bill", 48);
        map.put("Warren", null);

        for (String key: map.keySet())
        {
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }
    }
}

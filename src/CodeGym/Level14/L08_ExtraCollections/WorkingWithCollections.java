package CodeGym.Level14.L08_ExtraCollections;

import java.util.*;

public class WorkingWithCollections {

    public static void main(String[] args) {

        // Iterable.forEach(Consumer <? Super T> action)
        // It iterates over the collection passed as an argument, and executes the action lambda expression for each of its elements.
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        numbers.forEach(s -> System.out.print(s + " "));

        System.out.println("\n" + "-".repeat(23));

        // Collection.removeIf(Predicate<? super E> filter)
        // The method iterates over the collection and removes any elements that match filter
        numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        numbers.removeIf(s -> s > 5); // remove from the list all numbers greater than 5.
        numbers.forEach(s -> System.out.print(s + " "));

        System.out.println("\n" + "-".repeat(23));

        // Map.forEach(BiConsumer <? super K, ? super V> action)
        // The forEach method works not only for classes that implement the Collection interface, but also for Map.
        Map<String, String> books = new HashMap<>();
        books.put("War and Peace", "Leo Tolstoy");
        books.put("Crime and Punishment", "Fyodor Dostoevsky");
        books.put("Thinking in Java", "Bruce Eckel");
        books.put("The Brothers Karamazov", "Fyodor Dostoevsky");
        books.put("The Lord of the Rings", "John Tolkien");
        books.forEach((a,b) -> System.out.println("Book title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));

        // Map.compute (K key, BiFunction<? Super K,? Super V,? Extends V> remappingFunction)
        // This method sets key's value equal to result of executing mappingFunction.
        books.compute("Thinking in Java", (a,b) -> b + ", cool dude");
        System.out.println("New updated Java book title:\n");
        books.forEach((a,b) -> System.out.println("Book title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));

        // Map.computeIfAbsent(K key, Function <? super K, ? extends V> mappingFunction)
        // This method will add a new element to the Map, but only if it does not already have an element with that key.
        // The assigned value will be the result of executing the mappingFunction.
        // If an element with the key already exists, it will not be overwritten. It will simply remain as is.
        books.computeIfAbsent("Harry Potter and the Prisoner of Azkaban", b -> getHarryPotterAuthor());
        books.computeIfAbsent("The Lord of the Rings", b -> "John Tolkien");
        System.out.println("Compute if Absent the following books:\nHarry Potter and the Prisoner of Azkaban & The Lord of the Rings\n");
        books.forEach((a,b) -> System.out.println("Book title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));

        // Map.computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        // The same principle as Map.compute(), but the calculations are performed only if an item with key already exists.

        // The call to the function makes no changes, because there is no book entitled "Eugene Onegin" in our Map.
        books.computeIfPresent("Eugene Onegin", (a,b) -> b = "Alexander Pushkin");
        System.out.println("Verify the presence of book: Eugene Onegin, Alexander Pushkin\n");
        books.forEach((a,b) -> System.out.println("Book title: " + a + ". Author: "+ b));

        // the call updates the author of the book "The Brothers Karamazov" to Alexander Pushkin.
        System.out.println("-".repeat(23));
        books.computeIfPresent("The Brothers Karamazov", (a,b) -> b = "Alexander Pushkin");
        System.out.println("Verify the presence of book: The Brothers Karamazov, Alexander Pushkin\n");
        books.forEach((a,b) -> System.out.println("Book title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));

        // Map.getOrDefault(Object key, V defaultValue)
        // Returns the value corresponding to key. If the key does not exist, then it returns the default value.
        System.out.println("Verify the presence of book: The Tale of Igor's Campaign\n");
        String igor = books.getOrDefault("The Tale of Igor's Campaign", "Unknown author");
        System.out.println(igor);

        System.out.println("-".repeat(23));

        // Map.merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        // 1. If key does not exist in your Map, or if the value for this key is null, then the method adds the passed key-value pair to the Map.
        // 2. If key does exist and its value != null, then the method changes its value to the result of executing remappingFunction.
        // 3. If remappingFunction returns null, then key is removed from the collection.
        System.out.println("Merge \"Thinking in Java\", \"Bruce Eckel\" -> \"and some coauthor\"\n");
        books.merge("Thinking in Java", "Bruce Eckel", (a, b) -> b + " and some coauthor");
        books.forEach((a, b) -> System.out.println("Title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));

        // Map.putIfAbsent(K key, V value)
        // Add a pair to a Map, if it's' not already there
        books.putIfAbsent("Lord of the Rings", "John Tolkien");
        books.putIfAbsent("Memorial do Convento", "José Saramago");
        System.out.println("Verify the presence of books:\nLord of the Rings & Memorial do Convento\n");
        books.forEach((a, b) -> System.out.println("Title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));

        // Map.replace and Map.replaceAll()
        // Map.replace(K key, V newValue)   -> replaces key's value with newValue, if such a key exists. If not, nothing happens.
        // Map.replace(K key, V oldValue, V newValue)   -> does the same thing, but only if the current value for key is equal to oldValue.
        // Map.replaceAll(BiFunction<? super K, ? super V, ? extends V> function)   -> replaces each value with the result of function.

        // The current value for the key "The Brothers Karamazov" is "Fyodor Dostoevsky", not "Bruce Eckel", so nothing changes.
        books.replace("The Brothers Karamazov", "Bruce Eckel", "John Tolkien");
        System.out.println("Replace Author \"Bruce Eckel\" by \"John Tolkien\", in book The Brothers Karamazov\"\n");
        books.forEach((a, b) -> System.out.println("Title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));
        books.replaceAll((a,b) -> getCoolAuthor());
        System.out.println("Replace all Authors by \"Cool author\"\n");
        books.forEach((a, b) -> System.out.println("Title: " + a + ". Author: "+ b));

        System.out.println("-".repeat(23));

        // Another example of replaceAll()
        // create an HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        // add entries to the HashMap
        languages.put(1, "java");
        languages.put(2, "javascript");
        languages.put(3, "python");
        System.out.println("HashMap: " + languages);

        // Change all value to uppercase
        languages.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("\nChange all values to uppercase");
        System.out.println("Updated HashMap: " + languages);
    }

    public static String getHarryPotterAuthor() {
        return "Joanne Rowling";
    }

    public static String getCoolAuthor() {
        return "Cool author";
    }
}

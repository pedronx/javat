package CodeGym.Level15.L06_StackTrace;

import java.util.ArrayList;
import java.util.List;

/**
 * Stacks at home
 * In the MyStack class, you need to implement your own version of the stack data structure based on an ArrayList.
 * All the elements are stored in a private list variable named storage. Your task is to implement all the declared methods of the MyStack class.
 * Where the push(String) method adds an element to the front of the storage list. The pop() method returns the first element of the storage list, and then removes it from the list. The peek() method returns the first element of the storage list.
 * The empty() method checks whether the storage list is empty. The search(String) method searches for an element in the storage list and returns its index. If the element is not in the list, it returns -1.
 * Requirements:
 *   . The push(String) method must be implemented in accordance with the task conditions.
 *   . The pop() method must be implemented in accordance with the task conditions.
 *   . The peek() method must be implemented in accordance with the task conditions.
 *   . The empty() method must be implemented in accordance with the task conditions.
 *   . The search(String) method must be implemented in accordance with the task conditions.
 */
public class MyStack {

    private final List<String> storage = new ArrayList<>();

    // adds an element to the front of the storage list
    public void push(String s) {
        storage.add(0, s);
    }


    // returns the first element of the storage list, and then removes it from the list
    public String pop() {
        return storage.remove(0);
    }


    // returns the first element of the storage list.
    public String peek() {
        return storage.get(0);
    }


    // Returns:
    //true if this list contains no elements
    public boolean empty() {
        return storage.isEmpty();
    }


    // Returns the index of the first occurrence of the specified element in this list
    // or -1 if this list does not contain the element
    public int search(String s) {
        return storage.indexOf(s);
    }
}

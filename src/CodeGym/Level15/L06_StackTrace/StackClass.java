package CodeGym.Level15.L06_StackTrace;

import java.util.Stack;

/**
 * Stack Class
 * data structure to which you can add elements and from which you can retrieve elements.
 * In doing so, you can only take elements from the end: you first take the last one added, then the second to last one added, etc.
 * . T push(T obj)              Adds the obj element to the top of the stack
 * . T pop()                    Takes the element from the top of the stack (the stack depth decreases)
 * . T peek()                   Returns the item at the top of the stack (the stack does not change)
 * . boolean empty()            Checks whether the collection is empty
 * . int search(Object obj)     Searches for an object in the collection and returns its index
 *
 */
public class StackClass {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack original: " + stack);

        int x = stack.pop();
        System.out.println("\npop() 1st: " + x);
        System.out.println("Stack updated: " + stack);


        stack.push(4);
        int y = stack.peek();
        System.out.println("\npush() 4 ");
        System.out.println("peek(): " + y);
        System.out.println("Stack updated: " + stack);

        stack.pop();
        stack.pop();
        System.out.println("\npop() 2 times ");
        System.out.println("Stack updated: " + stack);
    }
}

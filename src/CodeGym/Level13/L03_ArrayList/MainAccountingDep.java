package CodeGym.Level13.L03_ArrayList;

/**
 * Creating an ArrayList object
 * To create an ArrayList object, you need to write code like this:
 *      ArrayList<TypeParameter> name = new ArrayList<TypeParameter>();
 * Where ArrayList is the collection type/class,
 * TypeParameter is the type of the elements stored in the ArrayList collection,
 * and name is the name of an ArrayList<TypeParameter> variable.
 * >>>
 * void add(Type value)			    Adds the passed element to the list
 * void add(int index, Type value)	Adds an element to a specific location in the list.
 * Type get(int index)				Returns the element whose index is index
 * void set(int index, Type value)	Assigns value to the element whose index is index
 * Type remove(int index)			Removes the element whose index is index. Returns the removed element.
 * Type remove(Type value)			Removes the element that you pass to the method. If there is more than one such element, the first one will be removed.
 * void clear()					    Clears the list, i.e. removes all elements from the list.
 * boolean contains(Type value)	    Checks whether the list contains value.
 * boolean isEmpty()				Checks whether the list is empty or not. In other words, whether the length of the list is zero.
 * int size()						Returns the size of the list, i.e. the number of elements in the list.
 * Type[] toArray(Type[] array)	    Returns an array containing the elements of the list. You need to pass the array to the method.
 */

import java.util.ArrayList;

/**
 * Accounting department
 * The Solution class has a list of employees who are waiting to receive their salary (waitingEmployees),
 * and a list of employees who already received it (alreadyGotSalaryEmployees).
 * You need to implement the paySalary(String) method whose input parameter
 * is the name of an employee who wants to receive his or her salary.
 * The method should check whether the employee is in the waitingEmployees list.
 * If the employee did not receive his or her salary, then pay it:
 *     If the paySalary(String) method's input parameter is null, then don't do anything.
 *     Add the employee's name to the alreadyGotSalaryEmployees list.
 *     In the waitingEmployees list, replace the employee's name with null.
 * Requirements:
 *   . The paySalary(String) method should add the employee's name to the alreadyGotSalaryEmployees list if it exists in the waitingEmployees list.
 *   . The paySalary(String) method should replace the employee's name with null if it exists in the waitingEmployees list.
 *   . The paySalary(String) method should not modify the waitingEmployees and alreadyGotSalaryEmployees lists if the passed name is not present in the waitingEmployees list.
 *   . If null is passed to the paySalary(String) method, the method should not add null to the waitingEmployees or alreadyGotSalaryEmployees list.
 */
public class MainAccountingDep {

    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Doc");
        waitingEmployees.add("Grumpy");
        waitingEmployees.add("Happy");
        waitingEmployees.add("Sleepy");
        waitingEmployees.add("Bashful");
        waitingEmployees.add("Sneezy");
        waitingEmployees.add("Dopey");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {

        if (name == null) {
            return;
        }

        if (waitingEmployees.contains(name)) {
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}

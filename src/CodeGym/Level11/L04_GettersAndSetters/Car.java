package CodeGym.Level11.L04_GettersAndSetters;

import java.util.Objects;

/**
 * Java programmers have a universal agreement that if they write their own implementation of the equals() method
 * and thereby override the standard implementation (in the Object class), they must also write their own
 * implementation of the hashCode() method in such a way that the aforementioned rules are satisfied.
 * This arrangement is called a contract.
 * That means that if you give your own class an equals method, but you do not write your own hashCode() method,
 * or you implement it incorrectly, then collections may not work correctly with your objects.
 * For example, you might add an object to a list and then search for it using
 * the contains() method, but the collection might not find your object.
 */

/**
 * Create our own hashCode
 * Write your own implementation of hashCode that uses the model and year variables. If these fields are the same for two objects, then the same hashCode should be returned. If the hashCode method is correctly implemented, the output should look like this:
 * true
 * true
 * true
 * true
 * false
 * false
 * Requirements:
 *   . Do not modify the main method.
 *   . The hashCode(int) method must be overridden in the Car class.
 *   . Implement the hashCode method so that the output of the program matches the task conditions.
 */
public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}

package CodeGym.Level12.L04_StaticClasses;

/**
 * Objects of inner and nested classes
 * The Outer class has an inner (Inner) and a nested (Nested) class. In the main method of the Solution class, create one object of each of them.
 * Requirements:
 *   . An object of the Inner class must be created in the main method of the Solution class.
 *   . An object of the Nested class must be created in the main method of the Solution class.
 *   . Don't change the Outer class.
 */
public class MainNestedClasses {

    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}

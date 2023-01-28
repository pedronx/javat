package CodeGym.Level12.L04_StaticClasses;

public class Outer {

    class Inner {
        Inner() {
            System.out.println("Creating an object of an inner class");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Creating an object of a nested class");
        }
    }
}

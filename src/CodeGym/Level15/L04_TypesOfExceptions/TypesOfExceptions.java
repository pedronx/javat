package CodeGym.Level15.L04_TypesOfExceptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Types of exceptions
 * All exceptions are divided into 4 types, which are actually classes that inherit one another.
 * . Throwable class
 *      The base class for all exceptions is the Throwable class. The Throwable class contains the code
 *      that writes the current call stack (stack trace of the current method) to an array.
 *      The throw operator can only accept an object that derives from the Throwable class.
 *      And although you can theoretically write code like throw new Throwable();, nobody usually does this.
 *      The main purpose of the Throwable class is to have a single parent class for all exceptions.
 * . Error class
 *      Directly inherits the Throwable class.
 *      The Java machine creates objects of the Error class (and its descendants) when serious problems have occurred.
 *      For example, a hardware malfunction, insufficient memory, etc.
 *      These errors are too serious. All you can do is notify the user that the program is crashing
 *      and/or write all known information about the error to the program log.
 * . Exception class
 *      The Exception and RuntimeException classes are for common errors that happen in the operation of lots of methods.
 *      The goal of each thrown exception is to be caught by a catch block that knows how to properly handle it.
 *      When a method cannot complete its work for some reason, it should immediately notify the calling method
 *      by throwing an exception of the appropriate type.
 *      Ex.
 *          . If a variable is equal to null, the method will throw a NullPointerException
 *          . If the incorrect arguments were passed to the method, it will throw an InvalidArgumentException
 *          . If the method accidentally divides by zero, it will throw an ArithmeticException
 * . RuntimeException class
 *      RuntimeExceptions are a subset of Exceptions.
 *      We could even say that RuntimeException is a lightweight version of ordinary exceptions (Exception)
 *      fewer requirements and restrictions are imposed on such exceptions.
 */
public class TypesOfExceptions {

    private static List<Integer> integers = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {

        // checked exception
        calculate(10);

        // multiple checked exceptions
        differentCalculate(99);

        // unchecked exception
        anotherCalculate(52);

        // new example
        try {
            addInteger(1);
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }


    }

    // checked exception
    public static void calculate(int n) throws Exception {
        if (n == 0)
            throw new Exception("n is null!");
    }


    // multiple checked exceptions (not necessary to have it in the method signature, 'Exception' is already a generic one)
    public static void differentCalculate(int n) throws Exception
    {
        if (n == 0)
            throw new Exception("n is null!");
        if (n == 1)
            throw new IOException("n is 1");
    }

    // unchecked exception
    public static void anotherCalculate(int n) {
        if (n == 0)
            throw new RuntimeException("n is null!");
    }

    public static void addInteger(Integer value) throws IllegalArgumentException {
        if (integers.contains(value)) {
            throw new IllegalArgumentException("Integer already added.");
        }
        integers.add(value);
    }
}

package CodeGym.Level15.L06_StackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class MoreExceptions {

    public static void main(String[] args) {

        Print print = new Print();
        List list = Arrays.asList("first step", null, "second step");

        for (Object s : list) {
            try {
                print.print((String)s);
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception handled. The program will continue");
            }
            finally {
                System.out.println("Inside finally block");
            }
            System.out.println("The program is running...");
            System.out.println("-----------------");
        }
    }

    // This method reads a string from the keyboard
    public String input() throws MyException { // Use throws to warn

        // that the method may throw a MyException
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        // We use a try block to wrap code that might create an exception. In this case,
        // the compiler tells us that the readLine() method in the
        // BufferedReader class might throw an I/O exception
        try {
            s = reader.readLine();
          // We use a catch block to wrap the code that handles an IOException
        } catch (IOException e) {
            System.out.println(e.getMessage());

        // We close the read stream in the finally block
        } finally {
            // An exception might occur when we close the stream if, for example, the stream was not open, so we wrap the code in a try block
            try {
                reader.close();
            // Handle exceptions when closing the read stream
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            if (s.equals("")) {
                // We've decided that an empty string will prevent our program from working properly.
                // For example, we use the result of this method to call the substring(1, 2) method.
                // Accordingly, we have to interrupt the program by using throw to generate our own MyException exception type.
                throw new MyException();
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
}

class MyException extends RuntimeException {

    MyException() {
        System.out.println("The string cannot be empty!");
    }
}

class Print {

    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside print method: " + s);
    }
}
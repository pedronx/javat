package CodeGym.Level15.L03_ThrowingExceptions;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Throwing exceptions
 */
public class ThrowingExceptions {

    public static void main(String[] args) throws IOException {

        // throw operator
//        catchException();

        System.out.println("-".repeat(15));

//        throwException();

        // finally keyword
        finallyKeyword();
    }

    public static void catchException() {

        try
        {
            int d = 2/0;
        }
        catch(Exception except)
        {
            System.out.println("Caught the exception");
        }
    }

    public static void throwException() {
        try
        {
            int d = 2/0;
        }
        catch(Exception except)
        {
            System.out.println("Caught the exception");
            throw except;
        }

        try
        {
            throw new RuntimeException();
        }
        catch(Exception except)
        {
            System.out.println("Caught the exception");
        }
    }

    public static void finallyKeyword() throws IOException {
        FileInputStream source = null;
        try
        {
            source = new FileInputStream("c:\\note.txt");
            source.read();
        }
        catch(Exception except)
        {
            System.out.println("Caught the exception");
            throw except;
        }
        finally
        {
            if (source != null)
                source.close();
        }
    }
}

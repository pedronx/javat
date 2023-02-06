package CodeGym.Level16.L04_OutputStreams;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * PrintStream class
 * Output stream classes can also be put into a chain with intermediary streams
 * that write data to the target stream passed to them.
 * The most interesting and versatile of all intermediate output streams is PrintStream.
 * It has tens of methods and as many as 12 constructors.
 * The PrintStream class inherits the FilterOutputStream class, which inherits OutputStream.
 * That means that the PrintStream class has all the methods of the parent classes in addition to its own methods.
 * -----------------------------------------
 * void print(obj)                       Converts the passed object to a string and outputs it to the target stream.
 * void println(obj)                     Converts the passed object to a string and outputs it to the target stream.
 *                                       Adds a line break at the end
 * void println()                        Outputs a line break character to the target stream
 * PrintStream format(String format, args...)   Constructs and outputs a string based on the format string and the passed arguments; similar to the String.format() method
 */
public class PrintStreamClass {

    public static void main(String[] args) {

        // ByteArrayOutputStream chained with PrintStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try(PrintStream stream = new PrintStream(baos))
        {
            stream.println("Hello");
            stream.println(123);
        }

        String result = baos.toString();

        System.out.println(result);
    }
}

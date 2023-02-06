package CodeGym.Level16.L04_OutputStreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Back to the front
 * In this task, you need to use a PrintStream to reverse the output.
 * The printSomething(String) method outputs the passed string to the stream field.
 * You need to use a PrintStream to reverse the output.
 * The main(String[] args) method reads a string from the keyboard and passes it to the printSomething
 */
public class BackToTheFront {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        // printSomething("Hello");
        String result = outputStream.toString();
        outputStream.reset(); // Resets the count field of this ByteArrayOutputStream to zero,
                              // so that all currently accumulated output in the output stream is discarded.
                              // The output stream can be used again, reusing the already allocated buffer space.

        StringBuilder stringBuilder = new StringBuilder(result);
        String reverse = stringBuilder.reverse().toString();

        printSomething(reverse);
        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }

}

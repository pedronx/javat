package CodeGym.Level16.L04_OutputStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Writer class
 * The Writer class is exactly the same as the OutputStream class,
 * but just one difference once again: it works with characters (char) instead of bytes.
 * This is an abstract class: you cannot create objects of the Writer class.
 * Its main goal is to be a common parent class for hundreds of descendant classes
 * and to give them common methods for working with character streams.
 * -----------------------------------------
 * Writer class
 * void write(int b)                   Writes one character (not an int) to the stream.
 * void write(char[] buffer)           Writes an array of characters to the stream
 * void write(char[] buffer, off, len) Writes part of an array of characters to the stream
 * void write(String str)              Writes a string to the stream
 * void write(String str, off, len)    Writes part of a string to the stream
 * void flush()                        Writes all the data stored in the buffer to the stream
 * void close()                        Closes the stream
 */
public class WriterClass {

    public static void main(String[] args) {

        // Writer class
        String src = "src/CodeGym/Level16/L04_OutputStreams/log.txt";
        String dest = "src/CodeGym/Level16/L04_OutputStreams/writer_copy.txt";

        try(FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(dest))
        {
            char[] buffer = new char[65536]; // 128Kb
            while (reader.ready())
            {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // StringWriter class
        StringWriter writer = new StringWriter();
        writer.write("Hello");
        writer.write(String.valueOf(123));

        String result = writer.toString();
    }
}

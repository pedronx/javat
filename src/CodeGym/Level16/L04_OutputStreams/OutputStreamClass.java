package CodeGym.Level16.L04_OutputStreams;

import java.io.*;

/**
 * OutputStream class
 * The OutputStream class is the parent class for all classes that support byte output.
 * This is an abstract class that does nothing on its own, but it has descendant classes for every occasion.
 * this class operates on bytes, and not, for example, characters or other data types.
 * And the fact that it is abstract means that we usually do not use it, but rather one of its descendant classes.
 * For example, FileOutputStream and the like.
 * -----------------------------------------
 *  OutputStream class
 *  void write(int b)                       Writes one byte (not an int) to the stream.
 *  void write(byte[] buffer)               Writes an array of bytes to the stream
 *  void write(byte[] buffer, off, len)     Writes part of an array of bytes to the stream
 *  void flush()                            Writes all the data stored in the buffer to the stream
 *  void close()                            Closes the stream
 */
public class OutputStreamClass {

    public static void main(String[] args) {
        // OutputStream class
        String src = "src/CodeGym/Level16/L04_OutputStreams/log.txt";
        String dest = "src/CodeGym/Level16/L04_OutputStreams/outputstream_copy.txt";

        try(FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest))
        {
            byte[] buffer = new byte[65536]; // 64Kb
            while (input.available() > 0)
            {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

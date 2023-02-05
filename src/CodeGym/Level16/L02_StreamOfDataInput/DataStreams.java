package CodeGym.Level16.L02_StreamOfDataInput;

/**
 * Streams are a versatile tool.
 * They allow the program to receive data from anywhere (input streams) and send data anywhere (output streams).
 * Thus, there are two types:
 *     An input stream is for receiving data
 *     An output stream is for sending data
 * -----------------------------------------
 * InputStream class
 * int read()               Reads one byte from the stream
 * int read(byte[] buffer)  Reads an array of bytes from the stream
 * byte[] readAllBytes()    Reads all the bytes from the stream
 * long skip(long n)        Skips n bytes in the stream (reads and discards them)
 * int available()          Checks how many bytes are left in the stream
 * void close()             Closes the stream
 * -----------------------------------------
 * Reader class
 * int read()               Reads one char from the stream
 * int read(char[] buffer)  Reads an char array from the stream
 * long skip(long n)        Skips n chars in the stream (reads and discards them)
 *  boolean ready()         Checks whether there is still something left in the stream
 *  void close()            Closes the stream
 */
public class DataStreams {
}

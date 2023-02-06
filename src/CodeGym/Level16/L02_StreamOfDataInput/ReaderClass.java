package CodeGym.Level16.L02_StreamOfDataInput;

import java.io.*;

/**
 * Reader Class
 * The Reader class is a complete analogue of the InputStream class.
 * The only one difference is that it works with characters (char), not with bytes.
 * Just like the InputStream class, the Reader class is not used anywhere on its own:
 * it is the parent class for hundreds of descendant classes and defines common methods for all of them.
 */
public class ReaderClass {

    public static void main(String[] args) {
        String src = "src/CodeGym/Level16/L02_StreamOfDataInput/log.txt";
        String dest = "src/CodeGym/Level16/L02_StreamOfDataInput/reader_copy.txt";


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
    }
}

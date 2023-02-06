package CodeGym.Level16.L04_OutputStreams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Writing bytes to a file
 * Amigo has been assigned the task of writing bytes to a file. He wrote a program that reads a path to a file
 * from the console and writes to this file a sequence of bytes obtained from the argument passed
 * to the main(String[]) method. But he made a mistake as he wrote the program.
 * As you already know, BufferedWriter "doesn't work" with bytes:
 * to write bytes to a file, you need to use the write(Path, byte[]) method of the Files class.
 * A Path object can be obtained using the static Path.of() method, passing in the file path read from the console.
 * This is how it looks: Path.of(scanner.nextLine()). Help Amigo fix the program.
 * Requirements:
 *   . The program should read a path to a file from the console.
 *   . The program should write bytes to a file.
 *   . The write(Path, byte[]) method of the Files class must be used to write bytes.
 *   . Do not use the following classes from the java.io package:
 *     File, FileInputStream, FileOutputStream, FileReader, FileWriter.
 */
public class WritingBytesToAFile {

    // String src = "src/CodeGym/Level16/L04_OutputStreams/log.txt";
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter out = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            out.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

        /*try {
            byte[] bytes = args[0].getBytes();
            Scanner scanner = new Scanner(System.in);
            Files.write(Path.of(scanner.nextLine()), bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/
    }
}

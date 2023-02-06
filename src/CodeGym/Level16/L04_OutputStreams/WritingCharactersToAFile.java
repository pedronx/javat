package CodeGym.Level16.L04_OutputStreams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Writing characters to a file
 * There is a program that reads a path to a file from the console and writes to this file a sequence of characters obtained from the argument passed to the main(String[]) method.
 * Your task is to fix a bug so that the character array can be written to the file.
 * To write characters to a file, you need to use a BufferedWriter object obtained by calling the newBufferedWriter(Path) method of the Files class.
 * Requirements:
 *   . The program should read a path to a file from the console.
 *   . The program must rewrite the characters in the file.
 *   . The BufferedWriter returned by calling the newBufferedWriter(Path) method of the Files class should be used to write characters.
 *   . The stream for writing must be closed.
 *   . Do not use the following classes: File, FileInputStream, FileOutputStream, FileReader, FileWriter (of the java.io package).
 */
public class WritingCharactersToAFile {

    // String src = "src/CodeGym/Level16/L04_OutputStreams/log.txt";
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine())))
        {
            bufferedWriter.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

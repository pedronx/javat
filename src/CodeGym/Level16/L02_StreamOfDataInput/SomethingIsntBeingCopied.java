package CodeGym.Level16.L02_StreamOfDataInput;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Something isn't being copied
 * There is a program that reads the path to file1 and the path to file2 from the console and copies the contents of file1 to file2.
 * But it doesn't work correctly. Find and fix errors in the code so that the program works as it should.
 * Requirements:
 *   . The program should read file paths from the console.
 *   . The program must rewrite the contents from one file to another.
 *   . Streams for reading and writing must be closed.
 *   . Do not use the following classes: File, FileInputStream, FileOutputStream, FileReader, FileWriter (of the java.io package).
 */
public class SomethingIsntBeingCopied {

    /*
        src = "src/CodeGym/Level16/L02_StreamOfDataInput/log.txt";
        dest = "src/CodeGym/Level16/L02_StreamOfDataInput/test_copy.txt";
    */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 65536;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read(buffer);
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

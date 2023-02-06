package CodeGym.Level16.L03_ChainedStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Not all shall pass
 * Write a program that reads the name of a text file from the console, then reads lines from this file (use the readAllLines(Path) method of the Files class) and displays every other line on the screen, starting with the first.
 * Requirements:
 *   . The program should read a path to a file from the console.
 *   . The program should display the contents of the file on the console in accordance with the task conditions.
 *   . To read lines from a file, use the readAllLines(Path) method of the Files class.
 *   . Do not use the following classes: File, FileInputStream, FileOutputStream, FileReader, FileWriter (of the java.io package).
 */
public class NotAllShallPass {

    // String src = "src/CodeGym/Level16/L03_ChainedStreams/logmultiplelines.txt";
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            int index = 0;
            for (String str : lines) {
                if (index % 2 == 0) {
                    System.out.println(str);
                }
                index++;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

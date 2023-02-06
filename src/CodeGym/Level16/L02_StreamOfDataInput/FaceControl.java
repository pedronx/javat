package CodeGym.Level16.L02_StreamOfDataInput;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Face control
 * Write a program that reads the name of a text file from the console, then reads characters from this file (use the readAllLines(Path) method of the Files class) and displays everything except periods, commas, and spaces.
 * Requirements:
 *   . The program should read a path to a file from the console.
 *   . The program should display the contents of the file on the console in accordance with the task conditions.
 *   . To read lines from the file, the readAllLines(Path) method of the Files class should be used.
 *   . Do not use the following classes: File, FileInputStream, FileOutputStream, FileReader, FileWriter (of the java.io package).
 */
public class FaceControl {

    public static void main (String[] args) {
        // String src = "src/CodeGym/Level16/L02_StreamOfDataInput/facecontrol.txt";

        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            lines.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char character : chars) {
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

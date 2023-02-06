package CodeGym.Level16.L02_StreamOfDataInput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Mixed-up bytes
 * Write a program that reads the path to file1 and the path to file2 from the console. Then it writes all the bytes from file1 to file2, but in doing so it swaps them according to this rule: swap the first with the second, the third with the fourth, and so on.
 * If the last byte in file1 is odd, then write it to file2 as is. To read and write files, use the newInputStream and newOutputStream methods of the Files class.
 * Requirements:
 *   . The program should read file paths from the console.
 *   . The program must rewrite bytes from one file to another in accordance with the task conditions.
 *   . To read and write files, the newInputStream and newOutputStream methods of the Files class should be used.
 *   . Streams for reading and writing must be closed.
 *   . Do not use the following classes from the java.io package: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
 */
public class MixedUpBytes {

    /* src = "src/CodeGym/Level16/L02_StreamOfDataInput/log.txt";
        dest = "src/CodeGym/Level16/L02_StreamOfDataInput/test_copy.txt"; */
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader (new InputStreamReader(System.in))) {
            System.out.print("Enter path of file nr. 1: ");
            String src = reader.readLine();
            System.out.print("Enter path of file nr. 2: ");
            String dest = reader.readLine();
            try (FileInputStream input = new FileInputStream(src);
                 FileOutputStream output = new FileOutputStream(dest)) {
                byte[] buffer = new byte[65536]; // 64Kb
                while (input.available() > 0)
                {
                    int real = input.read(buffer);
                    output.write(buffer, 0, real);
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

        // CodeGym solution
        /*try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            outputStream.write(bytesOut);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }*/
    }
}

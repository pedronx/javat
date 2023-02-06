package CodeGym.Level16.TryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Lot of resources
 */
public class LotOfResources {

    public static void main(String[] args) throws IOException {
        /*Scanner scanner = null;
        BufferedReader bufferedReader = null;
        try {
            scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            bufferedReader = Files.newBufferedReader(Path.of(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }*/

        try (Scanner scanner = new Scanner(System.in))
        {
            String fileName = scanner.nextLine();
            try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }
}

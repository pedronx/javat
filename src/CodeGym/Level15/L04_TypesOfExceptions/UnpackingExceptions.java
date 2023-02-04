package CodeGym.Level15.L04_TypesOfExceptions;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/**
 * Unpacking exceptions
 * In the main method, catch RuntimeExceptions. Determine what kind of exception is stored in them.
 * If it is a FileNotFoundException, display the following message on the console: "Unable to read file.". If it is a FileSystemException, then display "Unable to write file.".
 * Requirements:
 *   . The main method should catch RuntimeExceptions.
 *   . You need to output "Unable to read file." if a FileNotFoundException is wrapped in a RuntimeException.
 *   . You need to output "Unable to write to file." if a FileSystemException is wrapped in a RuntimeException.
 *   . Don't change the FileManager class.
 */
public class UnpackingExceptions {

    public static final String FAILED_TO_READ = "Unable to read file.";
    public static final String FAILED_TO_WRITE = "Unable to write to file.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {

        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException e) {
            if (e.getCause() instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (e.getCause() instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}

class FileManager {

    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Reading the file contents: " + filePath);
    }

    private void writeFile(String filePath) throws FileSystemException {
        System.out.println("Writing data to the file: " + filePath);
    }

    public void copyFile(String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException | FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}
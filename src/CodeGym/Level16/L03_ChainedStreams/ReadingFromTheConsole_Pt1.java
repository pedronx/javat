package CodeGym.Level16.L03_ChainedStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Reading from the console
 * The program reads a string from the console and displays it on the screen, alternating the case of characters: the first character is lowercase, the second is uppercase, the third is lowercase, and so on.
 * Without changing the functionality of the program, rewrite the code using a BufferedReader to read from the console.
 * Requirements:
 *   . The program should read a line from the console and display it on the screen, alternating the case of characters.
 *   . To read from the console, the program should use BufferedReader instead of Scanner.
 */
public class ReadingFromTheConsole_Pt1 {

    public static void main(String[] args) {
        /*try (InputStream stream = System.in;
             Scanner console = new Scanner(stream)) {
            String line = console.nextLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }*/

        try (InputStream stream = System.in;
             InputStreamReader reader = new InputStreamReader(stream);
             BufferedReader buff = new BufferedReader(reader)) {
            String line = buff.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}

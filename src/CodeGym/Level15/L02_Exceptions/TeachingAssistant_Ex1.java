package CodeGym.Level15.L02_Exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Teaching assistant
 * The program reads a number from the console, finds the corresponding student in the list, and calls on him or her to answer.
 * But there is a problem: if the list doesn't contain a student with the desired number, then the program ends with an ArrayIndexOutOfBoundsException. Wrap one line in a try-catch block to keep the program running.
 * In the catch block, display the message "A student with this number does not exist".
 * Requirements:
 *   . One line should be wrapped in a try-catch block.
 *   . The program should continue to work if an invalid number is entered.
 *   . The program should display "A student with this number does not exist" every time you enter an invalid number.
 */
public class TeachingAssistant_Ex1 {

    public static final String PROMPT_STRING = "Enter a student number, or 'exit' to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "The question will be answered by ";
    public static final String NOT_EXIST = "A student with this number does not exist";

    static List<String> studentsJournal = Arrays.asList(
            "Hugh Jass"
            , "Rita Booke"
            , "Justin Case"
            , "Robin Banks"
            , "Manny Kinn"
            , "Harry Pitts"
            , "Marty Graw"
            , "Shanda Lear"
            , "Rusty Dorr"
            , "Otto Graph");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();

            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception e) {
                System.out.println("A student with this number does not exist");
            }
        }
    }
}

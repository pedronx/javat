package CodeGym.Level15.L02_Exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Teaching assistant - 2
 * The program reads a number from the console, finds the corresponding student in the list, and calls on him or her to answer. It even handles invalid numbers.
 * But there is another problem: if a non-integer is entered, the parseInt method throws a NumberFormatException. Wrap some code in a try-catch block so that the program continues to run even if a non-integer is entered. And if the input is not an integer, then display "You must enter an integer" and execute continue; so the loop works correctly.
 * Requirements:
 *   . The program should continue running if a non-integer is entered.
 *   . The program should display "You must enter an integer" every time a non-integer is entered.
 */
public class TeachingAssistant_Ex2 {

    public static final String PROMPT_STRING = "Enter a student number, or 'exit' to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "The question will be answered by ";
    public static final String NOT_EXIST = "A student with this number does not exist";
    public static final String INTEGER_REQUIRED = "You must enter an integer";

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

            int studentId;

            try {
                studentId = Integer.parseInt(input);

                try {
                    System.out.println(ANSWERING + studentsJournal.get(studentId));
                } catch (Exception e) {
                    System.out.println(NOT_EXIST);
                }
            } catch (Exception e) {
                System.out.println("You must enter an integer");
            }
        }
    }
}

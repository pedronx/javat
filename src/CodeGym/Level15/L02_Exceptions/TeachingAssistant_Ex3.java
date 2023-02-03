package CodeGym.Level15.L02_Exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Teaching assistant - 3
 * The program reads a number from the console, finds the corresponding student in the list, and calls on him or her to answer.
 * The parseInt and get methods can throw NumberFormatExceptions and ArrayIndexOutOfBoundsExceptions. Wrap them with one try block that has two catch blocks.
 * The catch block for NumberFormatException should display "You must enter an integer", and the catch block for ArrayIndexOutOfBoundsException should display "A student with this number does not exist".
 * Requirements:
 *   . The program should continue running when a NumberFormatException occurs.
 *   . The program should display "You must enter an integer" every time a NumberFormatException occurs.
 *   . The program should continue running when an ArrayIndexOutOfBoundsException occurs.
 *   . The program should display the following message: "A student with this number does not exist" every time an ArrayIndexOutOfBoundsException occurs.
 *   . The program should have one try block and two catch blocks.
 */
public class TeachingAssistant_Ex3 {

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
            if (input.equalsIgnoreCase(EXIT)) {
                break;
            }

            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (NumberFormatException e) {
                System.out.println("You must enter an integer");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("A student with this number does not exist");
            }
        }
    }
}

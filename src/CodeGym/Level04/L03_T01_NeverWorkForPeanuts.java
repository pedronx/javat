package CodeGym.Level04;

/**
 * I'll never work for peanuts
 * Using a while loop, print the quote variable on the screen one hundred times:
 * "I'll never work for peanuts. Amigo"
 * Display each value on a new line.
 * Requirements:
 *   . The program should display text on the screen.
 *   . The program should display the quote variable 100 times.
 *   . The program must use a while loop.
 */
public class L03_T01_NeverWorkForPeanuts {

    public static void main(String[] args) {

        String quote = "I'll never work for peanuts. Amigo";

        int i = 100;
        while(i > 0) {
            System.out.println(quote);
            i--;
        }
    }
}

package CodeGym.Level04;

import java.util.Scanner;

/**
 * Everyone wants to be loved
 * Read in a name from the keyboard and then, using a while loop, display <name> loves me (the text variable) 10 times.
 * Each instance of the phrase should be on a new line.
 * Example of the screen output for the name "Regina":
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Regina loves me.
 * Requirements:
 *   . The program should read a name from the keyboard.
 *   . The program should display text on the screen.
 *   . The program should display the text indicated in the task 10 times. Each instance of the phrase should be on a new line.
 *   . The program must use a while loop.
 */
public class L03_T02_EveryoneWantsToBeLoved {

    public static void main (String[] args) {

        String text = " loves me.";

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int n = 0;

        while(n < 10) {
            System.out.println(name + text);
            n ++;
        }
    }
}

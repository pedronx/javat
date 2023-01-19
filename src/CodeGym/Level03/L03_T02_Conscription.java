package CodeGym.Level03;

import java.util.Scanner;

/**
 * Enter a name and age from the keyboard. If the age is in the range 18-28 (inclusive), then display "<Name>, you've been drafted for military service", where <Name> is the name entered earlier from the keyboard.
 * >>>
 * Example input:
 * Amigo
 * 18
 * Example output:
 * Amigo, you've been drafted for military service
 * >>>
 * Requirements:
 *   . The program should read data from the keyboard twice.
 *   . The program must use the System.out.println() or System.out.print() command.
 *   . If the age is in the range 18-28 (inclusive), then display only "NAME, you've been drafted for military service".
 *   . If the age is not within the specified range, then don't display anything.
 */
public class L03_T02_Conscription {

    public static void main (String[] args) {

        String militaryCommissar = ", you've been drafted for military service";

        // new instance of Scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your age: ");
        int age = s.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + ", you've been drafted for military service");
        }
    }
}

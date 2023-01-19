package CodeGym.Level02;

import java.util.Scanner;

/**
 * Use the keyboard to read three integers.
 * Display their arithmetic mean.
 */
public class L08_T02_ReadingNumbers {

    public static void main (String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Insert 3 numbers, followed by 'Enter'");

        int n1 = console.nextInt();
        int n2 = console.nextInt();
        int n3 = console.nextInt();

        System.out.println((n1 + n2 + n3) / 3);

    }
}

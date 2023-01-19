package CodeGym.Level03;

import java.util.Scanner;

/**
 * The program reads a body temperature from the keyboard and displays a message indicating whether the body temperature is high, low or normal, depending on its value.
 * The class declares two boolean variables: isHigh (meaning high temperature) and isLow (meaning low temperature). You need to write the appropriate conditions and use these variables instead of comparisons.
 * Requirements:
 *   . The program should read the temperature from the keyboard.
 *   . Do not change the declaration of the isHigh and isLow variables.
 *   . In the main method, appropriate comparison expressions must be assigned to the isHigh and isLow variables.
 *   . The isHigh and isLow variables should be used instead of comparisons in the if() statements.
 *   . The functionality of the program must not change.
 */
public class L05_T01_TakeYourTemperature {

    private static boolean isHigh;
    private static boolean isLow;

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;

        if (isHigh) {
            System.out.println("Body temperature is high");
        } else if (isLow) {
            System.out.println("Body temperature is low");
        } else {
            System.out.println("Body temperature is normal");
        }
    }
}

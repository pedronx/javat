package CodeGym.Level12.L03_StaticMethods;

/**
 * String converter
 * In the main method, convert the String string to a double using the static parseDouble method of the Double class.
 * Then round the resulting value using the static round method of the Math class.
 * Display the result on the screen.
 * Requirements:
 *   . The main method should call the parseDouble method of the Double class.
 *   . The main method should call the round method of the Math class.
 *   . The console should display the number 13.
 */
public class MainStrings {

    public static void main(String[] args) {

        String string = "12.84";

        System.out.println(Math.round(Double.parseDouble(string)));
    }
}

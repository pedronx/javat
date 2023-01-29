package CodeGym.Level13.L06_TypeInference;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Onward to the future
 * The Solution class has a number field, a string field, and a main method with variables declared in it.
 * You need to replace the variable declarations with var where possible. The order of the variables must not be changed.
 * Example:
 * Scanner console = new Scanner(System.in);
 * Replace with:
 * var console = new Scanner(System.in);
 * Requirements:
 *   . Replace the variables' types with var wherever possible.
 *   . Do not change the right side of the expressions.
 */
public class OnwardToTheFuture {

    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
        var integer = 22;
        var string = "string";
        var array = new int[5];
        var strings = new ArrayList<String>();
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }
}

package CodeGym.Level13.L06_TypeInference;

import java.util.ArrayList;

/**
 * Double curly braces
 * The main method creates an ArrayList<String> list, assigns it to the var strings variable, and populates it with five elements.
 * Without changing the logic, you need to rewrite the code to use double curly braces.
 * Requirements:
 *   . The strings list should be filled with five elements enclosed in double curly braces.
 */
public class DoubleCurlyBraces {

    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
            add("So");
            add("too");
            add("you can");
            add("do");
            add("!");
        }};
    }
}

package CodeGym.Level15.L06_StackTrace;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Long drink
 * On startup, the program ends with an exception. But the text of the exception displayed on the console
 * does not make the origin of the exception clear. In this task, you need to:
 *     wrap the code of the addIce, addVodka, addJuice and addOrange methods in try-catch blocks;
 *     in the catch blocks, call the printBugMethodName method and pass the stack trace to it.
 * If you do everything right, then when you run the program the names of the methods where the exceptions occur will be displayed on the screen.
 * Requirements:
 *   . You need to wrap the code of the addIce, addVodka, addJuice and addOrange methods in try-catch blocks.
 *   . In the addIce, addVodka, addJuice and addOrange methods, you need to put a single statement in the catch blocks: a call to the printBugMethodName method.
 *   . Each time you call the printBugMethodName method, you must pass the current stack trace to it.
 */
public class LongDrink {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        try {
            ingredients.put("ice cubes", 7);
        } catch (Exception e) {
            printBugMethodName (e.getStackTrace());
        }
    }

    static void addVodka(Map<String, Integer> ingredients) {
        try {
            ingredients.put("vodka", 50);
        } catch (Exception e) {
            printBugMethodName (e.getStackTrace());
        }
    }

    static void addJuice(Map<String, Integer> ingredients) {
        try {
            ingredients.put(null, 100);
        } catch (Exception e) {
            printBugMethodName (e.getStackTrace());
        }
    }

    static void addOrange(Map<String, Integer> ingredients) {
        try {
            ingredients.put("orange slice", 1);
        } catch (Exception e) {
            printBugMethodName (e.getStackTrace());
        }
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement_1 = stackTraceElements[1];
        StackTraceElement stackTraceElement_3 = stackTraceElements[3];
        System.out.println("exception stack trace:");
        System.out.println(stackTraceElement_1.getMethodName());
        System.out.println(stackTraceElement_3.getMethodName());
    }
}

package CodeGym.Level15.L06_StackTrace;

/**
 * Making cocktails
 * The printStackTrace method has the stackTrace array as an input parameter. You need to display information about each element of the array in the following format:
 * "Method <method name> was called on line <line> of the <class name> class in the file <file name>."
 * Print information about each element on a new line.
 * Example:
 * The addJuice method was called on line 24 of the en.codegym.task.pro.task14.task1414.Solution class in the file Solution.java.
 * Requirements:
 *   . The printStackTrace method should print information about each element in the stackTrace array.
 */
public class MakingCocktails  {

    public static final String OUTPUT_FORMAT = "The %s method was called on line %d of the %s class in the file %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(StackTraceElement info: methods) {
            System.out.printf(OUTPUT_FORMAT, info.getMethodName(),
                    info.getLineNumber(), info.getClassName(), info.getFileName());
        }

/*        for (StackTraceElement element : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, element.getMethodName(),
                    element.getLineNumber(), element.getClassName(), element.getFileName());
        }*/
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}

package CodeGym.Level15.L06_StackTrace;

/**
 * Stack trace
 *      try {
 *          // An exception may occur here
 *      } catch(Exception e) {                                // Catch the exception
 *          StackTraceElement[] methods = e.getStackTrace()   // Get the stack trace that existed when the error occurred.
 *      }
 *      OR
 *      catch(Exception e) {       // Catch the exception
 *          e.printStackTrace();   // Prints the stack trace that existed when the error occurred.
 *      }
 */

/**
 * Logging a stack trace
 * In the main method, catch the exception and output its stack trace.
 * Requirements:
 *   . The main() method should call the dangerousMethod() method.
 *   . The dangerousMethod method should throw an Exception.
 *   . The main method should display the stack trace of the caught exception.
 */
public class LoggingAStackTrace {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}

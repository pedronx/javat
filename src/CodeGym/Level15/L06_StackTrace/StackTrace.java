package CodeGym.Level15.L06_StackTrace;

/**
 * Stack trace
 * A list that consists of the current method, and the method that invoked it, and method that called that one, etc.
 * is called a stack trace. You can get it with this statement:
 *      StackTraceElement[] methods = Thread.currentThread().getStackTrace();
 *      Or
 *      Thread current = Thread.currentThread();
 *      StackTraceElement[] methods = current.getStackTrace();
 */
public class StackTrace {

    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(var info: methods)
            System.out.println(info);
    }
}

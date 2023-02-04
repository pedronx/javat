package CodeGym.Level15.L06_StackTrace;

/**
 * Stack Trace Elements
 */
public class StackTraceElements {

    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(StackTraceElement info: methods)
        {
            System.out.print("getClassName(): ");
            System.out.println(info.getClassName());
            System.out.print("getMethodName(): ");
            System.out.println(info.getMethodName());

            System.out.print("\ngetFileName(): ");
            System.out.println(info.getFileName());
            System.out.print("getLineNumber(): ");
            System.out.println(info.getLineNumber());

            System.out.print("\ngetModuleName(): ");
            System.out.println(info.getModuleName());
            System.out.print("getModuleVersion(): ");
            System.out.println(info.getModuleVersion());
            System.out.println("-".repeat(15));
        }
    }
}

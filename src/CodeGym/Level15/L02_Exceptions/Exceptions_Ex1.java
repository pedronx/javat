package CodeGym.Level15.L02_Exceptions;

/**
 * Catching exceptions: try-catch
 *      try
 *      {
 *          // Code where an exception might occur
 *      }
 *          catch(ExceptionType name)
 *      {
 *          // Exception handling code
 *      }
 */
public class Exceptions_Ex1 {

    public static void main(String[] args)
    {
        System.out.println("Your attention, please! Preparing for the end of the world");
        endTheWorld();
        System.out.println("The world ended successfully");
    }

    public static void endTheWorld()
    {
        System.out.println("We're doing something important");
        doSomeWork(0);
        System.out.println("Everything is working well");
    }

    public static void doSomeWork(int n)
    {
        System.out.println("Nothing terrible will happen: " + n);

        try {
            System.out.println(2 / n); // division by zero
        } catch (Exception e) {
            System.out.println("Nothing terrible happened: " + n);
        }
    }
}

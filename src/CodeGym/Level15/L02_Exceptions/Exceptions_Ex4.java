package CodeGym.Level15.L02_Exceptions;

public class Exceptions_Ex4 {

    public static void main(String[] args)
    {
        System.out.println("Start of main method");
        try
        {
            calculate(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by 0");
        }
        catch(Exception e)
        {
            System.out.println("Caught some kind of exception");
        }

        System.out.println("End of main method");
    }

    public static void calculate(int n)
    {
        System.out.println("Start of calculate method: " + n);
        System.out.println(2/n);
        System.out.println("End of calculate method: " + n);
    }
}

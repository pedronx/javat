package CodeGym.Level15.L02_Exceptions;

public class Exceptions_Ex2 {

    public static void main(String[] args)
    {
        System.out.println("Hadron Collider launched");

        try
        {
            launchHadronCollider(1);
            launchHadronCollider(0);
        }
        catch(Exception e)
        {
            System.out.println("Error! Caught an exception");
            System.out.println("The planet was sucked into a black hole!");
        }

        System.out.println("The Hadron Collider stopped");
    }

    public static void launchHadronCollider(int n)
    {
        System.out.println("Everything is working well: " + n);
        System.out.println(2/n);
        System.out.println("There are no problems: " + n);
    }
}

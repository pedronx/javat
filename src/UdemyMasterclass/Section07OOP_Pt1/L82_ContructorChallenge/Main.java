package UdemyMasterclass.Section07OOP_Pt1.L82_ContructorChallenge;

/**
 * Contructor Challenge
 * 1. Create a new class, called Customer, with three fields:
 *  . name
 *  . credit limit
 *  . email address
 * 2. Create the getter methods only, for each field.
 * 3. Create three constructors for this class:
 *  . First, create a constructor for all three fields, which should assign
 *    the arguments directly to the instance fields.
 *  . Second, create a no args constructor that call another constructor, passing some litelar values for each argument.
 *  . Third, create a constructor with just the name and email parameters, which also calls another constructor.
 */
public class Main {

    public static void main (String[] args) {

        Customer customer = new Customer();
        System.out.println("Customer: " + customer.getName());
        System.out.println("Credit limit: " + customer.getCreditLimit());
        System.out.println("Email: " + customer.getEmail());
        System.out.println(">>>>>>>>>>>");

        Customer anotherCustomer = new Customer("Jane Doe", 50000.0, "no email");
        System.out.println("Customer: " + anotherCustomer.getName());
        System.out.println("Credit limit: " + anotherCustomer.getCreditLimit());
        System.out.println("Email: " + anotherCustomer.getEmail());
        System.out.println(">>>>>>>>>>>");

        Customer aDifferentCustomer = new Customer("Anna Silver",  "anna.silver@activebank.com");
        System.out.println("Customer: " + aDifferentCustomer.getName());
        System.out.println("Credit limit: " + aDifferentCustomer.getCreditLimit());
        System.out.println("Email: " + aDifferentCustomer.getEmail());
    }
}

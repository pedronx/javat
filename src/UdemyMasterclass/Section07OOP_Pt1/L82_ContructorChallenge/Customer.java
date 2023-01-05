package UdemyMasterclass.Section07OOP_Pt1.L82_ContructorChallenge;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("John Doe", 1000, "john.doe@activebank.com");
    }

    public Customer(String name, String email) {
        this(name, 10000, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

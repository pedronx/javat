package UdemyMasterclass.Section07OOP_Pt1.L80_Contructors;

/**
 * Create a new Class for a bank account.
 * Create fields for account characteristics:
 *    . account number
 *    . account balance
 *    . customer name
 *    . email
 *    . phone number
 * Create getters and setters for each field.
 * Create two additional methods:
 *    . one for depositing funds into the account
 *    . one for withdrawing funds from the account
 * Rule: A customer should not be allowed to withdraw funds,
 *       if that withdrawal takes their balance negative.
 * Create a Main class with the usual main method.
 * Create an instance of an Account class, and then test your withdrawal and deposit methods.
 * Additionally print the results for deposit and withdrawal.
 * Print information to the console, that confirms what the balance is after the methods are called.
 */
public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Contructors
    public BankAccount() {
        // Empty constructor
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName,
                       String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean depositFunds(String amount) {

        try {
            double deposit = Double.parseDouble(amount);

            if (deposit <= 0.0) {
                System.out.println("Invalid value! Please try again.");
                return false;
            }

            this.accountBalance += deposit;
            System.out.println("Deposit of " + deposit + " € complete.");
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Characters not allowed! Please try again.");
            return false;
        }
    }

    public boolean withdrawFunds(String amount) {

        try {
            int withdrawal = Integer.parseInt(amount);

            if (withdrawal <= 0.0) {
                System.out.println("Invalid value! Please try again.");
                return false;
            } else {
                double funds = this.accountBalance;
                if (withdrawal > funds) {
                    System.out.println("Not enough funds in the account (" + funds + "). Please try again.");
                    return false;
                } else {
                    funds -= withdrawal;
                    this.accountBalance = funds;
                    System.out.println("Withdrawal of " + withdrawal + " € complete.");
                    return true;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Characters not allowed! Please try again.");
            return false;
        }
    }
}

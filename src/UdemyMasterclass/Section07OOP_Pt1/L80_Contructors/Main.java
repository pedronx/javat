package UdemyMasterclass.Section07OOP_Pt1.L80_Contructors;

public class Main {

    public static void main (String[] args) {

        BankAccount account = new BankAccount("3658745PT", 1000.0, "John Silver", "john.silver@activebank.com", "965874565");

        /*
        account.setAccountNumber("3658745PT");
        account.setAccountBalance(1000.0);
        account.setCustomerName("John Silver");
        account.setEmail("john.silver@activebank.com");
        account.setPhoneNumber("965874565");
         */

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getAccountBalance());
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Customer email: " + account.getEmail());
        System.out.println("Customer Phone: " + account.getPhoneNumber());
    }
}

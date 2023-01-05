package UdemyMasterclass.Section07OOP_Pt1.L80_81_Contructors;

public class Main {

    public static void main (String[] args) {
        /*
        account.setAccountNumber("3658745PT");
        account.setAccountBalance(1000.0);
        account.setCustomerName("John Silver");
        account.setEmail("john.silver@activebank.com");
        account.setPhoneNumber("965874565");
         */

        BankAccount account = new BankAccount("3658745PT", 1000.0, "John Silver", "john.silver@activebank.com", "965874565");

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getAccountBalance());
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Customer email: " + account.getEmail());
        System.out.println("Customer Phone: " + account.getPhoneNumber());

        BankAccount otherAccount = new BankAccount(); // simple account (default values)

        System.out.println(">>>>>>>>>>>>>");
        System.out.println("Account number: " + otherAccount.getAccountNumber());
        System.out.println("Account Balance: " + otherAccount.getAccountBalance());
        System.out.println("Customer name: " + otherAccount.getCustomerName());
        System.out.println("Customer email: " + otherAccount.getEmail());
        System.out.println("Customer Phone: " + otherAccount.getPhoneNumber());

        BankAccount anotherAccount = new BankAccount("Jane Gold", "jane.gold@cryptobank.com", "(+351) 346789545"); // simple account (customer fields set, others by default)
        System.out.println(">>>>>>>>>>>>>");
        System.out.println("Account number: " + anotherAccount.getAccountNumber());
        System.out.println("Account Balance: " + anotherAccount.getAccountBalance());
        System.out.println("Customer name: " + anotherAccount.getCustomerName());
        System.out.println("Customer email: " + anotherAccount.getEmail());
        System.out.println("Customer Phone: " + anotherAccount.getPhoneNumber());

    }
}

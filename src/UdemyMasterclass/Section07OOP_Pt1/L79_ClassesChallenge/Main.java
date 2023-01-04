package UdemyMasterclass.Section07OOP_Pt1.L79_ClassesChallenge;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountNumber("3658745PT");
        account.setAccountBalance(1000.0);
        account.setCustomerName("John Silver");
        account.setEmail("john.silver@activebank.com");
        account.setPhoneNumber("965874565");

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);


        boolean validData;
        do {
            System.out.print("Please insert the amount to deposit: ");
            validData = account.depositFunds(scanner.nextLine());
        } while (!validData);

        System.out.println("\nThank you!");
        System.out.println("Your current balance is: " + account.getAccountBalance() + " €\n");

        do {
            System.out.print("Please insert the amount to withdraw: ");
            validData = account.withdrawFunds(scanner.nextLine());
        } while (!validData);


        System.out.println("\nThank you!");
        System.out.println("Your current balance is: " + account.getAccountBalance() + " €\n");
    }
}

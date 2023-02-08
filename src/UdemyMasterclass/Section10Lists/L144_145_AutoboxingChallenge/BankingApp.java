package UdemyMasterclass.Section10Lists.L144_145_AutoboxingChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Create a banking application, with a Customer and Bank type.
 * The Customer will have a name, and an ArrayList of transactions containing Double wrapper elements.
 *   . A customer's transaction can be a credit, which means a positive amount, or it can be a debit, a negative amount
 * The Bank will have a name, and an Arraylist of customers
 *   . The bank should add a new customer, if they're not yet already in the list.
 *   . The bank class should allow a customer to add a transaction, to an existing Customer.
 *   . This class should also print a statement, that includes the customer name, and the transaction amounts.
 *     This method should use unboxing.
 *
 */
public class BankingApp {

    public static void main(String[] args) {

        BankNx bank = new BankNx("CGD");
        CustomerNx customer = new CustomerNx("Pedro");
        bank.addCustomer(customer);
        Transaction transaction = new Transaction(10, "debit");
        bank.addTransaction(customer, transaction);
    }
}

class CustomerNx {

    private String name;
    private ArrayList<Double> transactions;

    CustomerNx(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public void addCustomer(CustomerNx customer) {
        if (customer.name.equalsIgnoreCase(this.name)) {
            System.out.println("Client already exists!");
        } else {
            this.name = customer.name;
            this.transactions = customer.transactions;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}

class Transaction {

    private double amount;
    private String type;

    Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class BankNx {
    String name;
    ArrayList<CustomerNx> customers;

    BankNx(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer (CustomerNx customer) {
        this.customers.add(customer);
    }

    public void addTransaction (CustomerNx customer, Transaction transaction) {
//        customer.setTransactions(transaction.getAmount(), transaction.getType());
    }

    public void printStatement(CustomerNx customer, Transaction transaction) {
        System.out.println(customer.getName() + ": " + transaction.getType() +" | " + transaction.getAmount());
    }
}
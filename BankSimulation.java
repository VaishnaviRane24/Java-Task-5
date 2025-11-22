import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactions = new ArrayList<>();

    // Constructor
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        transactions.add("Account created with initial balance: " + balance);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Print transaction history
    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}

// Main class to test
public class BankSimulation {
    public static void main(String[] args) {
        Account acc1 = new Account("12345", "Alen", 1000);

        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.withdraw(2000); // should show insufficient funds

        System.out.println("\nFinal Balance: " + acc1.getBalance());
        acc1.printTransactionHistory();
    }
}

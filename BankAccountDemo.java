/**
 * Program to demonstrate encapsulation using BankAccount class.
 */
class BankAccount {

    // Private variables (Encapsulation)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC12345", 5000);

        account.deposit(1000);
        account.withdraw(2000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
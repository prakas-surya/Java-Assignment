package assignment;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
        	System.out.println("Previous balance : " + balance);
            balance = balance + amount;
            System.out.println("New Balance: " + balance);
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds the current balance!");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn amount : " + amount);
            System.out.println("Current Balance : " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "John", 100);

        try {
            account1.deposit(100);
            account1.withdraw(200);
            account1.withdraw(100);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class BankAccount {
    private final int accountNumber;
    private double balance = 0.0;
    private final String accountHolderName;

    public BankAccount(int accountNumber, int balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if(amount<0) {
            System.out.println("Your amount must not be negative");
        }
        balance += amount;
        System.out.println("You deposited " + amount + " into your account");
    }

    public void withdraw(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You withdrew " + amount + " from your account");
        } else {
            System.out.println("Insufficient balance");
            
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Holder Name: " + accountHolderName);
    }
}
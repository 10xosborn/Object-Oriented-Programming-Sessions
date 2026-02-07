public class BankedAccount {
    public static void main(String[] args) {
        BankedAccount bankaccount = new BankedAccount("Osborne", 1000);
        bankaccount.BankAccountDetails();
    }
    String accountHolderName;
    double balance;

    public BankedAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void BankAccountDetails(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.printf("Balance: $%.2f" , balance);
    }
}

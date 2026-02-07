public class Wallet {

    //Attributes or fields
    private double money;

    //Constructor
    public Wallet(double money){
        this.money = money;
    }

    public double getMoney(){
        return money;
    }

    public void setMoney(double newMoney){
        if(newMoney < 0){
            throw new IllegalArgumentException("New Money cannot be negative");
        }

        this.money = newMoney;
    }

    public double borrowMoney(double amountToBorrow){
        if(amountToBorrow < 0){
            throw new IllegalArgumentException("Amount to borrow cannot be negative");
        }

        this.money += amountToBorrow;
        return this.getMoney();
    }

    // Method Add Money
    public void addMoney(double amount){

        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        this.money += amount;
    }
    //Algorithm for spend money
    /*
    1.Write money spendMoney method
    2.Check if user has money in his wallet
    3.If wallet is empty, user cannot spend money and if amount to be spent is greater than money in wallet, user cannot spend money
    4.Otherwise user can spend money  
    */

    public double spendMoney(double amount){

        if(money == 0 || amount > money){
            throw new IllegalArgumentException("You cannot spend money");
        }

        this.money -= amount;
        return this.getMoney();
    }

    public static void main(String[] args) {
        Wallet walletObject = new Wallet(200);
        walletObject.spendMoney(-2);
        walletObject.addMoney(44);
        System.out.println("Amount added is: GHS" + walletObject.getMoney());
        System.out.println("Your balance is: GHS " + walletObject.getMoney());

    }


}
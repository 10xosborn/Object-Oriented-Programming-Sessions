// import java.util.Scanner;
import java.util.Random;
public class Main {
    
    public static void main(String[] args) {
        
        // Scanner inputPassword = new Scanner(System.in);
        // System.out.print("Enter a your Password: ");
        // String userPassword = inputPassword.nextLine();

        // System.out.println("The square of " + numToSquare + " is " + numToSquare);

        // BankAccount account1 = new BankAccount(131323131, 1000, "DeOsborne");
        
        // account1.deposit(500);
        // account1.withdraw(38293082);
        // account1.displayAccountDetails();

        // User user1 = new User("DeOsborne", "123456789");
        // System.out.println(user1.getusername());
        // System.out.println(user1.verifyPassword("123456789"));

        Random rand = new Random();
        int randomNumber = rand.nextInt(10)+1;
        System.out.println(randomNumber);
                
    }
}
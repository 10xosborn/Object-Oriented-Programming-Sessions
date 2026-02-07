import java.util.Scanner;
public class Exam {

    private final int userScore;
    private final String userName;

    public Exam(String userName, int userScore){
        this.userName = userName;
        this.userScore = userScore;
    }

    public String getUserName(){
        return userName;
    }

    public int getUserScore(){
        return userScore;
    }

    public void examResults(){
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String inputName = userInput.nextLine();
    
            System.out.print("Enter your score: ");
            int inputScore = userInput.nextInt();
    
            if (inputScore >= 50){
                System.out.println(inputName + " You PASSED!");
            }
            else
                System.out.println(inputName + " You FAILED!");
        }
    }

    

    public static void main(String[] args) {
        Exam userExamDetails = new Exam("Osborne", 22);
        userExamDetails.examResults();
    }
}
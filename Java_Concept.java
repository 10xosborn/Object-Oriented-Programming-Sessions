// public class Main {
// <visibilty/access modifier>, <return type(void, int, double, etc)>, <method name>, <arguments>

//     public static void main(String[] args) {

//         int num1, num2, result = 0;
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         num1 = input.nextInt();

//         System.out.print("Enter second number: ");
//         num2 = input.nextInt();
        
//         result = num1 + num2;
//         System.out.println( num1 + "+" + num2 + " = " + result );
        
        

//         nameOfClass objectName = newKeyword Constructor(fields(values))
 
        
//         Now to print in Java
//         1. System.out.println
//         2. System.out.print
        
//         System.out.println("Hello World");
//         System.out.println("Osborne");    
        
//         String name = "Osborne";
//         System.out.println(name);

//         //Input
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("Please enter your name ");
//         String firstName = input.nextLine();
//         System.out.printf("Your name is: %s ", firstName);

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter your age: ");
        
//         int age = input.nextInt();
        
//         // Adult >= age 18
        
//         if (age >= 18) {
//                 System.out.print("You'rw an adult");

//             } else if(age == 0) {
//                 System.out.println("You're not born yet");
//             }
            
//             Loops ---> for, while, for each, doWhile
        
//         For
//         forKeyowrd (initializer; conditon; increament/decreament(iterator)) {}
        
//         int[] arrNum = {1, 2, 3, 7};
//         for ( int i = 0; i < 4; i++ ) {
//                 System.out.println(arrNum[i]);
//             }
            
//             int age = input.nextInt();
            
//             System.out.print("Enter your age: ");
            
//         while (true) {
            
//         if (age >= 10) {
//             System.out.println("You are an adult");
        
//         } else {
//                 System.out.println("You are a child");
//         }
        
//         Person person1 = new Person(20,"Osborn", "DownHills");
    
//         System.out.println(person1.getName());
    
//         person1.getName();


        
//         String name = "Osborne";
        
//         int age = 22;
        
//         int favNum = 5;

//         String address = "DownHills";

//         System.out.println("My name is " + name + ", I am " + age + " years old and my favourite number is " + favNum);

//         System.out.println("I reside at " + address );
        
        
//         User user1 = new User("Osborne", 22, "Nillvalley");
           
//            System.out.println(user1.getName());

//            user1.getName();


//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter number: ");

//         int number = input.nextInt();

//         if (number > 0) {
//             System.out.println("Your number is Positive");
//         } else if (number == 0) {
//             System.out.println("Your number is Zero");
//         } else {   
//             System.out.println("Your number is Negative");
//         }

//     }
// }



// import java.util.Scanner;

// public class Square {

//     int numToSquare; 
//     int squaredNum;

    
//     public Square (int numToSquare, int squaredNum) {
//         this.numToSquare = numToSquare;
//         this.squaredNum = numToSquare;
        
//     }
    
//     public int squaredNum {
        
//         System.out.println("Enter the number to square: ");
        
//         Scanner inputNum = new Scanner(System.in);
//         int numToSquare = inputNum.nextInt();
//         return squaredNum = numToSquare * numToSquare;
//         System.out.println("The square of " + numToSquare + " is " + squaredNum);
//     }

// }   

// Q. Write a Java program to get a number from the user and print whether it is positive or negative.


import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0) {

            System.out.println("Given Number is Positive.");
        }
        else if (num < 0) {
            
            System.out.println("Given Number is Negative");
        }
        else {
            System.out.println("This is not a Number, it's neutral");
        }

        sc.close();
    
    }
}
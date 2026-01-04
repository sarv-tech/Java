// Q. In a program, input 3 numbers: A, B and C.You have to output the average of these 3 numbers.

import java.util.*;

public class Question1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int A = sc.nextInt();

        System.out.print("Enter Your Second Number: ");
        int B = sc.nextInt();

        System.out.print("Enter Your Third Number: ");
        int C = sc.nextInt();

        float Average = (A + B + C)/ 3.0f;
        System.out.println("Average of " + A + " + " + B + " + " + C + " is " + Average);
        
        sc.close();
    }
}

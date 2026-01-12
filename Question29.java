// Q. WAP to find the factorial of any number entered by the user

/*

n = n*(n-1)*(n-2)*(n-3)*(n-4)*..........*1

eg.:- n = 5
5 = 5*4*3*2*1 = 120

*/


// 2nd approach

import java.util.*;

public class Question29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = n; i >= 1; i--) {

            fact = fact * i;
        }

        System.out.print(fact);

        sc.close();
    }
}

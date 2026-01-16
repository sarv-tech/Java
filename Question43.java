// Q. WAP to Calculate factorial of a number using function. 


import java.util.*;

public class Question43 {

    public static int Calculatefactorial(int n) {

        int fact = 1;

        for(int i = 1; i <= n; i++) {

            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int factorial = Calculatefactorial(n);
        System.out.println("Factiorial of " + n + " is: " + factorial);

        sc.close();

    }
}

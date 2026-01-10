// Q. WAP to find the factorial of any number entered by the user


import java.util.*;

public class Question25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= n; i++) {

            fact = fact * i;
        }

        System.out.println("Factorial of a " + n + " is: " + (fact));

        sc.close();
    }
}

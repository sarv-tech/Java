// Q. WAP to Check whether the number is Armstrong or not.

/*

An Armstrong number is a number that equals the sum of its own digits, each raised to the power of the total number of digits in the number.

E.g.:-  153 => 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

*/


import java.util.*;

public class Question28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int N = n;
        int lastDigit;
        int sumOfDigit = 0;

        while(n != 0) {

            lastDigit = n % 10;    // It get last digit of number
            n = n / 10;            // It removes last digit of number

            sumOfDigit += (lastDigit * lastDigit * lastDigit);
        }

        if(sumOfDigit == N) {
            System.out.println("It is an Armstrong Number");

        }
        else{
            System.out.println("It is not an Armstrong Number");
        }

        sc.close();
    }
}


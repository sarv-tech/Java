// Q. Write a java method to compute the sum of digits in an integer.

/* logic:- 

a. Take a variable sum = 0
b. Find the last Digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0

*/


import java.util.*; 

public class Question52 {

    public static int sumofDigits(int n) {

        int sum = 0;
        int lastDigit;

        while(n > 0) {

        lastDigit = n % 10;
        sum += lastDigit;
        n = n / 10;

        }

        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digits: ");
        int n = sc.nextInt();

        System.out.println(sumofDigits(n));

    }
}

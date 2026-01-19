// Q. WAP to Check if a number is Palindrome or not

/*
E.g.:-    121 is a palindrome, 321 is not

=> A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321

*/

import java.util.*;

public class Question51 {

    public static boolean isPalindrome(int num) {

        int Palindrome = num;
        int lastDigit;
        int reverse = 0;

        while(Palindrome > 0) {

            lastDigit = Palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            Palindrome = Palindrome / 10;
            
        }

        return num == reverse;
        
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Palindrome = sc.nextInt();

        if(isPalindrome(Palindrome)) {

            System.out.println(Palindrome + " is a Palindrome");
        }
        else {
            System.out.println(Palindrome + " is not a Palindrome");

            sc.close();
        }
    }
}
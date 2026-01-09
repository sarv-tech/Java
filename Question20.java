// Q. Reverse the Given Number


import java.util.*;

public class Question20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int rev = 0;

        while(n > 0) {

            int lastDigit = n % 10;        // get Last Digit of number
            rev = (rev * 10) + lastDigit;
            n = n / 10;                     // removes Last Digit of a number
        }
        System.out.println(rev);

        sc.close();
    }
}


// Q. Print Reverse of a number

/*

Agar last digit chaiye toh ----> num % 10
Agar last digit remove karna ho toh -----> num / 10

*/

import java.util.*;
public class Question19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        while(n > 0) {

            int lastDigit = n % 10;      // get Last Digit of number
            System.out.print(lastDigit);

            n = n / 10;               // removes Last Digit of a number
        }
        System.out.println();

        sc.close();
    }
}
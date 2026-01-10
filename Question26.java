// Q. WAP that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;

public class Question26 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();

        int even_sum = 0;
        int odd_sum = 0;

        for(int i = 1; i <= n; i++) {

            int num = sc.nextInt();

            if(num % 2 == 0) {

                even_sum += num;
            }
            else {
                odd_sum += num;
            }
        }
        System.out.println("Sum of the even Integers: " + even_sum);
        System.out.println("Sum of the odd Integers: " + odd_sum);

        sc.close();
    }
}
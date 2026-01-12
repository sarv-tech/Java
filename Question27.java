// Q. WAP to Calculate the Fibonacci series of nth fibonacci term.

/*

The Fibonacci series is a sequence where each number is the sum of the two preceding ones, typically starting with 0 and 1.

0, 1, 1, 2, 3, 5, 8, 13.....

*/

import java.util.*;

public class Question27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth Fibonacci term: ");
        int n = sc.nextInt();

        int firsTerm = 0;
        int secondTerm = 1;

        for(int i = 2; i <= n; i++){

            int thirdTerm = firsTerm + secondTerm;

            firsTerm = secondTerm;
            secondTerm = thirdTerm;

            System.out.print(thirdTerm + "  ");
        }
        sc.close();
    }
}

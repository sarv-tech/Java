// Q. Print sum of first n natural numbers.


import java.util.*;

public class Question17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        int sum = 0;
        int count = 1;

        while(count <= n) {

            sum += count;
            count++;
        }
        
        System.out.println("Sum is: " + sum);

        sc.close();

        }
}

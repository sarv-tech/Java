// Q. WAP to Check if a number is Prime or Not using Function. 


import java.util.*;

public class Question59 {

    public static boolean isPrime(int n) {
        
        if(n == 2) {
            return true;
        }

        for(int i = 2; i <= n - 1; i++) {

            if(n % i == 0) {

                return false;
                
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

            if(isPrime(n)) {
                System.out.println("Number is Prime");
            }
            else {
                System.out.println("Number is not Prime");
            }

            sc.close();
        
    }
}

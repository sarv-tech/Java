// Q. WAP to Check if Given Number is Prime Number or Not


import java.util.*;

public class Question23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println(n + " is a Prime Number");
        }
        else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.print(n + " is a Prime Number");
            }
            else{
                System.out.println(n + " is not a Prime Number");
            }
        }
        
        sc.close();
    }
    
}

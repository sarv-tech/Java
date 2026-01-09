// Q. WAP that Display all numbers entered by user except multiples of 10.


import java.util.*;

public class Question22 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                System.out.println("Can't Display!! Number is Multiple of 10");
                continue;
            }
            System.out.println("Number was: " + n);

        } while(true); 

    } 
}

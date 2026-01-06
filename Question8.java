// Q. Print the largest of 3 numbers

import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A = ");
        int A = sc.nextInt();
        
        System.out.print("Enter B = ");
        int B = sc.nextInt();

        System.out.print("Enter C = ");
        int C = sc.nextInt();

        if((A >= B) && (A >= C)){
            System.out.println("A is largest");
        }
        else if(B >= C){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }

        sc.close();
    }
}

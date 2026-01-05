// Relational Operator:-

/*

&& (Logical AND)      if T T ---> T,  T F ---> F,  F F ---> F
|| (Logical OR)       if T T ---> T,  T F ---> T,  F F ---> F
! (Logical NOT)       if T ---> F,  F ---> T

*/



import java.util.*;

public class Logical_operator{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A = ");
        int A = sc.nextInt();

        System.out.print("Enter B = ");
        int B = sc.nextInt();

        System.out.print("Enter C = ");
        int C = sc.nextInt();

        System.out.print("Enter D = ");
        int D = sc.nextInt();

        System.out.println((A > B) && (C < D));
        System.out.println((A < B) || (C > D));

        System.out.println(!(C < D));

        sc.close();
    }
}
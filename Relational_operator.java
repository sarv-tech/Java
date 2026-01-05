// Relational Operator:-

/*

==     => Equal to
!=     => Not Equal to (Inequality)
>      => Greater than 
<      => Less than
>=     --> Greater than Equal to
<=     --> Less than Equal to

*/



import java.util.*;

public class Relational_operator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter A = ");
        int A = sc.nextInt();

        System.out.print("Enter B = ");
        int B = sc.nextInt();

        System.out.println("A == B is: " + (A == B));
        System.out.println("A != B is: " + (A != B));
        System.out.println("A > B is: " + (A > B));
        System.out.println("A < B is: " + (A < B));
        System.out.println("A >= B is: " + (A >= B));
        System.out.println("A <= B is : " + (A <= B));

        sc.close();

    }
}

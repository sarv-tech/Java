// Arithmetic Operator in Java:-

/*

Binary => It has 2 operands

A = 10, B = 5

+ => A + B = 10 + 5 = 15
- => A - B = 10 - 5 = 5
* => A * B = 10 * 5 = 50
/ => A / B = 10 / 5 = 2
% (modulo) => A % B = 10 % 5 = 0 (It gives remainder as output)

*/

import java.util.*;

public class Arithmetic_operator{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A = ");
        int A = sc.nextInt();

        System.out.print("Enter B = ");
        int B = sc.nextInt();

        System.out.println("Addition is: " + (A + B));
        System.out.println("Subtraction is: " + (A - B));
        System.out.println("Multiplication is: " + (A * B));
        System.out.println("Division is: " + (A / B));
        System.out.println("Modulo (Remainder) is: " + (A % B));

        sc.close();

    }
}
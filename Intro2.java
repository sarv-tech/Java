// Syntax with Parameter:-

/*

returnType name (type param1, type param2) {

body 

return statement;

}

*/

import java.util.*;

public class Intro2 {

    public static int CalculateSum(int num1, int num2) {     // parameters or formal parameter

        int sum = num1 + num2;
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int sum = CalculateSum(a, b);  // function call  // a and b are arguments 
        System.out.println("Sum is: " + sum);

        sc.close();
    }
}


// formal parameters are also known as parameters ------> To define functions
// actual parameters or arguments ----> To call the function
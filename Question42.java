// Q. WAP to Calculate the product of two numbers using function.


import java.util.*;

public class Question42 {

    public static int CalculateProduct(int a, int b) {

        int product = a * b;
        return product;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int product = CalculateProduct(a, b);
        System.out.println("Product of " + a + " x " + b + " is: " + product);

        sc.close(); 
    }
}

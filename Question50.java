// Q. Write a method name isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.


import java.util.*;

public class Question50 {

    public static boolean isEven(int n) {

        return n % 2 == 0;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isEven(n)) {

            System.out.println("It is an Even Number");
        }

        else {

            System.out.println("It is not an Even Number");

        sc.close();

        }
    }
}
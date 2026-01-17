// Q. Write a java method to compute the average of three numbers.


import java.util.*;

public class Question46 {

    public static float CalculateAverage(int a, int b, int c) {

        float average = (a + b + c) / 3;
        return average;

    }
    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        float average = CalculateAverage(a, b, c);
        System.out.println("Average of " + a + "," + b + " & " + c + " is: " + average);

        sc.close();

    }
}

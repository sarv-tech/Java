// Q. In a program, input the side of a square. You have to output the area of the square.

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side1 of a square: ");
        int side1 = sc.nextInt();

        System.out.print("Enter the side2 of a square: ");
        int side2 = sc.nextInt();

        int Area = side1 * side2;
        
        System.out.print("Area of square is: " + Area);

        sc.close();
    }
}

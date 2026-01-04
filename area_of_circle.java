// Input from user and calculate the area of circle

import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float PI = 3.14f;

        System.out.print("Enter Radius of Circle: ");
        Float r = sc.nextFloat();

        Float Area = PI*r*r;

        System.out.println("Area Of Circle is: " + Area);

        sc.close();
    }
}

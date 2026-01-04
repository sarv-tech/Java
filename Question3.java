// Q. Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. Also try adding 18% gst tax to the items in the bill as an advanced problem

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of a Pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter cost of a pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter cost of a eraser: ");
        float eraser = sc.nextFloat();

        float Total_items = pencil + pen + eraser;

        System.out.println("Total cost of 3 items is: " + Total_items);

        float new_Total_Items = Total_items + (0.18f * Total_items);

        System.out.print("New Total cost of 3 items is: " + new_Total_Items);
    }
}

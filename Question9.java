// Q. Check if a student will pass or fail


import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        String Report_Card = (marks >= 33)? "PASS" : "FAIL";
        System.out.println(Report_Card);

        sc.close();
    }
}

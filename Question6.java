// Q. Print if number is Odd or Even


import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given Number is Odd");

            sc.close();
        }
    }
}

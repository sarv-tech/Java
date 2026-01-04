import java.util.*;

class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your first Number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter Your second Number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.print("Sum of " + a + " + " + b + " is " + sum);

        sc.close();

    }
}

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Your Second Number: ");
        int b = sc.nextInt();
        
        int product = a * b;
        System.out.print("The Product of "+ a + "*" + b + " is: " + product);

    
        sc.close();
    }
}

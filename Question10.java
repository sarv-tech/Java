
// Make calculator using Switch Case Statement


import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A = ");
        int A = sc.nextInt();

        System.out.print("Enter B = ");
        int B = sc.nextInt();

        System.out.print("Enter Operator: ");
        char Operator = sc.next().charAt(0);

        switch (Operator){

            case '+': System.out.println(A + B);
            break;

            case '-': System.out.println(A - B);
            break;

            case '*': System.out.println(A * B);
            break;

            case '/': System.out.println(A / B);
            break;

            case '%': System.out.println(A % B);
            break;

            default: System.out.println("Wrong Operator");
        }
    }
}

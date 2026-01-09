// Q. Print number from 1 to n


import java.util.*; 

public class Question16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        int count = 1;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        while(count <= n) {
            System.out.print(count + " ");
            count++;
        }

        sc.close();
    }
}

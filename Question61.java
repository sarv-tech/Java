// Q. WAP to Print PYRAMID Pattern

/*

    1 
   121 
  12321 
 1234321 
123454321


*/


import java.util.*;

public class Question61 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Size of Pattern: ");
        int n = sc.nextInt(); 

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n-i; j++) {

                System.out.print(" ");
            }

            int num = 1;

            for(int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print(num);

                if(j < i) {

                    num++;
                }
                else {

                    num--;
                }
            }

            System.out.println();

            sc.close();
        }
    }
}

// How to Take an Input of an Array


import java.util.*;

public class input_Array {
    public static void main(String[] args) {

        int n = 5;

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
            
        }

        System.out.print("Arrays Displayed: ");

        for(int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");

            sc.close();
        }
    }
}

/* 
Time Complexity :       O(n)     +      O(n)    =   O(n)
                        Array          Display
                        input loop     Array loop


Space Complexity: O(n)   ---> Because we Declare Array of n Size

*/

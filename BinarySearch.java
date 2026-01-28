// Binary Search:-

// Prerequisite - Sorted arrays

/*

key = 10

| 2 | 4 | 6 | 8 | 10 | 12 | 14 | 
  0   1   2   3   4    5    6    -----> index


PseudoCode:-

start = 0, end = n - 1

while(start <= end)

        find mid = (start + end) / 2

        Compare mid & Key

        mid == key    FOUND
        mid > key     LEFT  (1st half)
        mid < key     RIGHT (2nd half)


*/

import java.util.*;

public class BinarySearch {

    public static int binarySearch(int num[], int key) {

        int start = 0, end = num.length-1;

        while(start <= end) {

            int mid = (start + end) / 2;

            // Comparisons
            if(num[mid] == key) {

                return mid;
            }
            if(num[mid] < key) {

                start = mid + 1;   // right (2nd half)
            }
            else { 

                end = mid - 1;    // left (1st half)
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
        
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Key which you have to find: ");
        int key = sc.nextInt();

        int index = binarySearch(num, key);

        if(index != -1) {

            System.out.println("Element found at index " + index);
        }
        else {

            System.out.println("Element is Absent");

            sc.close();
        }
    }
}


/*

Time Complexity:-

Iteration 1 -----> n ----> n/2^0
Iteration 2 -----> n/2 ---> n/2^1
Iteration 3 -----> n/4 ---> n/2^2
Iteration 4 -----> n/8 ---> n/2^3
                    .        .
                    .        .
                    .        .
                    .        .
                    1        n/2^k = 1 (k + 1)th iteration


n/2^k = 1 => n = 2^k => k = log2n

Time Complexity is directly propotional to log2n

Time Complexity = O(log n)


*/
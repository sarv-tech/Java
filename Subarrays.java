// Print Subarrays and calculate Total pairs

// A subarray is a continuous part of an array.

/* Brute Force approach

| 2 | 4 | 6 | 8 | 10 | 
  0   1   2   3   4    ----> index

*/

public class Subarrays {

    public static void printSubarrays(int nums[]) {

        int ts = 0;
        
        for(int i = 0; i < nums.length; i++) {

            int start = i;

            for(int j = i; j < nums.length; j++) {

                int end = j;

                for(int k = start; k <= end; k++) {

                    System.out.print(nums[k] + " ");

                }

                ts++;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total Subarrays: " + ts);
    }
    public static void main(String[] args) {
        
        int nums[] = {2, 4, 6, 8, 10};
        printSubarrays(nums);
    }
}

// Time Complexity : n(n+1)/2 ≈ O(n²)
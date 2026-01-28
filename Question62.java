/* Brute force approach

Q. Given an integer array arr of size n, write a Java program to:

Print all possible subarrays of the given array.

| 1 | -2 | 6 | -1 | 3 |

1. Calculate and print the sum of each subarray.

2. Find and print:
a. the maximum subarray sum
b. the minimum subarray sum

*/


public class Question62 {

    public static void sumSubarray(int nums[]) {

        int ts = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            int start = i;

            for(int j = i; j < nums.length; j++) {

                int end = j;
                int sum = 0;

                for(int k = start; k <= end; k++) {

                    System.out.print(nums[k] + " ");
                    sum = sum + nums[k];
                }

                System.out.print(" sum = " + sum);
                System.out.println();

                if(sum > maxSum) {

                    maxSum = sum;
                }

                if(sum < minSum) {

                    minSum = sum;
                }

                ts++;
            }

            System.out.println();
        }

        System.out.println("Total Subarrays: " + ts);
        System.out.println("Total Minimum sum Subarrays: " + minSum);
        System.out.println("Total Maximum sum Subarrays: " + maxSum);

    }
    public static void main(String args[]) {

        int nums[] = {1, -2, 6, -1, 3};

        sumSubarray(nums);

    }
}


// Time Complexity : O(n³) --> Since there are three nested loops and in the worst case each loop runs n times
// Max Subarray Sum - III (Kadane's Algorithm)

// Optimal Approach

public class maxSubarraySum_III {

    public static void Kadane(int nums[]) {

        int maxSum = Integer.MIN_VALUE;  // if all elements are negative in array then maxSum = nums[0];
        int currSum = 0;

        for(int i = 0; i < nums.length; i++) {

            currSum += nums[i];  

            maxSum = Math.max(currSum, maxSum);   // Compare current sum with max sum and store it which will be maximum.
            
            if(currSum < 0) {

                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray sum is: " + maxSum);

    }
    public static void main (String args[]) {

        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        Kadane(nums);

    }
}
// Time Complexity : O(n) ---> only one loop is applied running till n




/* When all elements in array is negative then Use this approach

class Solution {
    public int maxSubarraySum(int nums[]) {

        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}


*/
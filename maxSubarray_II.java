// Maximum Subarray Sum 

// 2nd approach


public class maxSubarray_II {

    public static void maxSubarraySum (int nums[]) {

        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        // Calculate prefix array
        for(int i = 1; i < prefix.length; i++) {

            prefix[i] = prefix[i - 1] + nums[i];

        }

            for(int i = 0; i < nums.length; i++) {

                int start = i;

                for(int j = i; j < nums.length; j++) {

                    int end = j;

                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                    if(maxSum < currSum) {

                        maxSum = currSum;
                    }

                }

            }

            System.out.println("max Sum = " + maxSum);
        }
    public static void main(String[] args) {

        int nums[] = {1, -2, 6, -1, 3};

        maxSubarraySum(nums);
    }
}


// Time Complexity : O(n²) - Two nested loops

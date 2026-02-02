// Two Sum

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/

// Brute Force 
import java.util.*;

public class twoSum {

    public static int[] Sum(int nums[], int target) {

        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = i + 1; j < n; j++) {

                if(nums[i] + nums[j] == target) {

                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]) {

        int nums[] = {1, 4, 6, 0, 7, 8};
        
        System.out.println(Arrays.toString(Sum(nums, 14)));

    }
}

// Time Complexity: O(n²), Space Complexity: O(1)
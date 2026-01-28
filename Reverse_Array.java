// Reverse of an Array

/* Optimized Approach

| 2 | 4 | 6 | 8 | 10 | 
 F1  F2 F3,L3 L2   L1  ---> swap first and last index 

*/


public class Reverse_Array {

    public static void reverse(int nums[]) {

        int first = 0, last = nums.length - 1;

        while(first < last) {

            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {

        int nums[] = {2, 4, 6, 8, 10};

        reverse(nums);

        for(int i = 0; i < nums.length; i++) {

            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}


// Time Complexity : O(n)  &  Space Complexity : O(1)
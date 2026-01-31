// Product of Array Except Self


// Brute force Approach  - Time Complexity: O(n²)
import java.util.Arrays;

public class ProductOfArray {

    public static int[] productofArray_exceptSelf(int nums[]) {

        int n = nums.length;

        int res[] = new int[n];

        for(int i = 0; i < n; i++) {

            int product = 1;

            for(int j = 0; j < n; j++) {

                if(j != i) {

                product = product * nums[j];

                }
            }

            res[i] = product;
        }
        
        return res;       
    }
    public static void main(String[] args) {
        
        int nums[] = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(productofArray_exceptSelf(nums)));
    }
}
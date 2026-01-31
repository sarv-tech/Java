// Majority Element

/*

1. Initial majority element nums[0]th index se lena hai aur lead = 1 set karo.

2. Agar nums[index] majority element ke barabar hai, toh lead ko 1 se badha do.

3. Agar nums[index] majority element ke barabar nahi hai, aur lead positive hai (lead > 0), toh lead ko 1 se kam kardo.

4. Agar nums[index] majority element ke barabar nahi hai, aur lead zero hai (lead == 0), toh uss nayi value ko hi naya majority banao aur lead = 1 kardo.

*/



// Optimized Approach - Time Complexity : O(n), Space Complexity : O(1)
public class majorityElement {

    public static int Majority(int nums[]) {

        int n = nums.length;

        int majority = nums[0], lead = 1;

        for(int i = 1; i < n; i++) {

            if(nums[i] == majority) {

                lead++;
            }

            else if(lead > 0) {

                lead--;
            }

            else {

                majority = nums[i];
            }
        }
        return majority;
        
    }
    public static void main(String[] args) {
        
        int nums[] = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(Majority(nums));
    }
}

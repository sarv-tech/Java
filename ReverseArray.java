// Reverse of an Array:- 

// 2nd Approach 
public class ReverseArray {
    public static void main(String[] args) {
        
        int nums[] = {10, 20, 30, 40, 50};

        int n = 5;
        int rev[] = new int[n];

        for(int i = 0; i < n; i++) {

            rev[n - 1 - i] = nums[i];
        }

        for(int i = 0; i < n; i++) {

            System.out.print(rev[i] + " ");
        }
    }
}
// Contains Duplicate


// Brute force approach - Time Complexity: O(n²)
import java.util.*;

public class containsDuplicate {

    public static boolean Duplicate(int nums[]) {
        
        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = i + 1; j < n; j++) {

                if(nums[i] == nums[j]) {

                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Array Size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.print("Enter an Array Elements: ");

        for(int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();
        }

        System.out.println(Duplicate(nums));
    }
}

// Pairs in Array:-

/*

| 2 | 4 | 6 | 8 | 10 |

*/

public class Pairs_Array {

    public static void PrintPairs(int nums[]) {

        int totalPairs = 0;
        
        for(int i = 0; i < nums.length; i++) {

            int curr = nums[i];

            for(int j = i + 1; j < nums.length; j++) {

                System.out.print("(" + curr + "," + nums[j] + ") ");
                totalPairs++;
            }

            System.out.println();
        }

        System.out.println("Total Pairs of Array: " + totalPairs);
    }
    public static void main(String[] args) {
        
        int nums[] = {2, 4, 6, 8, 10};

        PrintPairs(nums);

    }
}

// Time Complecity: O(n²)  because we applied nested loop, n + (n-1) + (n-1) + (n-3) +.....+ 1

/*
How to Calculate Total pairs: elements n = 5 

Tp  = n(n - 1) / 2
    = 5 (4) / 2 = 10 pairs

*/
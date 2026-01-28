// Largest Number in an Array:-

/*

Find the largest number in a given array

| 1 | 2 | 6 | 3 | 5 |
  0   1   2   3   4  ----> index

*/


public class LargestNumber {

    public static int getLargest(int num[]) {

        int largest = Integer.MIN_VALUE;   // - ∞ --> Integer.MIN_VALUE --> very small number
        int smallest = Integer.MAX_VALUE;  // + ∞ --> Integer.MAX_VALUE --> very large number

        for(int i = 0; i < num.length; i++) {

            if(largest < num[i]) {

                largest = num[i];
            }
            
            if(smallest > num[i]) {

                smallest = num[i];
            }
        }
        System.out.println("Smallest Value is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        
        int num[] = {1, 2, 6, 3, 5};
        System.out.println("Largest Value is: " + getLargest(num));
    }
}


/* Q. For a given set of Strings, print the largest string.

"apple", "mango", "banana"

*/

// TC: O(xn)
public class Question65 {
    public static void main(String args[]) {

        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];

        int n = fruits.length;

        for(int i = 1; i < n; i++) {

            if(largest.compareTo(fruits[i]) < 0) {

                largest = fruits[i];
            } 
        }

        System.out.println(largest);
    }
}

// str1.compareTo(str2) ----> 0 : equal, < 0 : -ve (str1 < str2), > 0: +ve (str1 > str2)
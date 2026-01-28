// Linear Search:- Find the index of element in a given array.

/*   Key = 10

| 2 | 4 | 6 | 8 | 10 | 12 | 14 | 16 |
  0   1   2   3    4   5    6    7    ----> index

*/


import java.util.*;

public class LinearSearch {

    public static int linearSearch(int num[], int key) {

        for(int i = 0; i < num.length; i++) {

            if(num[i] == key) {

                return i;
            }
        }

        return -1; 
    }
    public static void main(String[] args) {
        
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Key: ");
        int key = sc.nextInt();

        int index = linearSearch(num, key);

        if(index == -1) {

            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("key Found at index: " + index);

            sc.close();
        }
    }
}


// Time Complexity: O(n)   because har ek element arrays mein humne iterate karke check kiya loop se ki 'key' match karaiye ki nai 

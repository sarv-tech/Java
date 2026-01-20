// Q. WAP to Print SOLID RHOMBUS Pattern


/*

                                space = (n - i)
    *****          i = 1        space = 4             stars = 5
   *****           i = 2        space = 3             stars = 5
  *****            i = 3        space = 2             stars = 5
 *****             i = 4        space = 1             stars = 5
*****              i = 5        space = 0             stars = 5

1. Outer loop:- 
n = 5
for(int i = 1; i <= n; i++)

2. line (i)
spaces + stars
spaces = (n - i) (j = 1 to n-i)

3. stars = n (j = 1 to n)

*/


public class Question56 {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= (5 - i); j++) {

                System.out.print(" ");
            }
            for(int j = 1; j <= 5; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

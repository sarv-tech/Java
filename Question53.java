// Q. WAP to Print INVERTED & ROTATED HALF-PYRAMID

/*
            *        i = 1          spaces = 3    stars = 1
        *   *        i = 2          spaces = 2    stars = 2
   *    *   *        i = 3          spaces = 1    stars = 3
*  *    *   *        i = 4          spaces = 0    stars = 4

Total rows (n) = 4
row no. (i) / line = stars

1. Outer Loop
lines: 4 (1 to 4)

2. Inner loop
Spaces + stars

spaces = n - i = 4 - i


*/


public class Question53 {
    public static void main(String[] args) {

        int n = 4;

        // outer loop → rows
        for(int i = 1; i <= n; i++) {

            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}

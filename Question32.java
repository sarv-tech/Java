// Q. Print HALF-PYRAMID pattern

/*

1                 ---> line 1 (from 1 to 1)
1  2              ---> line 2 (from 1 to 2)
1  2  3           ---> line 3 (from 1 to 3)
1  2  3  4        ---> line 4 (from 1 to 4)

(1) lines are 4
outer loop ---> 4 times

(2) number of times (line) 
inner loop ---> line times

(3) print number (inner loop count) 


*/


public class Question32 {
    public static void main(String[] args) {
        
        for(int line = 1; line <= 4; line++) {

            for(int num = 1; num <= line; num++) {

                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}

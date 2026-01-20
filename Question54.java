// Q. WAP to Print 0-1 Triangle 

/*

1                     i = 1            j = 1 to 1
0  1                  i = 2            j = 1 to 2
1  0  1               i = 3            j = 1 to 3
0  1  0  1            i = 4            j = 1 to 4
1  0  1  0  1         i = 5            j = 1 to 5


outer loop:-
Total n = 5 lines
for(int i = 1; i <= n; i++)

each line:-
for(int j = 1; j <= i; j++)

(row + col)
(i + j) --> even ---> "1"
(i + j) --> odd --->  "0"

*/


public class Question54 {
    public static void main(String args[]) {

        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= i; j++) {

                if((i + j) % 2 == 0) {

                    System.out.print(" 1 ");
                }

                else {
                    System.out.print(" 0 ");
                }
            }

            System.out.println();
        }
    }
}

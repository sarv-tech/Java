// Q. print INVERTED HALF-PYRAMID with Numbers pattern

/*

1  2  3  4  5
1  2  3  4
1  2  3
1  2
1


*/

public class Question34 {
    public static void main(String[] args) {
        
        for(int line = 5; line >= 1; line--) {

            for(int num = 1; num <= line; num++) {

                System.out.print(num + " ");
                
            }

            System.out.println();
        }
    }
}

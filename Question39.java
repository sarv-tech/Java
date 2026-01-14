// Q. print the following pattern

/*

1  2  3  4  5
   2  3  4  5
      3  4  5
         4  5
            5

*/


public class Question39 {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++) {

            for(int x = 1; x < i; x++) {

                System.out.print(" ");
            }

            for(int j = i; j <= 5; j++) {

                System.out.print(j);
            }

            System.out.println();
        }
    }
}

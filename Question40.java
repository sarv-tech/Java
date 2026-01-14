// Q. Print the following pattern

/*

5  4  3  2  1
   4  3  2  1
      3  2  1
         2  1
            1

*/


public class Question40 {
    public static void main(String[] args) {
        
        for(int i = 5; i >= 1; i--) {

            for(int x = 5; x > i; x--) {

                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--) {

                System.out.print(j);
            }

            System.out.println();
        }
    }
}

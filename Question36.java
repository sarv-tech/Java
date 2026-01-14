// Q. Print the Following pattern

/*

5                     i = 5 (from 5 to 5)
5  4                  i = 4 (from 5 to 4)
5  4  3               i = 3 (from 5 to 3)
5  4  3  2            i = 2 (from 5 to 2)
5  4  3  2  1         i = 1 (from 5 to 1)


*/


public class Question36 {
    public static void main(String[] args) {
        
        for(int i = 5; i >= 1; i--) {

            for(int j = 5; j >= i; j--) {

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
// Q. Print STAR pattern

/*

*                   -----> 1 star, print (1st line)
*  *                -----> 2 star, print (2nd line)
*  *  *             -----> 3 star, print (3rd line)
*  *  *  *          -----> 4 star, print (4th line)


(1) lines are 4
outer loop ---> 4 times

(2) number of times (i) 
inner loop ---> i times

(3) what to print?
" * "

jitne lines hai utne star hai

*/


public class Question30 {
    public static void main(String[] args) {
        
        for(int line = 1; line <= 4; line++) {

            for(int star = 1; star <= line; star++){

                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

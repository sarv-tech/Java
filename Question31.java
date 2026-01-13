// Q. Print INVERTED-STAR pattern

/*

*  *  *  *
*  *  *
*  *
*

jitne line kam utne star jyada
lines kam hai star se

*/

public class Question31 {
    public static void main(String[] args) {

        for(int line = 1; line <= 4; line++) {

            for(int star = 4; star >= line; star--) {

                System.out.print(" * ");
        }
        System.out.println();
    }

    }
}

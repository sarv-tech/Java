// do-while Loop:-

/* Syntax:-

do {

do something


} while(condition);

*/


// Print Hello World 10 times using do-while loop
package Loops;

public class do_while_loop {
    public static void main(String[] args) {

        int count = 1;
        
        do { 
            System.out.println("Hello World");
            count++;
            
        } while (count <= 10);
    }
}


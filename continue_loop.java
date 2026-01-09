// Continue Statement in java:- To Skip an Iteration


package Loops;

public class continue_loop {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            else if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}

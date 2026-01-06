// Ternary Operator:-

/*

It has 3 operands

Syntax:- 

variable = condition? statement1 : statement2;

*/


public class Ternary_Operator {
    public static void main(String[] args) {
        
        int larger = (5 > 3)? 5 : 3;
        System.out.println(larger);

        String type = (5 % 2 == 0)? "even" : "odd";
        System.out.println(type);
    }
}

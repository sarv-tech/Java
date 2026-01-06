// else if Statements:-

/*

Syntax:- 

if(condition 1){

}
else if(condition 2){

}
else{

}

*/

import java.util.*;

public class else_if{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Age Of a Person: ");
        int Age = sc.nextInt();

        if(Age >= 18){
            System.out.println("Adult: You can Drive & Vote");
        }
        else if(Age >= 13 && Age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult : You Cannot Drive & Vote");
        }
    }
}
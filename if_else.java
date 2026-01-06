// If-else Statements:-

/*

Syntax:-

if(condition){

}

else{
}

*/

import java.util.*;

public class if_else{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Age Of a Person: ");
        int Age = sc.nextInt();

        if(Age >= 18){
            System.out.println("Adult: You can Drive & Vote");
        }
        if(Age >= 13 && Age <= 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult : You Cannot Drive & Vote");
        }
    }
}
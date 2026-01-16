// Functions/Methods:-  a function is referred to as a method. A method is a block of code/reusable within a class that is designed to perform a specific task and only runs when it is called. 

// function ek block of code hota hai matlab code ka ek block hota hai group hota hai joh ek particular kaam ko perform karta hai aur woh particular task ko hum baar-baar usse karwa sakte hai matlab jab bhi mujhe koi kaam karwana hoga tab baar-baar uss ko call kar sakte hai. 

/*

Syntax:-

returnType name() {

body

return statement;

}

*/

public class Intro {

    public static int PrintHelloworld() {
        
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello world");

        return 3;

    }
    public static void main(String[] args) {
        
        PrintHelloworld();      // function call
    }
}
// Function Overloading:- In same class we made Multiple functions with the same name but different parameters.

// Function Overloading (Using Parameters):- Function Overloading sirf parameters pe depend karti hai return type pe bilkul dependent nahi hai. 

/*

E.g.:- f1: Sum of 2 number       int Sum(int a, int b) {
                                    return a + b;
                                }

f2: Sum of 3 number             int Sum(int a, int b, int c) {
                                        return a + b + c;
                                    }

*/


public class function_overloading {

// func to calc sum of 2 nums
    public static int sum(int a, int b) {

        return a + b;
    }

// func to calc sum of 3 nums
    public static int sum(int a, int b, int c) {

        return a + b + c;
        
    }
    public static void main(String[] args) {
        
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 1));

    }
}


// Function Overloading (Using Data Types):- 

/*

E.g.:-  f1: add 2 int val             int sum(int a, int b) {
                                            return a + b;
                                        }


f2: add 2 float val           float sum(float a, float b) {
                                        return a + b;
                                    }

*/
// Unary Operator in Java:-

/*

++ => Increment   eg. a = a + 1
-- => Decrement   eg. a = a - 1


Pre Increment:- ++a                        |                   Pre Decrement:- --a
                                           |
pre ka matlab hai pehle                    |                  1. Value change 
1. sabse pehle value change hogi           |                  2. Value use
2. uske baad value use hogi                |
--------------------------------------------------------------------------------------------                                             |
Post Increment:- a++                       |                  Post Decrement:- a--
                                           |
post ka matlab hai baad mein               |                   1. Value use
1. sabse pehle value use hogi              |                   2. Value Change
2. uske baad value change hogi             |
                                           |
*/



public class Unary_operator{
    public static void main(String[] args) {
        
        int a = 10;
        int b = ++a;

        int c = 14;
        int d = c++;

        int e = 17;
        int f = --e;

        int g = 20;
        int h = g--;


        System.out.println(a);
        System.out.println(b);

        System.out.println(c);
        System.out.println(d);

        System.out.println(e);
        System.out.println(f);

        System.out.println(g);
        System.out.println(h);

    }

}

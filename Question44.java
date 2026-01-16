// Q. WAP to Find Binomial Coefficient


/*

Formula:-

nCr = n! / r!(n - r)!

*/

public class Question44 {

    public static int factorial(int n) {

        int fact = 1;

        for(int i = 1; i <= n; i++) {

            fact = fact * i;
        }

        return fact;
    }

    public static int BinCoeff(int n, int r) {


        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int BinCoeff = fact_n / (fact_r * fact_nmr);
        return BinCoeff;
        
    }
    public static void main(String[] args) {

        System.out.println(BinCoeff(5, 2));
        
    }
}

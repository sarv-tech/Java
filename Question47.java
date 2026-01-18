// Q. Print all Primes in a Range


public class Question47 {

    public static boolean isPrime(int num) {

        if(num <= 1) {

            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {

            if(num % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static void primesInRange(int n) {
        
        for(int i = 2; i <= n; i++) {

            if(isPrime(i)) {
                System.out.print(i + " "); // print in same line
            }
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        
        primesInRange(20);

    }
}

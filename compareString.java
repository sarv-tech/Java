// Comparison of Strings

public class compareString {
    
    public static void main(String[] args) {

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2) {

            System.out.println("String s1 and s2 are equals");
        }
        else {
            System.out.println("String s1 and s2 are not equals");
        }

        if(s1 == s3) {

            System.out.println("String s1 and s3 are equals");
        }
        else {

            System.out.println("String s1 and s3 are not equals");
        }

        if(s1.equals(s3)) {

            System.out.println("String s1 and s3 are equals");
        }
        else {
            System.out.println("String s1 and s3 are not equals");
        }
    }
}

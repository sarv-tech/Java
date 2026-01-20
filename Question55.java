// Q. WAP to Print BUTTERFLY Pattern


public class Question55 {
    public static void main(String[] args)
    {

        // upper half
        for(int i = 1; i <= 4; i++)
        {
            // star - i
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            //Spaces - 2 * (n - i)
            for(int j = 1; j <= 2*(4-i); j++)
            {
                System.out.print(" ");
            }
            //Stars - i
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i = 4 - 1; i >= 1; i--)
        {
            // star - i
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            //Spaces - 2 * (n - i)
            for(int j = 1; j <= 2*(4-i); j++)
            {
                System.out.print(" ");
            }
            //Stars - i
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
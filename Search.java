// Search an element of matrix in 2D Arrays


import java.util.*;

public class Search {

    public static boolean searchMatrix(int matrix[][], int key) {

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(matrix[i][j] == key) {

                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;

                }
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        // Taking matrix input
        System.out.println("Enter matrix elements:");

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();

            }
        }

        // Taking key input
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        searchMatrix(matrix, key);
        
    }
}
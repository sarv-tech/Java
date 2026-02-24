// Transpose of a Matrix

// It is valid for Square matrix only and without taken as a new matrix
public class transpose {

    public static int[][] transposeMatrix(int matrix[][]) {

        int n = matrix.length;

        int curr_r = 0;
        int curr_c = 0;

        while(curr_r < n) {

            int i = curr_r;

            for(int j = curr_c; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

            curr_r ++;
            curr_c ++;

        }

        return matrix;
        
    }
}

// TC: O(n^2)

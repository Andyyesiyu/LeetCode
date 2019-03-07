class Solution {
    public void setZeroes(int[][] matrix) {
        // If matrix[i][j] is 0, we make matrix[i][0] and matrix[0][j] zero.
        // matrix[0][0] checks row0, and we define another variable col0 to check col0.
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col0 = 1;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0)
                col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0)
                matrix[i][0] = 0;
        }
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        // Swap rows upside down
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[rows - i - 1];
            matrix[rows - i - 1] = temp;
        }

        // in-place transpose
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
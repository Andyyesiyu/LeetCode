class Solution {
    public void setZeroes(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        boolean[] rows = new boolean[numRows];
        boolean[] cols = new boolean[numCols];

        // Traverse the matrix.
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Set zeros for rows.
        for (int i = 0; i < numRows; i++) {
            if (rows[i]) {
                for (int j = 0; j < numCols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set zeros for cols.
        for (int j = 0; j < numCols; j++) {
            if (cols[j]) {
                for (int i = 0; i < numRows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
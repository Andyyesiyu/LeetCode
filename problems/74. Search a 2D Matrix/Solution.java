class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[rows - 1][cols - 1]) {
            return false;
        }
        // Binary search through rows, then binary search columns.
        int lowRow = 0;
        int highRow = rows - 1;
        int thisRow = -1;
        while (lowRow <= highRow) {
            int midRow = (lowRow + highRow) / 2;
            if (midRow == rows - 1) {
                thisRow = rows - 1;
                break;
            } else if (matrix[midRow][0] == target) {
                return true;
            } else if (matrix[midRow + 1][0] == target) {
                return true;
            } else if (matrix[midRow][0] < target && matrix[midRow + 1][0] > target) {
                thisRow = midRow;
                break;
            } else if (matrix[midRow][0] > target) {
                highRow = midRow - 1;
            } else if (matrix[midRow + 1][0] < target) {
                lowRow = midRow + 1;
            }
        }

        // Search through thisRow;
        int lowCol = 0;
        int highCol = cols - 1;
        while (lowCol <= highCol) {
            int midCol = (lowCol + highCol) / 2;
            int element = matrix[thisRow][midCol];
            if (element == target) {
                return true;
            } else if (element < target) {
                lowCol = midCol + 1;
            } else if (element > target) {
                highCol = midCol - 1;
            }
        }
        return false;
    }
}
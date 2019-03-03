class Solution {
    // Treat the whole matrix as a 1-D list to do binary search.
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int low = 0;
        int high = (matrix[0].length * matrix.length) - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            int[] rowCol = getRowCol(mid, matrix[0].length);
            int midElem = matrix[rowCol[0]][rowCol[1]];
            if (midElem == target) {
                return true;
            }
            if (midElem > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    private int[] getRowCol(int no, int n) {
        return new int[] { no / n, no % n };
    }
}
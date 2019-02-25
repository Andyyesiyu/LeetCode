class Solution {
    public int[][] transpose(int[][] A) {
        if (A == null) {
            return null;
        }
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
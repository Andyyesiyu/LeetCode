class Solution {
    // Only faster than 7.32%
    public int numTrees(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int left, right;
            if (i == 1) {
                left = 1;
            } else {
                left = numTrees(i - 1);
            }
            if (i == n) {
                right = 1;
            } else {
                right = numTrees(n - i);
            }
            result += left * right;
        }
        return result;
    }
}
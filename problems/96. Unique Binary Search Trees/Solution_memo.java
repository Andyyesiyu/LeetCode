class Solution {

    public int numTrees(int n) {
        if (n < 1) {
            return 0;
        }
        int[] memo = new int[n];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {
        if (memo[n - 1] != 0) {
            return memo[n - 1];
        }
        if (n == 1 || n == 2) {
            memo[n - 1] = n;
            return n;
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int left, right;
            if (i == 1) {
                left = 1;
            } else {
                left = helper(i - 1, memo);
            }
            if (i == n) {
                right = 1;
            } else {
                right = helper(n - i, memo);
            }
            result += left * right;
        }
        memo[n - 1] = result;
        return result;
    }
}
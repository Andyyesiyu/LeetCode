class Solution {
    private int[] memo;

    public int climbStairs(int n) {
        if (memo == null) {
            memo = new int[n];
        }
        if (n < 0) {
            return 0;
        } else if (n <= 1) {
            return 1;
        }
        if (memo[n - 1] == 0) {
            memo[n - 1] = climbStairs(n - 1);
        }
        if (memo[n - 2] == 0) {
            memo[n - 2] = climbStairs(n - 2);
        }
        return memo[n - 1] + memo[n - 2];
    }

}
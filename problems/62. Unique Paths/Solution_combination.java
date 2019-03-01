class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1 || m == 2 && n == 1 || m == 1 && n == 2) {
            return 1;
        }
        int stepsRight = m - 1;
        int stepsDown = n - 1;
        int total = stepsRight + stepsDown;
        // Final result should be C(total, stepsRight) == C(total, stepsDown);
        return C(total, stepsRight < stepsDown ? stepsRight : stepsDown);
    }

    private int C(int a, int b) {
        long res = 1;
        for (int i = 1; i <= b; i++) {
            // This always result in integer.
            /*
             * While 53/3 is decimal, C(50, 100) = C(49, 100) * 51 / 50 and there is no
             * decimal in this calculation. And the original author's solution is to
             * calculate C(2, 100) from C(1, 100), C(3, 100) from C(2, 100), ..., C(50, 100)
             * from C(49, 100) and so on.
             */
            res = res * (a - b + i) / i;
        }
        return (int) res;
    }
}
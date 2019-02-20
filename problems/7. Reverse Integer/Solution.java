class Solution {
    public int reverse(int x) {
        StringBuilder result = new StringBuilder();
        if (x < 0) {
            result.append('-');
            x = -x;
        }
        while (x != 0) {
            int digit = x % 10;
            result.append(String.valueOf(digit));
            x = x / 10;
        }

        int r;

        try {
            r = Integer.parseInt(result.toString());
        } catch (Exception e) {
            r = 0;
        }
        return r;
    }
}
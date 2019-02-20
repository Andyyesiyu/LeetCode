class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int p, q;
        p = 0;
        q = height.length - 1;
        int tempMax = 0;
        while (p < q) {
            int current = calcArea(height[p], p, height[q], q);
            if (current > tempMax) {
                tempMax = current;
            }
            if (height[p] > height[q]) {
                q--;
            } else {
                p++;
            }
        }
        return tempMax;
    }

    private int calcArea(int x, int indexX, int y, int indexY) {
        return Math.abs(Math.min(x, y) * (indexX - indexY));
    }
}
class Solution {
    // N^2
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int tempMax = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int current = calcArea(height[i], i, height[j], j);
                if (current > tempMax) {
                    tempMax = current;
                }
            }
        }
        return tempMax;
    }

    private int calcArea(int x, int indexX, int y, int indexY) {
        return Math.abs(Math.min(x, y) * (indexX - indexY));
    }
}
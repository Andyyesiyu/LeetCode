class Solution {
    public void sortColors(int[] nums) {
        int[] colorCount = new int[3];
        for (int color : nums) {
            colorCount[color]++;
        }
        int ptr = 0;
        for (int color = 0; color < colorCount.length; color++) {
            for (int j = 0; j < colorCount[color]; j++) {
                nums[ptr] = color;
                ptr++;
            }
        }
    }
}
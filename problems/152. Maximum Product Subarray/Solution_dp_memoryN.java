class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] maxEnds = new int[nums.length];
        int[] minEnds = new int[nums.length];
        maxEnds[0] = minEnds[0] = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEnds[i] = Math.max(nums[i], Math.max(maxEnds[i - 1] * nums[i], minEnds[i - 1] * nums[i]));
            minEnds[i] = Math.min(nums[i], Math.min(maxEnds[i - 1] * nums[i], minEnds[i - 1] * nums[i]));
            result = Math.max(maxEnds[i], result);
        }
        return result;
    }
}
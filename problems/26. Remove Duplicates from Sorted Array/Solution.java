class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        int realIndex = 1;
        for (int checkIndex = 1; checkIndex < nums.length; checkIndex++) {
            if (nums[checkIndex] == nums[checkIndex - 1]) {
                continue;
            } else {
                nums[realIndex++] = nums[checkIndex];
            }
        }
        return realIndex;
    }
}
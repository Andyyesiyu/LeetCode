class Solution {
    // However, this does not utilize the condition of sorted.
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 2) {
            return nums.length;
        }
        int scanPtr, buildPtr, lastTwo, last;
        scanPtr = buildPtr = 2;
        lastTwo = nums[0];
        last = nums[1];

        while (scanPtr < nums.length) {
            boolean thirdDup = (lastTwo == last && last == nums[scanPtr]);
            if (!thirdDup) {
                nums[buildPtr] = nums[scanPtr];
                buildPtr++;
            }
            lastTwo = last;
            last = nums[scanPtr];
            scanPtr++;
        }

        return buildPtr;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        // It is a DP problem.
        // The sub-problem is "What is the maximum subarray sum of nums[0:i] which MUST ends at i-1"
        // The relationship between maxSubArray(nums[0:i]) and maxSubArray(nums[0:i+1])
        // maxSubArray(nums[0:i+1]) = Math.max(maxSubArray(nums[0:i]) + nums[i],
        // nums[i])
        int result = nums[0];
        int maxSumEndsHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSumEndsHere = Math.max(maxSumEndsHere + nums[i], nums[i]);
            if (maxSumEndsHere > result) {
                result = maxSumEndsHere;
            }
        }
        return result;
    }
}
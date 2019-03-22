class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int lo = 0;
        int hi = nums.length - 1;

        // One element or without rotated.
        if (nums[lo] <= nums[hi]) {
            return nums[0];
        }

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            // Check whether found.
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[nums.length - 1]) {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
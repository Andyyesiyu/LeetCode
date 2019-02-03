class Solution {
    public int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int low = 0;
        int up = nums.length - 1;
        
        while (low <= up) {
            int middle = (low + up) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                up = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
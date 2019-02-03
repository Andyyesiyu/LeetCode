class Solution {
    public int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        return searchHelper(nums, 0, nums.length-1, target);
    }
    
    private int searchHelper(int[] nums, int low, int up, int target) {
        if (low > up) {
            return -1;
        }
        int middle = (low + up) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return searchHelper(nums, low, middle-1, target);
        } else {
            return searchHelper(nums, middle+1, up, target);
        }
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        // Time: O(N)
        if (nums == null) {
            return 0;
        }
        int n = nums.length;
        int ptr = 0;
        
        while (ptr < n) {
            if (nums[ptr] == val) {
                nums[ptr] = nums[n-1];
                n--;
            } else {
                ptr++;
            }
        }
        return n;
    }
}
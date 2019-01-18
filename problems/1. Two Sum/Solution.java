import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Key is num, value is its index.
        Map<Integer, Integer> map = new HashMap<>();
        int[] r = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (map.containsKey(target - currentNum)) {
                r[0] = map.get(target - currentNum);
                r[1] = i;
                return r;
            } else {
                map.put(currentNum, i);
            }
        }
        return r;
    }
}
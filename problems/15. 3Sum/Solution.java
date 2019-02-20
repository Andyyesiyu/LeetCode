class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) {
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length < 3) {
            return result;
        }
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // Set nums[i] as first element. Find the rest two using 2Sum;
            if (i == 0 || nums[i] != nums[i - 1]) {
                int goal = 0 - nums[i];
                int p = i + 1;
                int q = nums.length - 1;
                while (p < q) {
                    if (nums[p] + nums[q] == goal) {
                        List<Integer> newList = new LinkedList<>();
                        newList.add(nums[i]);
                        newList.add(nums[p]);
                        newList.add(nums[q]);
                        result.add(newList);
                        // Increment p, and avoid duplicates of nums[p]
                        do {
                            p++;
                        } while (p < nums.length && nums[p] == nums[p-1]);
                    } else if (nums[p] + nums[q] < goal) {
                        do {
                            p++;
                        } while (p < nums.length && nums[p] == nums[p-1]);
                    } else {
                        do {
                            q--;
                        } while (q >= 0 && nums[q] == nums[q+1]);
                    }
                }
            }
        }
        return result;
    }
}
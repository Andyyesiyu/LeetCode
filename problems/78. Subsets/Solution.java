class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null) {
            return result;
        }
        return helper(nums, nums.length);
    }

    private List<List<Integer>> helper(int[] nums, int first) {
        List<List<Integer>> result = new LinkedList<>();
        if (first == 0) {
            List<Integer> l = new LinkedList<>();
            result.add(l);
            return result;
        } else {
            // first > 0;
            List<List<Integer>> rest = helper(nums, first - 1);
            // Iterate.
            for (int i = 0; i < rest.size(); i++) {
                List<Integer> single = new LinkedList(rest.get(i));
                single.add(nums[first - 1]);
                result.add(single);
            }
            result.addAll(rest);
        }
        return result;
    }
}


            
                
            
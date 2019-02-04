class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return null;
        }
        List<List<Integer>> results = new LinkedList<>();
        
        // Base case.
        if (nums.length == 0) {
            List<Integer> toAdd = new LinkedList<>();
            results.add(toAdd);
            return results;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int head = nums[i];
            // O(N)
            int[] numsExclude = arrayExclude(nums, head);
            List<List<Integer>> permutes = permute(numsExclude);
            for (List<Integer> l : permutes) {
                l.add(0, head);
            }
            results.addAll(permutes);
        }
        
        return results;
    }
    
    private int[] arrayExclude(int[] nums, int exclude) {
        int[] result = new int[nums.length-1];
        int i = 0;
        for (int j = 0; j < result.length; j++) {
            if (nums[i] == exclude) {
                i++;
            }
            result[j] = nums[i];
            i++;
        }
        return result;
    }
}
class Solution {
    private boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        used = new boolean[nums.length];
        permuteHelper(result, new LinkedList<Integer>(), nums);
        return result;
    }
    
    private void permuteHelper(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new LinkedList<Integer>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (!used[i]) {
                    temp.add(num);
                    used[i] = true;
                    permuteHelper(result, temp, nums);
                    temp.remove(temp.size()-1);
                    used[i] = false;
                }
            }
        }
    }
}
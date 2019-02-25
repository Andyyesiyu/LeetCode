class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        helper(candidates, target, new LinkedList<Integer>(), result, 0);
        return result;
    }

    private void helper(int[] candidates, int target, List<Integer> curList, List<List<Integer>> result, int index) {
        if (target == 0) {
            result.add((LinkedList) ((LinkedList) curList).clone());
            return;
        } else if (target < 0) {
            return;
        } else {
            // target > 0
            for (int i = index; i < candidates.length; i++) {
                int num = candidates[i];
                curList.add(num);
                helper(candidates, target - num, curList, result, i);
                curList.remove(curList.size() - 1);
            }
        }
    }
}
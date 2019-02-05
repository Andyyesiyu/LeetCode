class Solution {
    /**
     * I think time complexity is (n select 0) + (n select 1) + ... + (n select k)
     */
    public List<List<Integer>> combine(int n, int k) {
        if (n < 1) {
            return new LinkedList<>();
        }
        List<List<Integer>> result = new LinkedList<>();
        combineHelper(n, k, result, new LinkedList<Integer>());
        return result;
    }
    
    private void combineHelper(int n, int k, List<List<Integer>> result, List<Integer> temp) {
        if (temp.size() == k) {
            result.add(new LinkedList<Integer>(temp));
        } else {
            int previous;
            if (temp.size() == 0) {
                previous = 0;
            } else {
                previous = temp.get(temp.size()-1);
            }
            for (int i = previous + 1; i <= n; i++) {
                temp.add(i);
                combineHelper(n, k, result, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
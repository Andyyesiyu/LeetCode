class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int e : nums) {
            a ^= e;
        }
        return a;
    }
}